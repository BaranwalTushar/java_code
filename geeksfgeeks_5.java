abstract class Book{
    String title;
    Book(String title){
        this.title = title;
    }
    abstract void settitles(String s);
    String gettitle(){
        return title;
    }

}
class Mybook extends Book{
    Mybook(String title){
        super(title);
    }
    void settitles(String s){
        System.out.print("The title is : ");
    }
}
public class geeksfgeeks_5 {
    public static void main(String[] args) {
        Mybook M = new Mybook("the tale of two cities");
        M.settitles(null);
        System.out.println(M.gettitle());
        
    }
    
}
