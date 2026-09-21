public class Main{
      public static void main (String[] args){
         Vehicle v1 = new Vehicle();
         v1.brand= "Tesla";
         v1.model= "Model 3";
         v1.year= 2022;
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());
 
         System.out.println();
 
         Vehicle v2 = new Vehicle();
         v2.brand= "Chevrolet";
         v2.model= "Camaro";
         v2.year= 2023;
         v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Is Vintage? " + v2.isVintage());
         
         System.out.println();
         
         Vehicle v3 = new Vehicle();
         v3.brand= "Toyota";
         v3.model= "Corolla";
         v3.year= 1995;
         v3.displayInfo();         
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Is Vintage? " + v3.isVintage());
      }
}