package com.company.view.table_pane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.Vector;

/**
 * The generic table pane that provides base functionality, from which all table panes extend
 */
abstract public class AbstractJTablePane extends JScrollPane implements TablePaneInterface {

    /* ************ *
     *    Fields    *
     * ************ */

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


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * AbstractJTablePane constructor
     * @param columns The columns of the table
     * @param data The data of the table
     */
    public AbstractJTablePane(final Vector<String> columns, final Vector<Vector<String>> data) {
        super();
        this.setup(columns, data);
    }

    public AbstractJTablePane(final TableModel model) {
        super();
        this.setup(model);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /**
     * Abstracted setup method to be used by all constructors
     * @param columns The columns of the table
     * @param data The data of the table
     */
    private  void setup(final Vector<String> columns, final Vector<Vector<String>> data) {
        this.columns = columns;
        this.data = data;
        this.table = new JTable(this.data, this.columns);
        this.table.setShowGrid(true);
        this.table.setGridColor(Color.LIGHT_GRAY);
        super.setViewportView(this.table);
    }

    private void setup(final TableModel model) {
        this.table = new JTable(model);
        this.table.setShowGrid(true);
        this.table.setGridColor(Color.LIGHT_GRAY);
        super.setViewportView(this.table);
    }

    /**
     * Updates the internal data of the JTable by creating a new TableModel
     * @param data The data as a matrix of strings
     */
    private void updateData(final Vector<Vector<String>> data) {
        final DefaultTableModel tableModel = new DefaultTableModel();
        for (int i = 0; i < this.table.getModel().getColumnCount(); i++) {
            tableModel.addColumn(this.table.getColumnName(i));
        }
        for (final Vector<String> row : data) {
            tableModel.addRow(row);
        }

        this.table.setModel(tableModel);
        super.setViewportView(this.table);
    }

    /**
     * Updates the internal columns of the JTable by creating a new TableModel
     * @param columns The columns as a vector of strings
     */
    private void updateColumns(final Vector<String> columns) {
        final DefaultTableModel tableModel = new DefaultTableModel();
        for (final String column : columns) {
            tableModel.addColumn(column);
        }
        for (final Vector<String> row : this.data) {
            tableModel.addRow(row);
        }

        this.table.setModel(tableModel);
        super.setViewportView(this.table);
    }


    /* Protected */

    /**
     * Disables editing the table
     */
    protected void disableTableEditable() {
        this.table.setDefaultEditor(Object.class, null);
        this.table.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * Sets whether columns can be moved
     * @param allowed If moving the columns is allowed or not
     */
    protected void setColumnMovingAllowed(boolean allowed) {
        this.table.getTableHeader().setReorderingAllowed(allowed);
    }

    /* Public */

    // Getters

    /**
     * Gets the columns of the table
     * @return The columns of the table
     */
    @Override
    public Vector<String> getColumns() { return this.columns; }

    /**
     * Gets the data of the table
     * @return The data of the table
     */
    @Override
    public Vector<Vector<String>> getData() { return this.data; }

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
    }

    /**
     * Sets the data
     * @param data The data within the table
     */
    public void setData(Vector<Vector<String>> data) {
        this.data = data;
        this.updateData(this.data);
    }
}
