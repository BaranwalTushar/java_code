import javax.sound.sampled.SourceDataLine;

class tushar{
    String define_me(){
        return "TCS";
    }

}
class tus extends tushar{
    String define_me(){
        return "i have no life ";
    }
    tus(){
        System.out.println("i am a programmer and " +define_me());
        String disply = super.define_me();
        System.out.println("i got the job in " +disply);

    }

}
public class hackerrank_8 {
    public static void main(String[] args) {
        tus T = new tus();
        
    }
    
}
