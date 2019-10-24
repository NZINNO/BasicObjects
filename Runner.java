public class Runner{
  public static void main(String args[]){
    Car Nick = new Car();
    Car Mike = new Car(4, "v6");

    System.out.println(Nick.getWheels() + " " + Nick.engine);
    System.out.println(Mike.getWheels() + " " + Mike.engine);
  }
}
