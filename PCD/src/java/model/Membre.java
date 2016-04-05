package model;
// Generated 5 avr. 2016 13:48:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Membre generated by hbm2java
 */
public class Membre  implements java.io.Serializable {


     private Integer idmembre;
     private String nommembre;
     private String prenommembre;
     private String pseudomembre;
     private String emailmembre;
     private String passwordmembre;
     private Integer numtelmembre;
     private Set membreDonnerNotes = new HashSet(0);
     private Set commentaires = new HashSet(0);

    public Membre() {
    }

    public Membre(String nommembre, String prenommembre, String pseudomembre, String emailmembre, String passwordmembre, Integer numtelmembre, Set membreDonnerNotes, Set commentaires) {
       this.nommembre = nommembre;
       this.prenommembre = prenommembre;
       this.pseudomembre = pseudomembre;
       this.emailmembre = emailmembre;
       this.passwordmembre = passwordmembre;
       this.numtelmembre = numtelmembre;
       this.membreDonnerNotes = membreDonnerNotes;
       this.commentaires = commentaires;
    }
   
    public Integer getIdmembre() {
        return this.idmembre;
    }
    
    public void setIdmembre(Integer idmembre) {
        this.idmembre = idmembre;
    }
    public String getNommembre() {
        return this.nommembre;
    }
    
    public void setNommembre(String nommembre) {
        this.nommembre = nommembre;
    }
    public String getPrenommembre() {
        return this.prenommembre;
    }
    
    public void setPrenommembre(String prenommembre) {
        this.prenommembre = prenommembre;
    }
    public String getPseudomembre() {
        return this.pseudomembre;
    }
    
    public void setPseudomembre(String pseudomembre) {
        this.pseudomembre = pseudomembre;
    }
    public String getEmailmembre() {
        return this.emailmembre;
    }
    
    public void setEmailmembre(String emailmembre) {
        this.emailmembre = emailmembre;
    }
    public String getPasswordmembre() {
        return this.passwordmembre;
    }
    
    public void setPasswordmembre(String passwordmembre) {
        this.passwordmembre = passwordmembre;
    }
    public Integer getNumtelmembre() {
        return this.numtelmembre;
    }
    
    public void setNumtelmembre(Integer numtelmembre) {
        this.numtelmembre = numtelmembre;
    }
    public Set getMembreDonnerNotes() {
        return this.membreDonnerNotes;
    }
    
    public void setMembreDonnerNotes(Set membreDonnerNotes) {
        this.membreDonnerNotes = membreDonnerNotes;
    }
    public Set getCommentaires() {
        return this.commentaires;
    }
    
    public void setCommentaires(Set commentaires) {
        this.commentaires = commentaires;
    }




}


