class Vehicle{
    protected int Regn_Num;
    protected int speed;
    protected String color;
    protected String ownername;

    void showdata(){
        System.out.println("This is a method class");
    }


}
class Bus extends Vehicle{
    private int route_number;
    void setroute_number(int route_number){
      this.route_number = route_number;
    }
    void showdata(){
        super.showdata();
        System.out.println("Bus Details");
        System.out.println("Regn_Num " +Regn_Num);
        System.out.println("speed " +speed);
        System.out.println("color "+color);
        System.out.println("Ownername "+ownername);
        System.out.println("Route Number "+route_number);

    }

} 
class Car extends Vehicle{
    private String manufacturer_name;
    void setmanufacturer_name(String manufacturer_name){
        this.manufacturer_name = manufacturer_name;
    }
    void showdata(){
        super.showdata();
        System.out.println("Car Details");
        System.out.println("Regn_Num " +Regn_Num);
        System.out.println("speed " +speed);
        System.out.println("color "+color);
        System.out.println("Ownername "+ownername);
        System.out.println("Manufacturer Name "+manufacturer_name);
        
    }
}  
public class Ass_5_ques_2 {
    public static void main(String[] args) {
        Bus B = new Bus();
        B.Regn_Num = 6627;
        B.speed = 40;
        B.color = "Black";
        B.ownername = "Tushar";
        B.setroute_number(123);
        B.showdata();
        
    }
    
}
