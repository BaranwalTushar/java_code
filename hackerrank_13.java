import java.util.Scanner;

public class hackerrank_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char tus = sc.next().charAt(0);// concept

        if(tus=='a' || tus=='e' || tus=='i' || tus=='o' || tus=='u'){
            System.out.println("vowels");
        }
        else{
            System.out.println("not vowels");
        }


    }
    
}
