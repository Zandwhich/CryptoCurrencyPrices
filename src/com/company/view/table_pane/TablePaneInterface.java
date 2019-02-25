package com.company.view.table_pane;

import java.util.Vector;

/**
 * TODO: Fill in
 */
public interface TablePaneInterface {

    // Getters

    /**
     * Gets the columns
     * @return The columns
     */
    public abstract Vector<String> getColumns();

    /**
     * Gets the data
     * @return The data
     */
    public abstract Vector<Vector<Object>> getData();


    // Setters

    /**
     * Sets the header columns' names
     * @param columns The header columns
     */
    public abstract void setColumns(Vector<String> columns);

    /**
     * Sets the data within the table
     * @param data The data within the table
     */
    public abstract void setData(Vector<Vector<Object>> data);

}//end TablePaneInterface
