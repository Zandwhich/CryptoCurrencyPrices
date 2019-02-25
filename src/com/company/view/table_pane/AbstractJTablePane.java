package com.company.view.table_pane;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

/**
 * TODO: Fill in
 */
abstract public class AbstractJTablePane extends JScrollPane implements TablePaneInterface {

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
    private Vector<Vector<Object>> data;

    /**
     * The table
     */
    private JTable table;

    // TODO: Allow for different types of data, not just "[String, String]"


    /****************
     * Constructors *
     ****************/

    /**
     * AbstractJTablePane constructor
     * @param columns The columns of the table
     * @param data The data of the table
     */
    public AbstractJTablePane(final Vector<String> columns, final Vector<Vector<Object>> data) {
        super();
        this.setup(columns, data);
    }//end AbstractJTablePane


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Abstracted setup method to be used by all constructors
     * @param columns The columns of the table
     * @param data The data of the table
     */
    private  void setup(final Vector<String> columns, final Vector<Vector<Object>> data) {
        this.columns = columns;
        this.data = data;
        this.table = new JTable(this.data, this.columns);
        this.table.setShowGrid(true);
        this.table.setGridColor(Color.LIGHT_GRAY);
        super.setViewportView(this.table);
    }//end setup()

    /**
     * Updates the internal data of the JTable by creating a new TableModel
     * @param data The data as a matrix of strings
     */
    private void updateData(Vector<Vector<Object>> data) {
        DefaultTableModel tableModel = new DefaultTableModel();
        for (int i = 0; i < this.table.getModel().getColumnCount(); i++) {
            tableModel.addColumn(this.table.getColumnName(i));
        }//end for columns
        for (Vector<Object> row : data) {
            tableModel.addRow(row);
        }//end for rows

        this.table.setModel(tableModel);
        super.setViewportView(this.table);
    }//end updateData()

    /**
     * Updates the internal columns of the JTable by creating a new TableModel
     * @param columns The columns as a vector of strings
     */
    private void updateColumns(@NotNull Vector<String> columns) {
        DefaultTableModel tableModel = new DefaultTableModel();
        for (String column : columns) {
            tableModel.addColumn(column);
        }//end for columns
        for (Vector<Object> row : this.data) {
            tableModel.addRow(row);
        }//end for rows

        this.table.setModel(tableModel);
        super.setViewportView(this.table);
    }//end updateColumns()


    /* Protected */

    /**
     * Disables editing the table
     */
    protected void disableTableEditable() {
        this.table.setDefaultEditor(Object.class, null);
        this.table.getTableHeader().setReorderingAllowed(false);
    }//end setTableEditable()

    /**
     * Sets whether or not columns can be moved
     * @param allowed If it is allowed or not
     */
    protected void setColumnMovingAllowed(boolean allowed) {
        this.table.getTableHeader().setReorderingAllowed(allowed);
    }//end setColumnMovingAllowed()


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
    public Vector<Vector<Object>> getData() { return this.data; }//end getData()

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
    @Override
    public void setColumns(Vector<String> columns) {
        this.columns = columns;
        this.updateColumns(this.columns);
        // TODO: Actually set the columns in the JTable (have to play around with this first)
    }//end setColumns()

    /**
     * Sets the data
     * @param data The data within the table
     */
    public void setData(Vector<Vector<Object>> data) {
        this.data = data;
        this.updateData(this.data);
    }//end setData()
}//end AbstractJTablePane
