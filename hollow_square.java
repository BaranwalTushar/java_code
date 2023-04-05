import java.util.Scanner;
public class hollow_square {
    public static void main(String[] args) {
        int size;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size ");

       size = sc.nextInt();
       for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++){
            if(i==1 || i==size ||j==1 || j==size){
                System.out.println("*");
            }
            else{
                System.out.println(" ");
            }
        }
        System.out.println();
       }
       
      
    }
    
}
