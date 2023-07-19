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
public class Utilisateur {
    private String mail;
    private String pwd;

    public Utilisateur() {
    }

    public Utilisateur(String mail , String pwd ) {
        this.mail= mail ;
        this.pwd = pwd;     
    }
    
    public String getMail() {return mail;}
    public void setMail(String mail) {this.mail = mail;}
    public String getPwd() {return pwd;}
    public void setPwd(String pwd) {this.pwd = pwd;}
}
