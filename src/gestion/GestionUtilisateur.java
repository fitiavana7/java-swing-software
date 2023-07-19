/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import connectionbd.ConnexionBase;
import classes.Client;
import classes.Utilisateur;
import java.sql.ResultSet;

/**
 *
 * @author ordi
 */
public class GestionUtilisateur {

    public ConnexionBase connexion;

    public GestionUtilisateur() throws Exception {
        connexion = new ConnexionBase();
    }

    public void insert(Utilisateur obj) throws Exception {
        String req = "INSERT INTO utilisateur(mail,password) VALUES('" + obj.getMail()+ "','" + obj.getPwd()+ "')";
        connexion.executeUpdate(req);
    }

    public ResultSet getAll() throws Exception {
        String query = "SELECT * FROM client";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countenreg (Utilisateur obj) throws Exception {
        String query = "SELECT count(*) as nombre FROM utilisateur WHERE mail='" + obj.getMail()+ "' AND password='" + obj.getPwd()+ "'"  ;
        ResultSet rs = connexion.executeQuery(query) ;
        rs.next();
        int nbr = rs.getInt("nombre") ;
        return nbr ;
    }
}
