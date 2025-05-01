/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Andrea
 */
public class CConexion {
    
    Connection conectar = null;
    
    String Usuario = "avnadmin";
    String contrasena = "AVNS_dxoPHMY5rFlXPE9lk76";
    String bd = "defaultdb";
    String ip = "mysql-236d391f-inca-1ce6.l.aivencloud.com";
    String puerto = "21596";
    
    String cadena = "jdbc:mariadb://" +ip+ ":" +puerto+ "/" +bd + "?sslMode=trust";
    
    public Connection establecerConexion(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conectar = DriverManager.getConnection(this.cadena, this.Usuario, this.contrasena);
            JOptionPane.showMessageDialog(null, "Se conectó safistactoriamente");
            
        } catch (ClassNotFoundException | SQLException e) {
          JOptionPane.showMessageDialog(null,"Sin Conexion" + e, "Conexion",JOptionPane.ERROR_MESSAGE);
          System.out.println("Sin Conexion: " + e);
          
        }
        return conectar;
    }
    
}
