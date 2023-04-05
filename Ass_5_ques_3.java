import java.util.*;
interface Department{
    void dept_name();
    void dept_head();
}
class hostel{
    String hostelname;
    String hostellocation;
    int numberofrooms;

    hostel(String hostelname,String hostellocation,int numberofrooms){
        this.hostelname = hostelname;
        this.hostellocation = hostellocation;
        this.numberofrooms = numberofrooms;
    }
    void hostelname(){
        System.out.println("Hostel Name " +hostelname);

    }
    void hostellocation(){
        System.out.println("Hostel location " +hostellocation);
    }
    void numberofrooms(){
        System.out.println("Number of Rooms "+numberofrooms);
    }
}
class Students extends hostel implements Department{
    String student_name;
    String regd_no;
    String elective_subject;
    float avg_marks;
    Students(String student_name,String regd_no,String elective_subject,float avg_marks,String hostelname,String hostellocation,int numberofrooms){
        super(hostelname, hostellocation, numberofrooms);
        this.student_name = student_name;
        this.regd_no = regd_no;
        this.elective_subject = elective_subject;
        this.avg_marks = avg_marks;
    }
    void student_name(){
        System.out.println("Student Name "+student_name);
    }
    void regd_no(){
        System.out.println("Regd.No "+regd_no);
    }
    void elective_subject(){
        System.out.println("Elective Subject "+elective_subject);

    }
    void avg_marks(){
        System.out.println("Avg_marks "+avg_marks);
    }
    public void dept_name(){
        System.out.println("Cse Department");

    }
    public void dept_head(){
        System.out.println("Kaustuv sir");
    }
    void addstudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        student_name = sc.nextLine();
        System.out.println("Enter your registration number");
        regd_no = sc.nextLine();
        System.out.println("enter elective subject ");
        elective_subject = sc.nextLine();
        

    }
    
    

}





public class Ass_5_ques_3 {
    
    public static void main(String[] args) {
       

        }
        

        
        
    }
    

