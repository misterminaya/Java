import java.util.Scanner;

public class Vacation{
  public static void main(String arg[]){

  Scanner in = new Scanner(System.in);
  String name = "";
  int clave=0, years=0;
  
  System.out.println("Bienvenido al sistema vacacional de Coca Cola");
  System.out.println("***************************************************");

  System.out.println("¿Cuál es el nombre del trabajador?");
  name = in.nextLine(); 
  
  System.out.println("¿Cuántos años de servicio tiene el trabajador?");
  years = in.nextInt();

  System.out.println("¿Cuál es la clave de su departamento?");
  clave = in.nextInt();
  
  if(clave == 1){
     if(years == 1){
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " año");
     System.out.println("Merece 6 dias de vacaciones");
    }
     else if(years >= 2 && years <= 6){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 14 dias de vacaciones");
    }
     else if(years >= 7){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 20 dias de vacaciones");
    }
    }else if(clave ==2){
     if(years == 1){
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " año");
     System.out.println("Merece 7 dias de vacaciones");
    }
     else if(years >= 2 && years <= 6){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 15 dias de vacaciones");
    }
     else if(years >= 7){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 22 dias de vacaciones");
    }
    }else if(clave ==3){
     if(years == 1){
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " año");
     System.out.println("Merece 10 dias de vacaciones");
    }
     else if(years >= 2 && years <= 6){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 20 dias de vacaciones");
    }
     else if(years == 7){ 
     System.out.println("***************************************************");
     System.out.println(name + " clave " + clave + ",tiene " + years + " años");
     System.out.println("Merece 30 dias de vacaciones");
    }
    }else{
         System.out.println("************************ERROR***********************");
         System.out.println("Error, la clave de departamento no existe");
         System.out.println("***************************************************");
    }
 }
}

