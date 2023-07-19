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
public class Reservation {
    private String nbrPlace;
    private String classe;
    private String villeDepart ;
    private String villeArrivee ;
    private String dateVoyage ;
    private String heureDepart ;
    private String idClient;
    private String montant ;
    private String total ;

    public Reservation() {
    }

    public Reservation(String nbrPlace , String classe ,String villeDepart , String villeArrivee , String dateVoyage , String heureDepart,String montant , String total ,String idClient ) {
        this.classe = classe;
        this.nbrPlace = nbrPlace;
        this.villeDepart = villeDepart ;
        this.villeArrivee = villeArrivee ;
        this.dateVoyage =  dateVoyage ;
        this.heureDepart =  heureDepart ;
        this.montant= montant ;
        this.total =  total ;
        this.idClient= idClient ;     
    }
    
    public String getClasse() {return classe;}
    public void setClasse(String classe) {this.classe = classe;}
    public String getNbrPlace() {return nbrPlace;}
    public void setNbrPlace(String nbrPlace) {this.nbrPlace = nbrPlace;}
    public String getIdClient() {return idClient;}
    public void setIdClient(String idClient) {this.idClient = idClient;}
    public String getVilleDepart() {return villeDepart;}
    public void setVilleDepart(String villeDepart) {this.villeDepart = villeDepart;}
    public String getVilleArrivee() {return villeArrivee;}
    public void setVilleArrivee(String villeArrivee) {this.villeArrivee = villeArrivee;}
    public String getDateVoyage() {return dateVoyage;}
    public void setDateVoyage(String dateVoyage) {this.dateVoyage = dateVoyage;}
    public String getHeureDepart() {return heureDepart;}
    public void setHeureDepart(String heureDepart) {this.heureDepart = heureDepart;}
    public String getMontant() {return montant;}
    public void setMontant(String montant ) {this.montant = montant;}
    public String getTotal() {return total;}
    public void setTotal(String total) {this.total = total;}
}
