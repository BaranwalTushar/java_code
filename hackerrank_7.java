class Motorcycle{
    String define_me(){
        return "a vehicel with pedals.";
    }
}
class Bicycle extends Motorcycle{
    String define_me(){
        return "a cycle with an engine.";
    }
    Bicycle(){
        System.out.println("i am a motorcycle ,i am " +define_me());
         String display = super.define_me();
         System.out.println("my ancestor is a cycle who is a cycle who is "+display);
    }
}
public class hackerrank_7 {
    public static void main(String[] args) {

        Bicycle B = new Bicycle();
       
    }
    
}
