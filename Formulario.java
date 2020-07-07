import javax.swing.*;

public class Formulario extends JFrame{
   private JLabel label1;
   
   public Formulario(){
    setLayout(null);
    label1 = new JLabel("La Geekipedia de misterminaya");
    label1.setBounds(10,20,200,300);
    add(label1);  
 }

   public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
 }    
}