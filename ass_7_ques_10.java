class Table{
    void printtable(int n){
     for(int i=1;i<=10;i++){
        System.out.println(n*i);
     }
       
    }
}

class Mythread8 extends Thread{
    Table s;
    Mythread8(Table s){
        this.s = s;
    }
    public synchronized void run(){
        s.printtable(5);
    }
}
class Mythread9 extends Thread{
    Table s;
    
    Mythread9(Table s){
        this.s = s;
    }
    public synchronized void run(){
        s.printtable(7);
    }
} 
    

    

public class ass_7_ques_10 {
    public static void main(String[] args) {

        Table sq = new Table();
        Mythread8 th1 = new Mythread8(sq);
        Mythread9  th2 = new Mythread9(sq); 
        th1.start();
        th2.start();

        System.out.println("Name= Tushar Baranwal ,Roll no-11");
        
    }
    
}
