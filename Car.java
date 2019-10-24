public class Car{
  //Attributes
  int wheels;
  String engine;

  // Default Constructor
  public Car(){
    wheels = 4;
    engine = "no idea";
  }

  public Car(int numWheels, String myEngine){
    wheels = numWheels;
    engine = myEngine;
  }

  // Getter Method
  public int getWheels(){
    return wheels;
  }
  
}
