/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.adapters;



import com.esprit.DAO.CartefideliteDao;
import com.esprit.entites.Cartefidelite;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class modelcartefid extends AbstractTableModel{
 List< Cartefidelite> p;
  
    String[] entete = {"idCarteFidelite","nombrePointFidele","dateCreationCarteFidelite"} ;
  public  modelcartefid()
    {
            CartefideliteDao eq = new CartefideliteDao();
        p=eq.DisplayAllCartefidelite();
    }
    @Override
    public int getRowCount() {
        return p.size(); //To change body of generated methods, choose Tools | Templates.
    }
       public String getColumnName(int Column)
   {
       return entete[Column];
   }
@Override
    public int getColumnCount() {
        return entete.length; 
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
                return p.get(rowIndex).getIdCarteFidelite();
            case 1 :
                return p.get(rowIndex).getNombrePointFidele();
            case 2:
                return p.get(rowIndex).getDateCreationCarteFidelite();
      default:
                return null;
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
