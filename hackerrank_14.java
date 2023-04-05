import java.util.Scanner;

public class hackerrank_14 {
    public static void main(String[] args) {
        
        // boolean flag =false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
    
        for(int i=2;i<x/2;i++){// logic of prime
            if(x%2==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
        }
        
        

        
    }
    
}
