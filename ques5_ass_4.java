class Vehicle{
    int wheels;
    int speed;
    Vehicle(int wheels,int speed){
        this.wheels = wheels;
        this.speed = speed;
    }

}
class Car extends Vehicle{
    int passengers;
    Car(int wheels ,int speed,int passengers){
        super(wheels, speed);
        this.passengers = passengers;
    }
    void display(){
        System.out.println("The no. of wheels in a car: " +wheels );
        System.out.println("The speed of the car: " +speed + "km/hrs");
        System.out.println("The no. passenger: " +passengers);
        System.out.println("");
    }
}
class Truck extends Vehicle{
    int load_limit;
    Truck(int wheels,int speed,int load_limit){
        super(wheels,speed);
        this.load_limit = load_limit;
    }
    
    void display(){
          System.out.println("The no. of wheels in a car: " + wheels);
          System.out.println("The speed of the car: " +speed +"km/hrs");
          System.out.println("The load limit is: " + load_limit +"kilogram");
          System.out.println("");
          System.out.println("Name-Tushar Baranwal,Roll NO-11");
    }
}

public class ques5_ass_4 {
    public static void main(String[] args) {
        Car C = new Car(4, 30, 4);
        C.display();

        Truck T = new Truck(8, 25, 100);
        T.display();
        
    }
    
}
