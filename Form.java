import javax.swing.*;

public class Form extends JFrame{

  public Form(){
    setLayout(null);  
 }

  public static void main(String args[]){
    Form formulario1 = new Form();
    formulario1.setBounds(0,0,400,550);
    formulario1.setVisible(true);  
    formulario1.setLocationRelativeTo(null);
    formulario1.setResizable(false); 

 }
}