class ThreadRunnable implements Runnable{
    int i;
    public void run(){
        while(i<1000){
            System.out.println("Hey! i am a Tushar");
            i++;
        }
    }

}
class ThreadRunnable1 implements Runnable{
    int i;
    public void run(){
        while(i<1000){
            System.out.println("Hiii! I am java Developer");
            i++;
        }
    }
}
public class ass_7_ques_2 {
    public static void main(String[] args) {
        ThreadRunnable th = new ThreadRunnable();
        Thread th1 = new Thread(th);

        ThreadRunnable1 th2 = new ThreadRunnable1();
        Thread th3 = new Thread(th2);
        th1.start();
        th3.start();

        System.out.println("Name=Tushar Baranwal ,Roll No=11");
        
    }
    
}
