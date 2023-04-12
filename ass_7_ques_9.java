class Mythread7 extends Thread{
    int counter =0,i,priority;
    Mythread7(int priority){
        this.priority = priority;
    }

    public void run(){
        while(i<=10){
         try{
            Thread.sleep(10);
         }
         catch(Exception e){
            System.out.println(e);
         }

            System.out.println("Thread priority " +priority + "count " +counter );
            i++;
            counter ++;
        }
        
    }
}

public class ass_7_ques_9 {
    public static void main(String[] args) {

        Mythread7 th1 = new Mythread7(1);
        Mythread7 th2 = new Mythread7(3);
        Mythread7 th3 = new Mythread7(5);
        Mythread7 th4 = new Mythread7(7);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        
        try{
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("Nmae-Tushar Baranwal,Roll No-11");
        
        
    }
    
}
