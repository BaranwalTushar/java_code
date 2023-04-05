
class Building{
    int floors;
    int rooms;
    int footage;

      Building(int floors,int rooms,int footage){

         this.floors = floors;
         this.rooms = rooms;
         this.footage = footage;
    }
    int getfloors(){
        return floors;
    }
    void setfloors(int floors){
        this.floors = floors;
    }
    int getrooms(){
        return rooms;
    }
    void setrooms(int rooms){
        this.rooms = rooms;
    }
    int getfootage(){
        return footage;
    }
    void setfootage(int footage){
        this.footage = footage;
    }

}
class House extends Building{
    int bedrooms;
    int bathrooms;
    House(int bedrooms,int bathrooms,int floors,int rooms,int footage){
        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;        
    }
    int getbedrooms(){
        return bedrooms;
    }
    void setbedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }
    int getbathrooms(){
        return bathrooms;
    }
    void setbathrooms(int bathrooms){
        this.bathrooms = bathrooms;
    }
}
public class question_ass4 {
    public static void main(String[] args) {
       

        
        House B = new House(20,25,15,20,1000);
        System.out.println("NO of Bedrooms " +B.getbedrooms());
        System.out.println("No of bathrooms"+B.getbathrooms());
        System.out.println("No. of floors " +B.getfloors());
        System.out.println("No of rooms "+B.getrooms());
        System.out.println("no. of footage " +B.getfootage());
        System.out.println("");
        System.out.println("Name-Tushar Baranwal,Roll No-11");
        
    }
    
}
