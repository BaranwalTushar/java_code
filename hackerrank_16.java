import java.util.Scanner;

public class hackerrank_16 {
    static int fabinacciseries(int n){
      if(n<1){
        return n;
      }
      return fabinacciseries(n-1) + fabinacciseries(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println(fabinacciseries(i));
        }
        
        }

    }
    

