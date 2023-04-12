 class Mythread6 extends Thread{
    String name;
    Mythread6(String name){
        this.name = name;

    }

 }
public class ass_7_ques_7 {
    public static void main(String[] args) {
       
        try{
            Mythread6 th = new Mythread6("Thread class");     
        th.start(); 
        }
         catch(Exception e){
            System.out.println(e);
         }
         finally{
            System.out.println("No output occur because we didn't define run() method");

            System.out.println();
            System.out.println("Name=Tushar Baranwal, Roll no=11");
         }
        
    }
    
}
