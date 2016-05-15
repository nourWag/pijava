package com.esprit.adapters;
import com.esprit.entites.Boutique;
import com.esprit.DAO.BoutiqueDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class BoutiqueAdapter extends AbstractTableModel{
    //String[] headers = {"id", "nom", "categorie", "Fax", "numero_telephone", "Email", "promotion","Description"};
     String[] headers = {"id", "nom", "categorie"};
    List<Boutique> stocks = new ArrayList<>();
    BoutiqueDao stockDAO;

    public BoutiqueAdapter() {
        stockDAO = new BoutiqueDao();
        stocks = stockDAO.displayAll();
    }
    public BoutiqueAdapter(List<Boutique> allByKey) {
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
                return stocks.get(rowIndex).getNom();
            case 2:
                return stocks.get(rowIndex).getCategorie();
//            case 3:
//                return stocks.get(rowIndex).getFax();
//            case 4:
//                return stocks.get(rowIndex).getNumero_telephone(); 
//            case 5:
//                return stocks.get(rowIndex).getEmail();
//            case 6:
//                return stocks.get(rowIndex).getPromotion();
//            case 7:
//                return stocks.get(rowIndex).getDescription();
            default:
                return null;
        }
    }
    
}
