class Mythread4 extends Thread{
    String name;
    int i;
    Mythread4(String name){
        super(name);
    }
    public void run(){
        while(i<2000){
            System.out.println("I am a " +getName());
            i++;
        }
    }
}
public class ass_7_ques_ {
    public static void main(String[] args) {
        Mythread4 th = new Mythread4("Tushar");
        Mythread4 th1 = new Mythread4("Tarique");
        Mythread4 th2 = new Mythread4("Vaibhav");

        th.setPriority(Thread.MIN_PRIORITY);
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        
        th.start();
        th1.start();
        th2.start();
        
    }
    
}
