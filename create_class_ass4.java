import java.util.Scanner;
class threedobject{
    double length;
    double breadth;
    double height;
    double radius;

    threedobject(double l,double b,double h,double r){
          
        length = l;
        breadth = b;
        height = h;
        radius = r;
    }
    double surfacearea(){
        return 0;
    }
    double volume(){
        return 0;
    }
}
    class box extends threedobject{
        box(double l,double b,double h){
            super(l, b, h,0);
        }
         @Override
        double surfacearea(){
            return 2*(length*breadth + breadth*height + length*height);
        }
        @Override
        double volume(){
            return length*breadth*height;
        }
    }
    class cube extends threedobject{
        double side;
        cube(double s){
            super(s, s, s,0);
        }
        @Override
        double surfacearea(){
            return 6*side*side;
        }
        double volume(){
            return side*side*side;
        }

    }
    class cone extends threedobject{
        cone(double h,double r){
            super(0,0, h, r);
        }
        @Override
        double surfacearea(){
            //A=πr(r+h2+r2)
            return 3.14 * radius*(radius + Math.sqrt(height*height + radius*radius));

        }
        @Override
        double volume(){
           return 3.14 *radius*radius/3;
        }

          

    }
public class create_class_ass4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of length,breadth and height ");
        
        box B = new box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("the surface area of box "+ B.surfacearea());
        System.out.println("the volume of box " +B.volume());

        System.out.println("enter the value of side is ");
        cube C = new cube(sc.nextDouble());
        System.out.println("the surface area of cube is " +C.surfacearea());
        System.out.println("the surface area of cube is " +C.volume()); 
        
        System.out.println("enter the value of height and radius  is ");
        cone cn = new cone(sc.nextDouble(),sc.nextDouble());
        System.out.println("the surface area of cone "+cn.surfacearea());
        System.out.println("the volume of coin "+cn.volume());

        System.out.println(" ");
        System.out.println("name-TUSHAR BARANWAL,ROLL NO-11");
        sc.close();
        
    }
    
}
