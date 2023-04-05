import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the year :");
       year = sc.nextInt();

      if(year%4==0){
        System.out.println("leap year");
      }
      else if(year % 100== 0){
        System.out.println("not leap year");
      }
      else if(year%400==0){
         System.out.println("leap year");
      }
      else{
        System.out.println("not leap year");  
      }
      System.out.println("Name-Tushar Baranwal ,Roll No.-11");
       
    }
    
}
