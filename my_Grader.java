import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
class Grader{
    int score;
    Grader(int s){
       score = s;
    }
    String letterGrade(){
        if(score==70){
        return "O";
        }
        else if(score==80){
        return "E";
        }

        else if(score==85){
        return "A";
        }

        else if(score==90){
            return "B";
        }
        
        else{
            return "c";
        }

    }
}
public class my_Grader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Score:");
        int score = sc.nextInt();
        
        if(score>100){
            System.out.println("invalid input...");
        }
        else{
     
              Grader gr = new Grader(score);
            //   String grading;

            //   grading = gr.letterGrade();

              System.out.println("The Grade got by Student is :" +gr.letterGrade());

              
        }
          System.out.println("Name-Tushar Baranwal, Roll No-11");
        
    }
    
}
