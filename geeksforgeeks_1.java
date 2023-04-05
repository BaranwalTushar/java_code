class Add{
    int a;
    int b;
    Add(int a,int b){
        this.a = a;
        this.b = b;
    }
    void add(int a,int b){
        System.out.println("the sum of two number is :"+ (a+b));
    }
}
class Multiply extends Add{
    Multiply(int a ,int b){
        super(a, b);
    }
    void multiply(int a,int b){
        System.out.println("the multiply of two number is" + a*b);
    }
}
public class geeksforgeeks_1 {
    public static void main(String[] args) {
        
        Multiply M = new Multiply(2, 3);
        M.add(2, 3);

        // Add A = new Add(0, 0);
        // A.add(2, 3);
    }
    
}
