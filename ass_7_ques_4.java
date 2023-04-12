class Mythread5 extends Thread{
    String name;
    Mythread5(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Thread " +name + " is a Master");
    }
}
public class ass_7_ques_4 {
    public static void main(String[] args) {
        Mythread5 th = new Mythread5("Tushar");
        Mythread5 th1 = new Mythread5("vaibhav");
        th.start();
        th1.start();

        System.out.println("Name= Tushar Baranwal,Roll No-11");
        
    }
    
}
