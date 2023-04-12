class Mythread extends Thread{
    int i;
   public void run(){
    while(i<1000){
        System.out.println("I am a java Developer...");
        i++;
    }

    }
}
class Mythread1 extends Thread{
    int i;
   public void run(){
    while(i<1000){
        System.out.println("I am a Python Developer...");
        i++;
    }

    }
}
class Mythread2 extends Thread{
    int i;
   public void run(){
    while(i<1000){
        System.out.println("I am a Mysql Developer...");
        i++;
    }

    }
}
class Mythread3 extends Thread{
    int i;
   public void run(){
    while(i<1000){
        System.out.println("I am a C language Developer...");
        i++;
    }

    }
}

public class ass_7_ques_1 {
    public static void main(String[] args) {
        Mythread  th1 =  new Mythread();
        Mythread1 th2 = new Mythread1();
        Mythread2 th3 = new Mythread2();
        Mythread3 th4 = new Mythread3();

        th1.setPriority(5);
        th2.setPriority(6);
        th3.setPriority(5);
        th4.setPriority(6);
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority());
        System.out.println(th4.getPriority());

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        
        System.out.println("Name= Tushar Baranwal,Roll no-11");
    }
    
}
