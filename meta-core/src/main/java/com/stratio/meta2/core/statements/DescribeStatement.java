/*
 * Licensed to STRATIO (C) under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. The STRATIO
 * (C) licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.stratio.meta2.core.statements;

import com.stratio.meta.common.result.CommandResult;
import com.stratio.meta.common.result.QueryResult;
import com.stratio.meta.common.result.Result;
import com.stratio.meta2.core.engine.EngineConfig;
import com.stratio.meta.core.metadata.MetadataManager;
import com.stratio.meta.core.structures.DescribeType;
import com.stratio.meta2.common.data.CatalogName;
import com.stratio.meta2.common.data.TableName;
import com.stratio.meta2.common.metadata.CatalogMetadata;
import com.stratio.meta2.core.validator.Validation;
import com.stratio.meta2.core.validator.ValidationRequirements;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that models a {@code DESCRIBE} statement from the META language.
 */
public class DescribeStatement extends MetaDataStatement implements ITableStatement {

  /**
   * Type of description required: {@code CATALOG} or {@code TABLE}.
   */
  private DescribeType type;

  /**
   * The target table.
   */
  private TableName tableName;

  /**
   * Class constructor.
   * 
   * @param type Type of element to be described.
   */
  public DescribeStatement(DescribeType type) {
    this.type = type;
    this.command = true;
  }

  /**
   * Get the type of element to be described.
   * 
   * @return A {@link com.stratio.meta.core.structures.DescribeType}.
   */
  public DescribeType getType() {
    return type;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder("DESCRIBE ");
    sb.append(type.name());

    if (type == DescribeType.CATALOG && catalog != null) {
      sb.append(" ").append(catalog);
    } else if (type == DescribeType.TABLE) {
      sb.append(" ").append(tableName);
    }

    return sb.toString();
  }

  /** {@inheritDoc} */
  @Override
  public Result validate(MetadataManager metadata, EngineConfig config) {

    Result result = QueryResult.createSuccessQueryResult();

    if (this.catalog != null) {
      CatalogMetadata ksMetadata = metadata.getCatalogMetadata(this.catalog);
      if (ksMetadata == null) {
        result = Result.createValidationErrorResult("Catalog " + this.catalog + " does not exist.");
      }
    }

    if (this.tableName != null) {
      result =
          validateCatalogAndTable(metadata, sessionCatalog, tableName.isCompletedName(), tableName
              .getCatalogName().getName(), tableName);
    }

    return result;
  }

  /**
   * Execute the describe command.
   *
   * @return A {@link com.stratio.meta.common.result.Result}.
   */
  public Result execute() {
    MetadataManager mm = new MetadataManager();
    mm.loadMetadata();
    Result result = null;
    if (type == DescribeType.CATALOG) {

      CatalogMetadata ksInfo = mm.getCatalogMetadata(getEffectiveCatalog());
      if (ksInfo == null) {
        result = Result.createExecutionErrorResult("KEYSPACE " + catalog + " was not found");
      } else {
        result = CommandResult.createCommandResult(ksInfo.toString());
      }
    } else if (type == DescribeType.CATALOGS) {
      List<String> catalogsNames = mm.getCatalogsNames();
      if (catalogsNames == null) {
        result = Result.createExecutionErrorResult("No catalogs found");
      } else {
        result = CommandResult.createCommandResult(catalogsNames.toString());
      }
    } else if (type == DescribeType.TABLE) {
      com.stratio.meta.common.metadata.structures.TableMetadata tableInfo =
          mm.getTableGenericMetadata(getEffectiveCatalog(), tableName);
      if (tableInfo == null) {
        result = Result.createExecutionErrorResult("TABLE " + tableName + " was not found");
      } else {
        result = CommandResult.createCommandResult(tableInfo.exportAsString());
      }
    } else {
      List<String> tablesNames = mm.getTablesNames(this.getEffectiveCatalog());
      if (tablesNames == null) {
        result = Result.createExecutionErrorResult("No tables found");
      } else {
        result = CommandResult.createCommandResult(tablesNames.toString());
      }
    }
    return result;
  }

  public List<CatalogName> getCatalogs() {
    List<CatalogName> result = new ArrayList<>();
    if (DescribeType.CATALOG.equals(type)) {
      result.add(new CatalogName(getEffectiveCatalog()));
    }
    return result;
  }

  public List<TableName> getTables() {
    List<TableName> result = new ArrayList<>();
    if (DescribeType.TABLE.equals(type)) {
      result.add(tableName);
    }
    return result;
  }

  @Override
  public ValidationRequirements getValidationRequirements() {
      ValidationRequirements validationRequirements=new ValidationRequirements();
      if (catalog!=null) {
          validationRequirements.add(Validation.MUST_EXIST_CATALOG);
          if (tableName!=null)
             validationRequirements.add(Validation.MUST_EXIST_CATALOG).add(Validation.MUST_EXIST_TABLE);
      }
      return validationRequirements;

  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  @Override
  public String getEffectiveCatalog() {
    String effective;
    if(tableName != null){
      effective = tableName.getCatalogName().getName();
    }else{
      effective = catalog;
    }
    if(sessionCatalog != null){
      effective = sessionCatalog;
    }
    return effective;
  }

}
