/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import connectionbd.ConnexionBase;
import classes.Client;
import java.sql.ResultSet;

/**
 *
 * @author ordi
 */
public class GestionClient {

    public ConnexionBase connexion;

    public GestionClient() throws Exception {
        connexion = new ConnexionBase();
    }

    public void insert(Client obj) throws Exception {
        String req = "INSERT INTO client(id_client,nom,prenom,sexe,adresse,cin,telephone) VALUES('" + obj.getId()+ "','" + obj.getNom()+ "','" + obj.getPrenom()+ "','" + obj.getSexe()+ "','" + obj.getAdresse()+ "','" + obj.getCin()+ "','" + obj.getTelephone()+ "')";
        connexion.executeUpdate(req);
    }

    public void update(String id, Client obj) throws Exception {
        String query = "UPDATE client SET id_client='" + obj.getId()+ "',nom='" + obj.getNom()+ "',prenom='" + obj.getPrenom()+ "',sexe='" + obj.getSexe()+ "',adresse='" + obj.getAdresse()+ "',cin='" + obj.getCin()+ "',telephone='" + obj.getTelephone()+ "' WHERE id_client='" + id + "'";
        connexion.executeUpdate(query);
    }

    public void delete(String id) throws Exception {
        String query = "DELETE FROM client WHERE id='" + id + "'";
        connexion.executeUpdate(query);
    }

    public ResultSet getAll() throws Exception {
        String query = "SELECT * FROM client";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countenreg () throws Exception {
        String query = "SELECT count(*) as nombre FROM client" ;
        ResultSet rs = connexion.executeQuery(query) ;
        rs.next();
        int nbr = rs.getInt("nombre") ;
        return nbr ;
    }
}
