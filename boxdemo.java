class box{
    double width; 
    double height;
    double depth;

    box(double w,double h,double d){
       this.width = w;
       this.height =h;
       this.depth = d;
    }
    double volume(){
        return width*depth*height; 
    }

    
}
public class boxdemo{
    public static void main(String[] args) {
        box tushar = new box(10, 20, 30);
        System.out.println("the volume of box is " + tushar.volume());
    }
}