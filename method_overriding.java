class A1{
    int i;
    int j;
    A1(int a,int b){
        i = a;
        j =b;
    }
    void show(){
        
        System.out.println("i and j "+i + " " +j);
    }
}
class B1 extends A1{
    int k;
    B1(int a,int b,int c){
        super(a, b);
        k = c;
    }
    void show(){
        super.show(); //IMPORTANT TO PRINT SUPER WE HAVE TO USE (super.show) keyword
        System.out.println("k " + k);
    }

}
public class method_overriding {
    public static void main(String[] args) {
      B1 tus = new B1(2, 2, 2);
      tus.show();
    }
    
}
