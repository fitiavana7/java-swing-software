/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionbd;

/**
 *
 * @author ordi
 */
public interface Constant {
    public static final String  HOST="localhost"; //nom de machine dans laquelle s'installe
    public static final String  BASE="reservationjava";
    public static final String  USER="root";
    public static final String  PASSWD="";
    public static final String  URL="jdbc:mysql://"+HOST+"/"+BASE;
}
