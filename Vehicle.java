class Vehicle{

   private String brand;
   private String model;
   private int year;
   
   Vehicle(String brand, String model, int year){
      this.brand = brand;
      this.model = model;
      if (year >= 1886 && year <=2026){
         this.year = year;
      } else {
         this.year = 2026;
      }
   }
   
   void displayInfo() {
        System.out.println(getBrand() + ", " + getModel() + ", " + getYear());
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }
    
    String getBrand() {
      return brand;
    } 
    String getModel() {
      return model; 
    }
    int getYear() {
      return year;
    }
    boolean setYear (int year) {
      if (year >= 1886 && year <= 2026){
         this.year = year;
         return true;
      }
         return false;
    }
   
}