class A{
        public interface Nestedif{
        boolean isnotnegative(int x);
    }
}
class B implements A.Nestedif{
    public boolean isnotnegative(int x){
        return x<0 ? false : true;
    }
}
public class interface_book_1 {
    public static void main(String[] args) {
        A.Nestedif nif = new B();
        if(nif.isnotnegative(10))
            System.out.println("10 is not negative....");
        
        if(nif.isnotnegative(-10))
            System.out.println("won't be displayed");
        
    }
    
}
