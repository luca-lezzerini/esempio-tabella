package com.iad.tabella01.catalogo;

import com.sun.source.tree.SwitchTree;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CatalogoModel extends AbstractTableModel {

    private List<Prodotto> lista;

    public CatalogoModel(List<Prodotto> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prodotto p = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                p.getCodice();
            case 1 ->
                p.getDescrizione();
            case 2 ->
                p.getPrezzo();
            default ->
                "Colonna sconosciuta";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "Codice";
            case 1 ->
                "Descrizione";
            case 2 ->
                "€";
            default ->
                "Colonna sconosciuta";
        };
    }

}
