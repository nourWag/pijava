/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.entities;

/**
 *
 * @author sawssen
 */
public class LigneFacture {
   private int idFact;
   private int idPr;
   private int quantite;

    public LigneFacture(int idFact, int idPr, int quantite) {
        this.idFact = idFact;
        this.idPr = idPr;
        this.quantite = quantite;
    }

    public LigneFacture() {
       
    }

    public int getIdFact() {
        return idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
   
   
}
