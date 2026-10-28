public class Car extends Vehicle {
      private int numberOfDoors;
   
  public Car(String brand, String model, int year, int numberOfDoors){
      super(brand, model, year);
      this.numberOfDoors=numberOfDoors;
  }

  @Override
  public void displayInfo(){
      super.displayInfo();
      System.out.println("Number of Doors: " + numberOfDoors);
  }
  
  @Override
  public void moveForward(){
   System.out.println("The Car moves Forward");
  }
  
  @Override
  public void moveBackward(){
   System.out.println("The Car moves Backward");
  }
  
  @Override
  public void moveLeft(){
   System.out.println("The Car moves left");
  }

  @Override 
  public void moveRight(){
    System.out.println("The Car moves Right");
  }
}