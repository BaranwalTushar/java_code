import java.util.Scanner;

public class hackerrank_17 {
    public static void main(String[] args) {
        //PALLINDROME
        String str,reverse="";
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");

          str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
           reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse "+reverse);
        if(str.equals(reverse)){
            System.out.println("String is pallindrome...");
        }
        else{
            System.out.println("String is not pallindrome..");
        }
    }
    
}
