import java.util.Scanner;
public class largest_value_custmore{
    public static void main(String[] args){
        int counter=0;
        int numbers;
        int largest = 0;

        Scanner sc = new Scanner(System.in);
       
        while(counter<10){
            System.out.println("Enter numbers :");

            numbers = sc.nextInt();
            if(numbers>largest){
              largest = numbers;
              counter ++;
            }
            else
            break;
            
                
            
        }
        System.out.println("largest number is " +largest);
        System.out.println("NAME-TUSHAR BARANWAL,ROLL NO-11");


    }
}

