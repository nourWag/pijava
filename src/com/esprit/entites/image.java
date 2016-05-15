package com.esprit.entites;


import java.sql.Blob;
import java.util.Arrays;
import java.util.Objects;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

/**
 *
 * @author Saif Eddine
 */
public class image {
    private  String id;
    private String titre;
    private byte[] photo_pack; 
    private Blob  img ;
    private Boutique boutiquecle_id;
static int i ;

    public Boutique getBoutiquecle_id() {
        return boutiquecle_id;
    }

    public void setBoutiquecle_id(Boutique boutiquecle_id) {
        this.boutiquecle_id = boutiquecle_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public byte[] getPhoto_pack() {
        return photo_pack;
    }

    public void setPhoto_pack(byte[] photo_pack) {
        this.photo_pack = photo_pack;
    }

    public Blob getImg() {
        return img;
    }

    public void setImg(Blob img) {
        this.img = img;
    }
    

}

