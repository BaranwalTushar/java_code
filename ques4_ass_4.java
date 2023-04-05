class Distance{
    double miles;
    Distance(double miles){
        this.miles = miles;
    }
    void traveltime(){
        double time = miles/60.0;
        System.out.println("The time taken  to cover the distance with the speed of 60 miles per hour " + time);
    }
    
}
class Distancemks extends Distance{
    Distancemks(double kilometer){
        super(kilometer*0.61);
    }
    @Override
    void traveltime(){
        double time= miles / (100.0 / 3600.0);
        System.out.println("The time taken  to cover the distance with the speed of 100 km per second  "+time);

    }
}
public class ques4_ass_4 {
    public static void main(String[] args) {
        Distance D = new Distance(20);
        D.traveltime();

        Distancemks Dmks = new Distancemks(50);
        Dmks.traveltime();
                 
        System.out.println("Name-Tushar Baranwal , Roll No-11");
    }
    
}
