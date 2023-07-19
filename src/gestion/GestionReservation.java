/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import classes.Reservation;
import connectionbd.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author ordi
 */
public class GestionReservation {

    public ConnexionBase connexion;

    public GestionReservation() throws Exception {
        connexion = new ConnexionBase();
    }

    public void insert(Reservation obj) throws Exception {
        String req = "INSERT INTO reservation(nombre_place , classe , ville_depart , ville_arrivee , date_voyage , heure_depart ,montant , total, id_client) VALUES('" + obj.getNbrPlace()+ "','" + obj.getClasse()+ "','" + obj.getVilleDepart()+ "','" + obj.getVilleArrivee()+ "','" + obj.getDateVoyage()+ "','" + obj.getHeureDepart()+ "','" + obj.getMontant()+ "','" + obj.getTotal()+ "','" + obj.getIdClient()+ "')";
        connexion.executeUpdate(req);
    }

    public void update(String id, String code_res, Reservation obj) throws Exception {
        String query = "UPDATE reservation SET nombre_place='" + obj.getNbrPlace()+ "',classe='" + obj.getClasse()+ "',ville_depart='" + obj.getVilleDepart()+ "',ville_arrivee='" + obj.getVilleArrivee()+ "',date_voyage='" + obj.getDateVoyage()+ "',heure_depart='" + obj.getHeureDepart()+ "' , montant='" + obj.getMontant()+ "' , total='" + obj.getTotal()+ "' ,id_client='" + obj.getIdClient()+ "' WHERE id_client='" + id + "' AND code_reservation='" + code_res + "'";
        connexion.executeUpdate(query);
    }

    public void delete(String id) throws Exception {
        String query = "DELETE FROM reservation WHERE code_reservation='" + id + "'";
        connexion.executeUpdate(query);
    }

    public ResultSet getDonnee(String mois) throws Exception {
        String query = "SELECT ville_arrivee as ville , COUNT(classe) as nombre FROM reservation WHERE ville_depart='" + mois + "' GROUP BY ville_arrivee ;";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getDonneeByClasse() throws Exception {
        String query = "SELECT classe , COUNT(classe) as nombre FROM `reservation` GROUP BY classe ;";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countenreg () throws Exception {
        String query = "SELECT count(nom) AS nombre FROM client INNER JOIN reservation ON client.id_client = reservation.id_client;" ;
        ResultSet rs = connexion.executeQuery(query) ;
        rs.next();
        int nbr = rs.getInt("nombre") ;
        return nbr ;
    }
    public int countenregspecify (String nom , String depart , String arrivee) throws Exception {
        String query = "SELECT count(nom) AS nombre FROM client INNER JOIN reservation ON client.id_client = reservation.id_client  WHERE nom='" + nom + "' AND ville_depart='" + depart + "' AND ville_arrivee='" + arrivee + "' ;" ;
        ResultSet rs = connexion.executeQuery(query) ;
        rs.next();
        int nbr = rs.getInt("nombre") ;
        return nbr ;
    }
    public ResultSet getAll() throws Exception {
        String query = "SELECT nom , prenom , cin , classe , ville_depart , ville_arrivee , nombre_place , date_voyage , reservation.id_client , code_reservation , total FROM client INNER JOIN reservation ON client.id_client = reservation.id_client ORDER BY reservation.code_reservation DESC;";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getSpecifyDonnee(String nom , String depart , String arrivee) throws Exception {
        String query = "SELECT nom , prenom , cin , classe , ville_depart , ville_arrivee , nombre_place , date_voyage , reservation.id_client , code_reservation , montant FROM client INNER JOIN reservation ON client.id_client = reservation.id_client WHERE nom='" + nom + "' AND ville_depart='" + depart + "' AND ville_arrivee='" + arrivee + "' ORDER BY reservation.code_reservation DESC;";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getAllDonnee(String id , String code_res) throws Exception {
        String query = "SELECT * FROM client INNER JOIN reservation ON client.id_client = reservation.id_client WHERE reservation.id_client='" + id + "' AND code_reservation='" + code_res + "';";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
}
