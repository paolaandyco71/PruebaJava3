/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
//
 
package Interfaz;
//PASO 1 - IMPORTAR LAS LIBRERIAS
import javax.swing.*;//Importamos TODO de swing
import java.awt.*;


/**
 *
 * @author LAB03
 */
//PASO 2 - HEREDAR LA CLASE DESDE JFRAME
public class Window extends JFrame
{
    //PASO 3 - DECLARAR ELEMENTOS A UTILIZAR
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    
    //PASO 4 - DEFINIR EL CONTRUCTOR
    public Window()
    {
        //PASO 5 - CREAR E  INICIALIZAR LOS OBJETOS
      panel = new JPanel();//Creo un objeto tipo JPanel
      label = new JLabel();
      text = new JTextField(20);//20 es la cant de caracteres
      boton = new JButton();
      
      //PASO 6 AGREGAR LOS ELEMENTOS AL JFRAME
      this.add(panel);//Recomendable agregar el JPanel
      panel.add(label);
      panel.add(text);
      panel.add(boton);
      
      //PASO 7 - PROPIEDADES DE LOS OBJETOS
      label.setText("Nombre");
      boton.setText("Enviar");
      panel.setBackground(Color.red);//Color de fondo del JPanel
      
      
      
      
             
          
    }
   
         
    
    
}
