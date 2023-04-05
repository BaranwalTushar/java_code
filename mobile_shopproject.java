class telephone{
    int mobile_id(int x){
         return x;
    }
    void modelname(){
     System.out.println("Realme...");
    }
    void camera_quality(){
        System.out.println("64 megapixel");
    }
    int Available_quantity(int y){
        return y;
    }
}
class Smartphone extends telephone{
      void Enabled_5g(){
        System.out.println("5g supported in SmartPhone");
      }
      void Dual_screen(){
        System.out.println("Dual screen features are Available in SmartPhone...");
      }
}
public class mobile_shopproject {
    public static void main(String[] args) {
        Smartphone Sm = new Smartphone();
        System.out.println("The mobile ID of Realme Smart phone is " +Sm.mobile_id(12033));
        Sm.modelname();
        Sm.camera_quality();
        System.out.println("The Available Quantity of phone is " + Sm.Available_quantity(55));
        Sm.Enabled_5g();
        Sm.Dual_screen();
        System.out.println(" ");
        System.out.println("Name-Tushar Baranwal, Roll NO.-11");
}
    
}
