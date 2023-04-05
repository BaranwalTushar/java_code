import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        n = sc.nextInt();
        double e=0;
        double factorial =1;

        for(int i=0;i<=n;i++){
            if(i==0){
                e=1;
            }
            else{
                factorial *=i;
                e +=1/factorial;
            }
        }
        System.out.println("e ="+e);
        System.out.println("NAME-TUSHAR BARANWAL,ROLL NO-11");
    }
}
