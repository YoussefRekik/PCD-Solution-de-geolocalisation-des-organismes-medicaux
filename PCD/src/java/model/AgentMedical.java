package model;
// Generated 5 avr. 2016 13:48:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AgentMedical generated by hbm2java
 */
public class AgentMedical  implements java.io.Serializable {


     private Integer idagent;
     private String passwordagent;
     private String nomagent;
     private String prenomagent;
     private String emailagent;
     private String nomvilleagent;
     private String nompadresseagent;
     private Integer codepostalagent;
     private String telagent;
     private Integer typeagent;
     private Double lon;
     private Double lat;
     private Set commentaires = new HashSet(0);
     private Set articles = new HashSet(0);
     private Set profils = new HashSet(0);

    public AgentMedical() {
    }

    public AgentMedical(String passwordagent, String nomagent, String prenomagent, String emailagent, String nomvilleagent, String nompadresseagent, Integer codepostalagent, String telagent, Integer typeagent, Double lon, Double lat, Set commentaires, Set articles, Set profils) {
       this.passwordagent = passwordagent;
       this.nomagent = nomagent;
       this.prenomagent = prenomagent;
       this.emailagent = emailagent;
       this.nomvilleagent = nomvilleagent;
       this.nompadresseagent = nompadresseagent;
       this.codepostalagent = codepostalagent;
       this.telagent = telagent;
       this.typeagent = typeagent;
       this.lon = lon;
       this.lat = lat;
       this.commentaires = commentaires;
       this.articles = articles;
       this.profils = profils;
    }
   
    public Integer getIdagent() {
        return this.idagent;
    }
    
    public void setIdagent(Integer idagent) {
        this.idagent = idagent;
    }
    public String getPasswordagent() {
        return this.passwordagent;
    }
    
    public void setPasswordagent(String passwordagent) {
        this.passwordagent = passwordagent;
    }
    public String getNomagent() {
        return this.nomagent;
    }
    
    public void setNomagent(String nomagent) {
        this.nomagent = nomagent;
    }
    public String getPrenomagent() {
        return this.prenomagent;
    }
    
    public void setPrenomagent(String prenomagent) {
        this.prenomagent = prenomagent;
    }
    public String getEmailagent() {
        return this.emailagent;
    }
    
    public void setEmailagent(String emailagent) {
        this.emailagent = emailagent;
    }
    public String getNomvilleagent() {
        return this.nomvilleagent;
    }
    
    public void setNomvilleagent(String nomvilleagent) {
        this.nomvilleagent = nomvilleagent;
    }
    public String getNompadresseagent() {
        return this.nompadresseagent;
    }
    
    public void setNompadresseagent(String nompadresseagent) {
        this.nompadresseagent = nompadresseagent;
    }
    public Integer getCodepostalagent() {
        return this.codepostalagent;
    }
    
    public void setCodepostalagent(Integer codepostalagent) {
        this.codepostalagent = codepostalagent;
    }
    public String getTelagent() {
        return this.telagent;
    }
    
    public void setTelagent(String telagent) {
        this.telagent = telagent;
    }
    public Integer getTypeagent() {
        return this.typeagent;
    }
    
    public void setTypeagent(Integer typeagent) {
        this.typeagent = typeagent;
    }
    public Double getLon() {
        return this.lon;
    }
    
    public void setLon(Double lon) {
        this.lon = lon;
    }
    public Double getLat() {
        return this.lat;
    }
    
    public void setLat(Double lat) {
        this.lat = lat;
    }
    public Set getCommentaires() {
        return this.commentaires;
    }
    
    public void setCommentaires(Set commentaires) {
        this.commentaires = commentaires;
    }
    public Set getArticles() {
        return this.articles;
    }
    
    public void setArticles(Set articles) {
        this.articles = articles;
    }
    public Set getProfils() {
        return this.profils;
    }
    
    public void setProfils(Set profils) {
        this.profils = profils;
    }




}


