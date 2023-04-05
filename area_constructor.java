class overloading{
    int lenth;
    int breadth;
    double height;
    double radius;
    double base;
    
    overloading(int l,int b){
        lenth = l;
        breadth =b;        
    }
    overloading(int l){
        lenth = l;
    }
    overloading(double r){
        radius = r;
    }
    overloading(double bs,double h){
        base = bs;
        height = h;
    }
    double area_rec(){
        return lenth*breadth; 
    }
     double area_sq(){
        return lenth*lenth;
     }
     double area_circle(){
        return 3.14*radius*radius;
     }
     double area_triangle(){
        return 0.5*base*height;
     }
}
public class area_constructor {
    public static void main(String[] args) {
        overloading tus = new overloading(4, 5);
        overloading tus1 = new overloading(5);
        overloading tus2 = new overloading(5.0);
        overloading tus3 = new overloading(3.0, 4.0);

        double area;
        area = tus.area_rec();
        System.out.println("the area of rectangle is " + area);

        area = tus1.area_sq();
        System.out.println("the area of square is " + area);

        area = tus2.area_circle();
        System.out.println("the area of circle is " + area);

        area = tus3.area_triangle();
        System.out.println("the area of triangle is " + area);
    }
    
}
