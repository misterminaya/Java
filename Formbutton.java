import javax.swing.*;
import java.awt.event.*;

public class Formbutton extends JFrame implements ActionListener{
  
  JButton boton1;
  public Formbutton(){
   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this);    
 }
   public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      System.exit(0);
    }
 }
   public static void main(String args[]){
   Formbutton formulario1 = new Formbutton();
   formulario1.setBounds(0,0,450,350);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 }
}