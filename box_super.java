class box1{
    double width;
    double length;
    double depth;

    box1(box1 ob){
        width = ob.width;
        length = ob.length;
        depth = ob.depth;
    }

    box1(double w,double l,double d){
        width = w;
        length = l;
        depth = d;
    }

    box1(){
        width = -1;
        length = -1;
        depth = 1;
    }
    box1(double len){
        width = length = depth = len; 
    }
    double volume(){
        return width*length*depth;
    }
}
class boxweight extends box1{
    double weight;
    boxweight(boxweight ob){
      super(ob);
      weight = ob.weight;        
    }
    boxweight(double w,double l,double d,double m){
        super(w,l,d);
        weight = m;
    }
    boxweight(){
        super();
        weight = -1;

    }
    boxweight(double len,double m){
        super(len);
        weight = m;
    }
}
public class box_super {
    public static void main(String[] args) {
        boxweight tus = new boxweight(2,2,2,4.0);
        boxweight tus1 = new boxweight(2,3,4,5);
        boxweight tus2 = new boxweight(3,2);
        boxweight tus3 = new boxweight();

        System.out.println("the volume of tus " +tus.volume());
        System.out.println(tus.weight);

        System.out.println("the voume of tus1 "+tus1.volume());
        System.out.println(tus1.weight);

        System.out.println("the volume of tus1 " +tus2.volume());
        System.out.println(tus2.weight);

        System.out.println("the volumem " +tus3.volume());
        System.out.println(tus3.weight);

    }
    
}
