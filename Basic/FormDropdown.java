import javax.swing.*;
import java.awt.event.*;

public class FormDropdown extends JFrame implements ItemListener{
 
 private JComboBox combo1;

 public FormDropdown(){
  setLayout(null);
  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);

  combo1.addItem("rojo");
  combo1.addItem("verde");
  combo1.addItem("azul");
  combo1.addItem("amarillo");
  combo1.addItem("negro");
  combo1.addItemListener(this);
 }

 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
     String seleccion = combo1.getSelectedItem().toString();
     setTitle(seleccion);
  }    
 } 

 public static void main(String args[]){
   FormDropdown formulario1 = new FormDropdown();
   formulario1.setBounds(0,0,500,150);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 }
}