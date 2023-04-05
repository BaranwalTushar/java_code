abstract class Asset{
    String descriptor;
    int date;
    double current_value;
    abstract void displaydetails();
    void display(){
        System.out.println("Descriptor : " +descriptor);
        System.out.println("Date "+date +"january");
        System.out.println("Current_value : "+current_value );
        
    }
}
class Stock extends Asset{
    int num_shares;
    double share_price;
    Stock(int num_shares,double share_price,String descriptor,int date,double current_value){
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }
    void displaydetails(){
        System.out.println("NUM_SHARES: "+num_shares);
        System.out.println("Share Price: "+share_price);
        super.display();
    }
}
class Bond extends Asset{
    double intrest_rate;
    Bond(double intrest_rate,String descriptor,int date,double current_value){
        this.intrest_rate = intrest_rate;
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;

    }
    void displaydetails(){
        System.out.println("Interest Rate :"+intrest_rate);
        super.display();
    }
}
class Savings extends Asset{
    double intrest_rate;
    Savings(double intrest_rate,String descriptor,int date,double current_value){
        this.intrest_rate = intrest_rate;
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }
    void displaydetails(){
        System.out.println("Interest Rate :"+intrest_rate);
        super.display();
    }
} 
public class Ass_5_ques_5 {
    public static void main(String[] args) {
      
        Stock S = new Stock(4, 1000, "legal company name differs from your trading name (e.g. domain), you should use the name which your customers will be able to identify.", 10, 1500);
         S.displaydetails();
         System.out.println();

         Bond B = new Bond(1000, "legal company name differs from your trading name (e.g. domain), you should use the name which your customers will be able to identify.", 12, 2500);
         B.displaydetails();
         System.out.println();
         
         Savings T = new Savings(2000, "legal company name differs from your trading name (e.g. domain), you should use the name which your customers will be able to identify.", 25, 1000);
         T.displaydetails();
         System.out.println();
         System.out.println();
         System.out.println("NAME-TUSHAR BARANWAL,ROLL NO=11");
    }
    
}
