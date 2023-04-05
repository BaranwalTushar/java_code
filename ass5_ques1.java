abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape{
    double length;
    double breadth;
   
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area(){
        return length*breadth;
    }
    @Override
    double perimeter(){
        return 2*(breadth+length);
    }
}
class Triangle extends Shape{
    double breadth;
    double height;
    double side1;
    double side2;
    double side3;
    Triangle(double breadth,double height,double side1,double side2,double side3){
        this.breadth = breadth;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    @Override
    double area(){
        return 0.5 * breadth * height;
    }
    @Override
    double perimeter(){
        return side1+side2+side3; 
    }
    
}
public class ass5_ques1 {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(3, 4);
        System.out.println("the area of rectangle is " + R.area());
        System.out.println("the perimeter of rectangle is "+R.perimeter());

        Triangle T = new Triangle(3, 4, 1, 1, 1);
        System.out.println("the area of triangle is " + T.area());
        System.out.println("the perimeter of triangle is "+T.perimeter());
        System.out.println();
        System.out.println("Name- Tushar Baranwal,Roll NO-11 ");

        
    }
    
}
