class Hotel implements Runnable{
    int seat,available =2;
    Hotel(int seat){
        this.seat = seat;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();// Important
        if(available>=seat){
            System.out.println(name + " got the seat");
            available = available-seat;
        }
        else{
            System.out.println("Sorry seat is not available");
        }

    }
}

public class ass_7_ques_8 {
    public static void main(String[] args) {
        Hotel H = new Hotel(1);
        Thread H1 = new Thread(H);
        Thread H2 = new Thread(H);
        Thread H3 = new Thread(H);

        H1.setName("Tushar");
        H2.setName("vaibhav");
        H3.setName("Tarique");

        H1.start();
        H2.start();
        H3.start();

        System.out.println("Name-Tushar Baranwal,Roll no-11");
        
    }
    
}
