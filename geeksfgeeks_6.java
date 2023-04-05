class Sports{
    String sports;
    Sports(String sports){
        this.sports = sports;
    }
      void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in generic sports "  );
    }
    
}
class Soccer extends Sports{
    String soccer;
    Soccer(String sports,String soccer){
        super(sports);
        this.soccer = soccer;
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in soccer class"  );
    }

    
}
public class geeksfgeeks_6 {
    public static void main(String[] args) {
       Soccer S = new Soccer("generic sports", "soccer class");
       System.out.println(S.soccer);
       S.getNumberOfTeamMembers();

       Sports tus = new Sports("generic sports");
       System.out.println(tus.sports);
       tus.getNumberOfTeamMembers();
        
    }
    
    
}
