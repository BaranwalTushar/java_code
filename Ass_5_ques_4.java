
abstract class Accounts{
    double balance;
    int accountnumber;
    String accountholdername;
    String address;

    abstract void withdraw();
    abstract void deposit();
    void display(){
        System.out.println("Account Number "+accountnumber);
        System.out.println("Account Holder Name "+accountholdername);
        System.out.println("Address "+address);
        System.out.println("balance " +balance);
    }



}
class Savingaccount extends Accounts{
    double rateofintrest;

    Savingaccount(double rateofintrest,double balance,int accountnumber,String accountholdername,String addess){
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
        this.address = addess;
        this.rateofintrest = rateofintrest;
        this.balance = balance;

    }
    void methodamount(){
        System.out.println("interest added "+ balance*rateofintrest/100);

    }
    void withdraw(){

        System.out.println("withdraw amount of 50000");
    }
     void deposit(){
         System.out.println("Deposit 20000");
    }



}
public class Ass_5_ques_4 {
    public static void main(String[] args) {
        Savingaccount s = new Savingaccount(4.0, 20.0, 3649, "tushar", "kolkata");

        s.methodamount();

        s.withdraw();
        s.display();
        System.out.println("NAME-TUSHAR BARANWAL ,ROLL NO-11");
    }
    
}
