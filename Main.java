public class Main{
      public static void main (String[] args){
         Vehicle v1 = new Vehicle("Tesla", "Model 3", 2022);
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());
 
         System.out.println();
 
         Vehicle v2 = new Vehicle("Chevrolet", "Camaro", 2023);
         v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Is Vintage? " + v2.isVintage());
         
         System.out.println();
         
         Vehicle v3 = new Vehicle("Toyota", "Corolla", 1995);
         v3.displayInfo();         
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Is Vintage? " + v3.isVintage());
      }
}