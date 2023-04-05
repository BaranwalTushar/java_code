import java.util.Scanner;

class Mycalculator extends Exception{
    int longpower(int n,int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("values should not be negative");
        }
        else if(n==0 || p==0){
            throw new Exception("values should not be zero");
        }
        else{
            return ((int)Math.pow(n, p));//This Logic is Important
        }
    }
}
public class hackerrank_10_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int n = sc.nextInt();

        System.out.println("Enter the value 2 ");
        int p = sc.nextInt();

        Mycalculator t = new Mycalculator();
        try{
            System.out.println("Answer = "+t.longpower(n, p));
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
