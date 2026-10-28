public class Main{

      public static void printDetails (Vehicle vehicle){
       vehicle.displayInfo();
      }
      
      public static void printMovement(Vehicle vehicle) {
      vehicle.moveForward();
      vehicle.moveBackward();
      vehicle.moveLeft();
      vehicle.moveRight();
      } 

      public static void main (String[] args){
         Vehicle vehicle = new Car ("Toyota", "Vios", 2018, 4);
            vehicle.displayInfo();
            System.out.println();
      
         vehicle = new Motorcycle ("Honda", "XRM", 2011, "Manual");
            vehicle.displayInfo();
            System.out.println();
      
         vehicle = new Truck ("Volvo", "VNL", 1996, 18);
            vehicle.displayInfo();
            System.out.println();
      
         System.out.print("_____Method Parameter____\n");
         Car car = new Car("BYD", "Seagull", 2023, 4);
         Motorcycle motor = new Motorcycle("Honda", "Beat", 2023, "Automatic");
         Truck truck = new Truck("Isuzu", "Wingvan", 2011, 12); 
      
         printDetails(car);
            System.out.println();
         printDetails(motor);
            System.out.println();
         printDetails(truck);
            System.out.println();
      
         System.out.println("_____Polymorphic Array_____");
         Vehicle[] vehicles = {
            new Car("McLaren", "Artura", 2022, 2),
            new Motorcycle("Yamaha", "NMAX", 2024, "Automatic"),
            new Truck("Sinotruk", "Sitrak", 2009, 8) 
         };
      
         for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            printMovement(currentVehicle);
            System.out.println();
         }    
      }
}

