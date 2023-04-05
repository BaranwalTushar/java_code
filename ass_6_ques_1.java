import java.util.Scanner;
public class ass_6_ques_1 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with");
        int num = sc.nextInt();

        try{
            System.out.println("The value at array index entered  is: "+marks[ind]);
            System.out.println("the value of array value/number "+marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured ");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException occured ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception occured ");
            System.out.println(e);
        }
        System.out.println("NAME-TUSHAR BARANWAL,ROLL NO-11");

    }
    
}
