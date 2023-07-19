/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ordi
 */
public class Client {
    private String id;
    private String nom;
    private String prenom;
    private String sexe;
    private String adresse;
    private String cin;
    private String telephone;

    public Client() {
    }

    public Client(String id , String nom , String prenom , String sexe , String adresse , String cin , String telephone ) {
        this.id= id ;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.cin = cin;
        this.telephone = telephone;      
    }
    
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String nom) {this.prenom = prenom;}
    public String getSexe() {return sexe;}
    public void setSexe(String nom) {this.sexe = sexe;}
    public String getAdresse() {return adresse;}
    public void setAdresse(String nom) {this.adresse = adresse;}
    public String getCin() {return cin;}
    public void setCin(String nom) {this.cin = cin;}
    public String getTelephone() {return telephone;}
    public void setTelephone(String nom) {this.telephone = telephone;}
}
