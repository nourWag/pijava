/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.entites;

import java.sql.Blob;

/**
 *
 * @author snoussi
 */
public class ImageProfil {
        private  String idprofil;
    private String nom_profil;
    private byte[] photo_profil; 
    private Blob  imageprofil ;
    
     public ImageProfil() {
    }

    public String getNom_profil() {
        return nom_profil;
    }

    public void setNom_profil(String nom_profil) {
        this.nom_profil = nom_profil;
    }

    public String getIdprofil() {
        return idprofil;
    }

    public void setIdprofil(String idprofil) {
        this.idprofil = idprofil;
    }

    public byte[] getPhoto_profil() {
        return photo_profil;
    }

    public void setPhoto_profil(byte[] photo_profil) {
        this.photo_profil = photo_profil;
    }

    public Blob getImageprofil() {
        return imageprofil;
    }

    public void setImageprofil(Blob imageprofil) {
        this.imageprofil = imageprofil;
    }
    
    
    
}
