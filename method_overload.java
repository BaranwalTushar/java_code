import java.net.SocketTimeoutException;

class overload{
    void test(){
      System.out.println("no parameter");
    }
    void test(int a){
        System.out.println("a " +a);
    }
    void test(int a,int b){
        System.out.println("a and b " + a + " " + b);
    }
    double test(double c){
         
        return c*c;
    }
}
public class method_overload {
    public static void main(String[] args) {
         overload ob = new overload();
        //  double result;
         ob.test();
         ob.test(5);
         ob.test(4,5);
        //  result  = ob.test(5.5);
        
         System.out.println("the reult of ob.test" + ob.test(5.5));
        
                 
    }
    
}
