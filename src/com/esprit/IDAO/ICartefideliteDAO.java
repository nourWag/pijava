/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;
import com.esprit.entites.Cartefidelite;
import java.util.ArrayList;
//import java.util.List;

//import java.util.Date;

/**
 *
 * @author lenovo
 */
public interface ICartefideliteDAO {
    void insertCartefidelite(Cartefidelite carte);

    void updateCartefidelite(Cartefidelite carte);

    void deleteCartefidelite(Cartefidelite carte);

    ArrayList<Cartefidelite> DisplayAllCartefidelite();
  
    /**
     *
     * @param idCarteFidelite
     * @return
     */
    Cartefidelite findCarteFideliteByIdCarteFidelite(int idCarteFidelite);
    
}
