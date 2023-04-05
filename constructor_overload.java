class box1{
   double width;
   double height;
   double depth;

   box1(double w,double d,double h){
        width= w;
        height =h;
        depth = d;
   }
   box1(){
    width = 1;
    height = 1;
    depth = 1;
   }
   box1(double len){
    width=height=depth=len;
   }
   box1(box1 ob){      //pass object to constructor
    width = ob.width;
    depth = ob.depth;
    height = ob.height;
   }

   double volume(){
    return width *height*depth;
   }
}

public class constructor_overload {
    public static void main(String[] args) {
     box1 tushar = new box1(5,6,7);
     box1 sayak = new box1();
     box1 cube = new box1(2.0); 
     box1 myclone = new box1(tushar);
     System.out.println("The volume of tushar box1 is " + tushar.volume());
     System.out.println("The volume of sayak box1 is :" + sayak.volume());
     System.out.println("The volume of cube box1 is " + cube.volume());
     System.out.println(myclone.volume());
      
    }
    
}
