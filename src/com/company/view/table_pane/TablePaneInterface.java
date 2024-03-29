package com.company.view.table_pane;

import java.util.Vector;

/**
 * The interface for all Table Panes
 */
public interface TablePaneInterface {

    /**
     * Gets the columns
     * @return The columns
     */
    Vector<String> getColumns();

    /**
     * Gets the data
     * @return The data
     */
    Vector<Vector<String>> getData();

    /**
     * Sets the header columns' names
     * @param columns The header columns
     */
    void setColumns(final Vector<String> columns);

    /**
     * Sets the data within the table
     * @param data The data within the table
     */
    void setData(final Vector<Vector<String>> data);

}
