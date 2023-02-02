package com.company.view.table_pane.table_panes.fiat_currency_option;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.table_pane.AbstractJTablePane;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.Vector;

/**
 * TODO: Fill in
 */
public class FiatCurrencyTablePane extends AbstractJTablePane implements FiatCurrencyTablePaneInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /* Constants */

    /**
     * The column headers names
     */
    private static final String[] COLUMN_HEADERS_ARRAY = {"Fiat Currency", "In Use"};

    /**
     * The column headers
     */
    public static final Vector<String> COLUMN_HEADERS =
            new Vector<>(Arrays.asList(FiatCurrencyTablePane.COLUMN_HEADERS_ARRAY));


    /* Variables */

    private class TableModel extends AbstractTableModel {

        Vector<Vector<Object>> data;

        public TableModel(Vector<Vector<Object>> data) {
            this.data = data;
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return FiatCurrencyTablePane.COLUMN_HEADERS.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return data.get(rowIndex).get(columnIndex);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 1) return Boolean.class;
            return super.getColumnClass(columnIndex);
        }
    }


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param controller The main controller
     */
    public FiatCurrencyTablePane(MainControllerInterface controller) {
        super(new AbstractTableModel() {

            final Vector<Vector<Object>> data = controller.getFiatHashAsVector();

            @Override
            public int getRowCount() {
                return data.size();
            }

            @Override
            public int getColumnCount() {
                return FiatCurrencyTablePane.COLUMN_HEADERS.size();
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return data.get(rowIndex).get(columnIndex);
            }

            @Override
            public String getColumnName(int column) {
                return FiatCurrencyTablePane.COLUMN_HEADERS_ARRAY[column];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 1;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 1) return Boolean.class;
                return super.getColumnClass(columnIndex);
            }
        });
        super.setColumnMovingAllowed(false);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

}
