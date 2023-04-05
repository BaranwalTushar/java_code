import java.util.ArrayList;
import java.util.Scanner;

interface Department {
    String deptName = "MCA";
    String deptHead = "KBH";

    abstract void printData();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numRooms;

    Hostel(String hostelName, String hostelLocation, int numRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numRooms = numRooms;
    }

    void showData() {
        System.out.println("Hostel Name : " + this.hostelName);
        System.out.println("Hostel Location : " + this.hostelLocation);
        System.out.println("Number of Rooms : " + this.numRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    float avgMarks;

    Student(String studentName, int regdNo, String electiveSubject, float avgMarks, String hostelName,
            String hostelLocation, int numRooms) {
        super(hostelName, hostelLocation, numRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    public void printData() {
        System.out.println("Student Name : " + this.studentName);
        System.out.println("Registration Number : " + this.regdNo);
        System.out.println("Elective Subject : " + this.electiveSubject);
        System.out.println("Average Marks : " + this.avgMarks);
        super.showData();
    }
}

public class aass_5_ques_3 {
    public static void main(String[] args) {
     
class DepartmentMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String studentName, hostelName, hostelLocation, electiveSubject;
        int regdNo, numRooms;
        float avgMarks;

        ArrayList<Student> s = new ArrayList<Student>();
        int option;
        do {
            System.out.println("\n\nEnter '1' to Admit New Student");
            System.out.println("Enter '2' to Migrate a Student");
            System.out.println("Enter '3' to Display details of a Student");
            System.out.println("Enter '0' to Exit");
            System.out.print("Your Choice >>> ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Student Name : ");
                    studentName = sc.nextLine();
                    System.out.println("Registration Number : ");
                    regdNo = sc.nextInt();
                    System.out.println("Elective Subject : ");
                    sc.nextLine();
                    electiveSubject = sc.nextLine();
                    System.out.println("Average Marks : ");
                    avgMarks = sc.nextFloat();
                    System.out.println("Hostel Name : ");
                    sc.nextLine();
                    hostelName = sc.nextLine();
                    System.out.println("Hostel Location : ");
                    hostelLocation = sc.nextLine();
                    System.out.println("Number of Rooms : ");
                    numRooms = sc.nextInt();
                    Student s1 = new Student(studentName, regdNo, electiveSubject, avgMarks, hostelName, hostelLocation,
                            numRooms);
                    s.add(s1);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Enter Registration Number to Find : ");
                    int search = sc.nextInt();
                    int flag = 0;
                    for (int i = 0; i < s.size(); i++) {
                        if (s.get(i).regdNo == search) {
                            System.out.println("\nMatch Found\n");
                            s.get(i).printData();
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Student is not Present in the List");
                    }
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }
}
    }
    
}
