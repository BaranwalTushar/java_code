import java.util.Scanner;

public class hackerrank_12 {
    //Swap of two numbers
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the no. a");
     int a = sc.nextInt();

     System.out.println("Enter the no. b:");
     int b = sc.nextInt();

     a = a+b;
     b = a-b;
     a = a-b;

     System.out.println("After swappin a= "+a + " After swapping b= " +b);
    }
    
}
