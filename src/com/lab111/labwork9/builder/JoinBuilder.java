package com.lab111.labwork9.builder;

import com.lab111.labwork9.models.tables.JoinResults;
import com.lab111.labwork9.models.tables.Table;
import com.lab111.labwork9.models.TableElement;

/**
 * Builder pattern interface for joins
 */
public interface JoinBuilder {

    /**
     * Adds table to list for joining
     *
     * @param table one of tables for joining
     * @return is addition successful
     */
    boolean addTable(Table<? extends TableElement> table);

    /**
     * Prepare join on added tables
     *
     * @return join result table
     */
    JoinResults join();
}
