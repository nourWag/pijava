/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.text.SimpleDateFormat;



/**
 *
 * @author lenovo
 */
public class Cartefidelite {
    
    private int idCarteFidelite;
            
    private int  nombrePointFidele;
    private Date dateCreationCarteFidelite;

    public Cartefidelite() {
 this.idCarteFidelite=idCarteFidelite;
   this.nombrePointFidele=nombrePointFidele;
    this.dateCreationCarteFidelite=dateCreationCarteFidelite ;
    }

    public Cartefidelite(int idCarteFidelite, int nombrePointFidele, Date dateCreationCarteFidelite) {
        this.idCarteFidelite = idCarteFidelite;
        this.nombrePointFidele = nombrePointFidele;
        this.dateCreationCarteFidelite =dateCreationCarteFidelite;
    }

    public int getIdCarteFidelite() {
        return idCarteFidelite;
    }

    public void setIdCarteFidelite(int idCarteFidelite) {
        this.idCarteFidelite = idCarteFidelite;
    }

    public int getNombrePointFidele() {
        return nombrePointFidele;
    }

    public void setNombrePointFidele(int nombrePointFidele) {
        this.nombrePointFidele = nombrePointFidele;
    }

    public Date getDateCreationCarteFidelite() {
        return dateCreationCarteFidelite;
    }

    public void setDateCreationCarteFidelite(Date dateCreationCarteFidelite) {
        this.dateCreationCarteFidelite = dateCreationCarteFidelite;
    }

    @Override
    public String toString() {
        return "Cartefidelite{" + "idCarteFidelite=" + idCarteFidelite + ", nombrePointFidele=" + nombrePointFidele + ", dateCreationCarteFidelite=" + dateCreationCarteFidelite + '}';
    }
    
    
    
}