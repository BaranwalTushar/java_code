class ThreadRunnable2 implements Runnable{
    int i;
    public void run(){
        while(i<1000){
            System.out.println("Hey! i am a Tushar");
            i++;
        }
    }

}
class ThreadRunnable3 implements Runnable{
    int i;
    public void run(){
        while(i<1000){
            System.out.println("Hiii! I am java Developer");
            i++;
        }
    }
}
public class ass_7_ques_6 {
    public static void main(String[] args) {
        ThreadRunnable2 th = new ThreadRunnable2();
        Thread th1 = new Thread(th);

        ThreadRunnable3 th2 = new ThreadRunnable3();
        Thread th3 = new Thread(th2);
        th1.stop(); // STOP METHOD
        th3.start();

        

        System.out.println("Name=Tushar Baranwal ,Roll No=11");
        
        
    }
    
}
