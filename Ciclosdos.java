public class Ciclosdos{
 public static void main(String args[]){
  int i = 1, j=99;
  
  System.out.println("Series con for:");
  for(i= 1; i<=5;i++){
   if(i < 5){
     System.out.print(i + ",");
     System.out.print(j + ",");
    }else {
    System.out.print(i + ",");
    System.out.print(j);
   }
    j--;
   }
  System.out.println("");
  i= 1;
  j= 99;
  
   System.out.println("Series con while:");
   while(i <=5){
    if(i < 5){
     System.out.print(i + ",");
     System.out.print(j + ",");
    }else {
    System.out.print(i + ",");
    System.out.print(j);
   } 
    i++;
    j--;
   }

  System.out.println("");
  i= 1;
  j= 99;
  
  System.out.println("Series con do-while:");
  do{
    if(i < 5){
     System.out.print(i + ",");
     System.out.print(j + ",");
    }else {
    System.out.print(i + ",");
    System.out.print(j);
   } 
    i++;
    j--;
  }while(i <= 5);
 }
}