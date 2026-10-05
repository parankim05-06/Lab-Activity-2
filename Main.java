public class Main{
      public static void main (String[] args){
         System.out.println("\nVEHICLE 1");
         Vehicle v1 = new Vehicle("Tesla", "Model 3", 2022);
         v1.setYear(2000);
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());
 
         System.out.println("\nVEHICLE 1");
         v1.setYear(1885);
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());
         
         System.out.println("\nVEHICLE 1");
         v1.setYear(2027);
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());

         System.out.println("\nVEHICLE 2");
         Vehicle v2 = new Vehicle("Chevrolet", "Camaro", 1885);
         v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Is Vintage? " + v2.isVintage());
         
         System.out.println("\nVEHICLE 3");
         Vehicle v3 = new Vehicle("Toyota", "Corolla", 2027);
         v3.displayInfo();         
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Is Vintage? " + v3.isVintage());
      }
}