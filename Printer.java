public class Printer implements Serviceable {

   private String brand;
   private String model;
   private String type;
   
   Printer(String brand, String model, String type) {
   this.brand=brand;
   this.model=model;
   this.type=type;
   }
   
   
   public void service(){
      System.out.println("Printer: clean rollers and check ink");
   }
}