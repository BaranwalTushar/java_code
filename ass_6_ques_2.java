 class Nonalphabetic extends Exception{
   int count = 0;
  
    public void addingcharacter(char c) throws Exception {
        if (!Character.isLetter(c)) {  //this is imortant (!Character.isLetter(c))
            throw new Exception("Non-alphabetic character detected");
        }
        count++;
    }
    
     public int getnumber() { // this is also important to call nonalphabetic method
          return count;
      }
}
public class ass_6_ques_2 {
    
    public static void main(String[] args) {
        Nonalphabetic Tushar = new Nonalphabetic();
      try{
        
             Tushar.addingcharacter('a');
             Tushar.addingcharacter('b');
             System.out.println(Tushar.getnumber());
             Tushar.addingcharacter('1');
             Tushar.addingcharacter('c');
             
      }
      catch(Exception e){
        System.out.println("shows Error");
        System.out.println(e);

      }
      System.out.println("Name -TUSHAR BARANWAL,ROLL NO-11");
        
        
    }
    
}
