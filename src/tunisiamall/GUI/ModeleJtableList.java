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
String column[]={"ID","Image","Référence","Prix","Quantite","Prix Total"}; 
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
                return data.get(rowIndex).getImg();
            case 2:
                return data.get(rowIndex).getReference();
            case 3:
                return data.get(rowIndex).getPrix()+"  DT";
            case 4:
                return (String) Integer.toString( data.get(rowIndex).getQuantite_com());
            case 5:
                return data.get(rowIndex).getPrixTotal()+"  DT";
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        M_Produit row = data.get(rowIndex);
        if(0 == columnIndex) {
            row.setId((Integer) aValue);
        }
        else if(1 == columnIndex) {
            row.setReference((String) aValue);
        }
        else if(2 == columnIndex) {
            row.setPrix((Float) aValue);
        }
        else if(4 == columnIndex) {
            row.setQuantite_com(Integer.parseInt(aValue.toString()));
            fireTableDataChanged();
        }
    }

    public void removeProduit(int rowIndex) {
        data.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
//     public void saveProduit(int rowIndex) {
//        data.add(rowIndex);
// 
//        fireTableRowsDeleted(rowIndex, rowIndex);
//    }
    public boolean isCellEditable(int rowIndex, int columnIndex){
    return columnIndex == 4; //Or whatever column index you want to be editable
    }
    
}
