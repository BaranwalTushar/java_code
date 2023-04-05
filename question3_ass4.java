 class Building1{
    int floors;
    int rooms;
    int footage;

      public Building1(int floors,int rooms,int footage){

         this.floors = floors;
         this.rooms = rooms;
         this.footage = footage;
      }
      void display(int floors,int rooms,int footage){
        System.out.println("the number of floors,rooms and footage is" + floors + " " +rooms +" " +footage);
      }
    }
     class House1 extends Building1{
    int bedrooms;
    int bathrooms;
    public House1(int floors,int rooms,int footage,int bedrooms,int bathrooms){

    super(floors,rooms,footage);

    this.bedrooms = bedrooms;
    this.bathrooms = bathrooms;
    }
    void display(int floors,int rooms,int footage,int bedrooms,int bathrooms){
        System.out.println("the number of floors,rooms,footage,bedrooms,bathrooms "+ floors +" " +rooms +" " +footage +" " +bedrooms +" "+ bathrooms);
    }
}
class Office extends Building1{
    int telephone;
    int tables;
    public Office(int floors,int rooms,int footage,int telephone,int tables){

        super(floors,rooms,footage);

        this.telephone = telephone;
        this.tables = tables;

    }
    void display(int floors,int rooms,int footage,int telephone,int tables){
        System.out.println("the number of floors,rooms,footage,telephone,tables "+ floors +" " +rooms +" " +footage +" " +telephone +" "+ tables);
    }
}

public class question3_ass4 {
    public static void main(String[] args) {

        Building1 B = new Building1(0, 0, 0);
        B.display(15, 25, 50);

        House1 H = new House1(0, 0, 0, 0, 0);
        H.display(20, 50, 100, 120, 50);

        Office O = new Office(0, 0, 0, 0, 0);
        O.display(25, 50, 100, 5, 4);
    }
    
}
