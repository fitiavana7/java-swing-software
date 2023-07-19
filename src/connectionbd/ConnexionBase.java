/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ordi
 */
public class ConnexionBase {
    public Connection con;
    public Statement stat;

    public ConnexionBase() throws Exception{
	Class.forName("org.gjt.mm.mysql.Driver");
	con = DriverManager.getConnection( Constant.URL, Constant.USER, Constant.PASSWD);
	stat = con.createStatement();
    }
                                                                                             
    public ResultSet executeQuery (String query) throws Exception{
        ResultSet res = null;
        res = stat.executeQuery(query);
        return(res);
    }
    public int executeUpdate (String query) throws Exception{
        int res=0;
	res=stat.executeUpdate(query);
	return(res);
    }

    public void close() throws Exception{
	stat.close();
	con.close();
    }
}
