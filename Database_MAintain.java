class staff{
    private int mycode;
     private String Myname;
    
   public staff(int code,String name){
        System.out.println("Staff data base");
        mycode = code;
        Myname = name;

    }
    
    public String  getMyname(){
        return Myname;
    }
    public void setmycode(int i){
        mycode = i;
    }
    public int getmycode(){
        return mycode;
    }
}
class Teacher{
    private String mysubject;
    private String mypublication;

     public Teacher(String subject,String publication){
        System.out.println("Teacher Database");
        mysubject = subject;
        mypublication = publication;
     }
     public String getmysubject(){
        return mysubject;
     }
     public String getmypublication(){
        return mypublication;
     }
}
class officer{
    private String  mygrade;

   public officer(String grade){
        System.out.println("officer database");
        mygrade = grade;
    }
    public String getmygrade(){
        return mygrade;
    }
}
class Typist{
    private int myspeed;
    public Typist(int speed){
        System.out.println("typist database");
        myspeed = speed;
    }
    public int getmyspeed(){
        return myspeed;
    }
    public void getmyspeed(int y){
        myspeed = y;
    }
}
class RegularTypist{
    private int myremmuneration;
    public RegularTypist(int remmuneration){
        System.out.println("Regular typist amount");
        myremmuneration = remmuneration;
    }
    public int getmyremmuneration(){
        return myremmuneration;
    }
    public void setmyremmuneration(int j){
        myremmuneration=j;
    }
}
public class Database_MAintain {
    public static void main(String[] args){
        staff sf = new staff(121,"arnav");
        System.out.println(sf.getmycode());
        System.out.println(sf.getMyname());
        System.out.println(" ");

        Teacher th = new Teacher( "Java", "Hebert Schildt");
        System.out.println("The subject name is " + th.getmysubject());
        System.out.println("The publication of "+th.getmypublication());
        System.out.println(" ");

        officer of = new officer("A+ rank");
        System.out.println("The rank of the officer is :" + of.getmygrade());
        System.out.println(" ");

        Typist ty = new Typist(12);
        System.out.println("The Typing speed of  Typist in one hrs. is " + ty.getmyspeed());
        System.out.println(" ");

        RegularTypist rt = new RegularTypist(15);
        System.out.println("The Typing speed of Regular Typist in one hrs. is " + rt.getmyremmuneration());
        System.out.println(" ");
        System.out.println("Name-Tushar Baranwal,Roll NO-11");
    }
    
}
