public class Motorcycle extends Vehicle {
   private String engineType;
   
  public Motorcycle(String brand, String model, int year, String engineType){
   super(brand, model, year);
   this.engineType=engineType;
  }

  @Override
  public void displayInfo(){
   super.displayInfo();
   System.out.println("Engine Type: " + engineType);
  }
  
  @Override
  public void moveForward(){
   System.out.println("The Motorcycle moves Forward");
  }
  
  @Override
  public void moveBackward(){
   System.out.println("The Motorcycle moves Backward");
  }
  
  @Override
  public void moveLeft(){
   System.out.println("The Motorcycle moves left");
  }

  @Override 
  public void moveRight(){
    System.out.println("The Motorcycle moves Right");
  }
}