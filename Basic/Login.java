import java.util.Scanner;

public class Login{
 public static void main(String args[]){
 
 String usuario = "", password=""; 
 Scanner entrada = new Scanner(System.in);

 System.out.print("Ingresa tu nombre de usuario : ");
 usuario = entrada.nextLine();

 System.out.print("Ingresa tu contrase�a: ");
 password = entrada.nextLine();

 if(usuario.equals("minaya") && password.equals("123456")){
    System.out.println("Inicio de sesion correcto");

  }else{
    System.out.println("Nombre de usuario y contrasena incorrecta");
  }
 
 }
}