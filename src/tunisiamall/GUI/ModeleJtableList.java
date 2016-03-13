/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.GUI;

import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import tunisiamall.entities.M_Produit;

/**
 *
 * @author sawssen
 */
public class ModeleJtableList extends AbstractTableModel{
String column[]={"ID","Refernce","Prix","Quantite"}; 
 private  List<M_Produit> data = new Vector();

 

    public ModeleJtableList(List<M_Produit> datat) {
        super();
        this.data=datat;
    }

    public ModeleJtableList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getColumnName(int columnIndex) {
        return column[columnIndex];
    }
    @Override
    public int getRowCount() {
        return data.size();
    }
    @Override
    public int getColumnCount() {
        return column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return data.get(rowIndex).getId();
            case 1:
                return data.get(rowIndex).getReference();
            case 2:
                return data.get(rowIndex).getPrix();
            case 3:
                return data.get(rowIndex).getQuantite_com();
           
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    public void removeProduit(int rowIndex) {
        data.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}
