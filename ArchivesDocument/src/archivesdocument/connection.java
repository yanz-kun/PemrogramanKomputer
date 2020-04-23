/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivesdocument;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Yanuar Ardani N
 */
public class connection {
    public static Connection MySQL(){
        try {
           MysqlDataSource ds = new MysqlDataSource();
           ds.setUser("root");
           ds.setPassword("");
           ds.setServerName("localhost");
           ds.setDatabaseName("ArDok");
           ds.setPortNumber(3306);
           Connection c = ds.getConnection();
           return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        
    }
}

