import java.util.Scanner;

public class hackerrank_9_exception {
    public static void main(String[] args) {
        int x , y;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number 1:");
       x=sc.nextInt();

       System.out.println("Enter the number 2:");
       y=sc.nextInt();

       try{
           System.out.println("Answer got on dividing both number = "+x/y);
       }
       catch(Exception e){
        System.out.println("Error caught");
        System.out.println(e);
       }


    }
    
}
