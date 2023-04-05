class methodoverloding{
    void area(int l,int b){
        System.out.println("the area of rectangle is :" + l*b);
    }

    void area(int l){
        System.out.println("the area of squaare is " + l*l);
    }

    void area(float r){
        System.out.println("the area of circle is :" + 3.14*r*r);
    }
    void area(float h,float b){
        System.out.println("the area of triangle is : " +0.5*h*b);
    }
}
public class area_methodoverriding {
    public static void main(String[] args) {

    methodoverloding tus = new methodoverloding();
    tus.area(4,5);
    tus.area(5);
    tus.area(4.0f);
    tus.area(3.0f,5.0f);
    
        
    }
    
}
