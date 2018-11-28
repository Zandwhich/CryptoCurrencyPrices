package com.company.view.table_pane;

import javax.swing.*;
import java.util.Vector;

/**
 * TODO: Fill in
 */
abstract public class AbstractTablePane extends JScrollPane implements TablePaneInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The columns of the table
     */
    private Vector<String> columns;

    /**
     * The data within the table
     */
    private Vector<Vector<String>> data;

    /**
     * The table
     */
    private JTable table;


    /****************
     * Constructors *
     ****************/

    /**
     * AbstractTablePane constructor
     * @param columns The columns of the table
     * @param data The data of the table
     */
    public AbstractTablePane(final Vector<String> columns, final Vector<Vector<String>> data) {
        super(new JTable(data, columns));
        this.setup(columns, data);
    }//end AbstractTablePane


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Abstracted setup method to be used by all constructors
     * @param columns The columns of the table
     * @param data The data of the table
     */
    private  void setup(final Vector<String> columns, final Vector<Vector<String>> data) {
        this.columns = columns;
        this.data = data;
        this.table = (JTable) super.getViewport().getView();
    }//end setup()

    /* Public */

    // Getters

    /**
     * Gets the columns of the table
     * @return The columns of the table
     */
    @Override
    public Vector<String> getColumns() { return this.columns; }//end getColumns()

    /**
     * Gets the data of the table
     * @return The data of the table
     */
    @Override
    public Vector<Vector<String>> getData() { return this.data; }//end getData()

    /**
     * Gets the table
     * @return The table
     */
    public JTable getTable() { return this.table; }//end getTable()

    // Setters

    /**
     * Sets the columns
     * @param columns The header columns
     */
    public void setColumns(Vector<String> columns) {
        this.columns = columns;
        // TODO: Actually set the columns in the JTable (have to play around with this first)
    }//end setColumns()

    /**
     * Sets the data
     * @param data The data within the table
     */
    public void setData(Vector<Vector<String>> data) {
        this.data = data;
        // TODO: Actually set the data in the JTable (have to play around with this first)
    }//end setData()
}//end AbstractTablePane
