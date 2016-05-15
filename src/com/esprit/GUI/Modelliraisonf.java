/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;


import com.esprit.DAO.livraisonfDAO;
import com.esprit.entites.liraisonf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class Modelliraisonf extends AbstractTableModel{
       List<liraisonf > equip;
   
    String[] entete = {"Nom","Prenom ","adresse","telephone"} ;
    public  Modelliraisonf()
    {
          livraisonfDAO eq = new livraisonfDAO();
            equip=eq.DisplayAlllivraison( );
    }

    public int getRowCount() {
        return equip.size();
    }

   public String getColumnName(int Column)
   {
       return entete[Column];
   }
    
    public int getColumnCount() {
return entete.length;  }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
                return equip.get(rowIndex).getId();
            case 1:
                return equip.get(rowIndex).getNom();
            case 2:
                return equip.get(rowIndex).getPrenom();
             case 3 :
                return equip.get(rowIndex).getAdresse();
            case 4:
                return equip.get(rowIndex).getTelephone();
            
            default:
                return null;
        } 
    }
    
}
