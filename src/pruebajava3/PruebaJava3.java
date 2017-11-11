/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import javax.swing.*;//Importamos TODO de swing
import java.awt.*;
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;
//PASO 14 - IMPORTA LA CLASE CONEXION

/**
 * Paola Bravo Cardenas
 * @author LAB03
 * Fecha:Noviembre 10 de 2017
 * Programa:Pruebajava3
 * Responsabilidad:estructura jframe para creacion 
 * @author LAB03
 */
    public class PruebaJava3{
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     
     JPanel panel;
     JLabel label;
     JTextField text;
     JButton boton;
     JButton boton2;
     //PASO 15 - CREACION DE UN OBJETO TIPO CONEXIONBD
     ConexionBD con;
       public Interfaz() 
    
  {
    panel = new JPanel();
    label = new JLabel();
    text = new JTextField(20);
    boton = new JButton();
    boton2 = new JButton();
    
    this.add(panel);
    panel.add(label);
    panel.add(text);
    panel.add(boton);
    panel.add(boton2);
    
    label.setText("Atributo");
    boton.setText("Conectar");
    boton2.setText("Desconectar");
    panel.setBackground(Color.LIGHT_GRAY);
    
    //PASO 16 - AGREGAMOS ESCUCHADORE AL BOTON
    boton.addActionListener(newActionListener)()
    {
        public void actionPerformed(ActionEvent evt)
        {
            con = new ConexionBD();
            
        }           
    }
    
    
    
    
     
  
        
    }
    
}
