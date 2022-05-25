package com.iad.tabella01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContattiModel extends AbstractTableModel {

    List<Contatto> cx = new ArrayList<>();

    public ContattiModel(List<Contatto> lista) {
        cx = lista;
    }

    @Override
    public int getRowCount() {
        return cx.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contatto contatto = cx.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                contatto.getNome();
            case 1 ->
                contatto.getCognome();
            case 2 ->
                contatto.getTelefono();
            case 3 ->
                contatto.getEmail();
            case 4 ->
                contatto.getComune();
            default ->
                "Colonna sconosciuta!";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "Nome";
            case 1 ->
                "Cognome";
            case 2 ->
                "Telefono";
            case 3 ->
                "E-mail";
            case 4 ->
                "Comune";
            default ->
                "Colonna sconosciuta!";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

}
