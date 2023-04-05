import javax.naming.ldap.ManageReferralControl;
class rectangle{
    int length = 4;
    int breadth = 5;;
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class square{
            int side = 5;
            public int area(){
                return 4*side;
            }
}
public class perimeter_rectangle_square {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        System.out.println(rect.perimeter());

        square sq = new square();
        System.out.println(sq.area());

        System.out.println("Name-Tushar Baranwal,  Roll No. - 11");
    }
    
}
