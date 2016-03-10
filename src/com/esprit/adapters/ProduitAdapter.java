/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.adapters;


import com.esprit.DAO.ProduitDao;
import com.esprit.IDAO.IProduitDao;
import com.esprit.entites.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mehdi
 */
public class ProduitAdapter extends AbstractTableModel {

   String[] headers = {"id", "Description", "reference","couleur"};
    List<Produit> stocks = new ArrayList<>();
    IProduitDao stockDAO;

    public ProduitAdapter() {
        stockDAO = new ProduitDao();
        stocks = stockDAO.findAll();
    }

    public ProduitAdapter(List<Produit> allByKey) {
stocks = allByKey;
    }

    

    @Override
    public int getRowCount() {
        return stocks.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public String getColumnName(int i) {
        return headers[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
            case 0:
                return stocks.get(rowIndex).getId();
            case 1:
                return stocks.get(rowIndex).getDescription();
            case 2:
                return stocks.get(rowIndex).getReference();
            case 3:
                return stocks.get(rowIndex).getCouleur();
            default:
                return null;
        }
    }

}
