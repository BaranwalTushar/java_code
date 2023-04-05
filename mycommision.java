import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

class Commision{
    double sales;
Commision(double s){
    sales = s;
    }
    public double commission()
    {
        if(sales<500)
        return 0.56*sales;

        else if(sales>500 && sales<5000)
        return 0.86*sales;

        else
        return 0.93*sales;
    }

}


public class mycommision {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sales ");

        double mysales = sc.nextDouble();
        if(mysales<0.0){
            System.out.println("invalid input");
        }
        else{
            Commision c = new Commision(mysales);
            
            double SL;

            SL = c.commission();
            System.out.println("The commision is " + SL);
        }
        System.out.println("Name-Tushar Baranwal, Roll No-11");
    }   
}
