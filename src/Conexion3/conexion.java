/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion3;
//10 - NECESARIO PARA CONEXION CON MYSQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LAB03
 */
public class conexion 
{
    //PASO 11 DECLARANDO OBJETOS PARA CONEXION
    
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/conexion";
    
    //PASO 12 - CONSTRUCTOR DE LA CLASE
     public ConexionBD()
     {
        conex = null;//Inicializar la variable 
        
        //Metodo para manejar excepciones
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Error en la Conexion");
        
  
         
      
    
     

    
    
{