import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        a = sc.nextInt();

        System.out.println("Enter number 2:");
        b = sc.nextInt();

        int c = add(a,b);
        System.out.println("the sum of two number is " + c);
        System.out.println("Name-Tushar Baranwal, Roll No-11");
        
    }
    public  static int add(int x, int y){
        return x+y;
    }
}