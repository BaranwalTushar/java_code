 
public class ass_6_ques_5 {
    static class Myexception extends Exception{
        String message;
        Myexception(String message){
            this.message = message;
        }
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int p =5;
        int q = 4;
        int z = 2;
        int i =4 ;

        try{
            int answer = x+y*(p/q)*z-i;
            if(q==0){
                throw new Myexception("cant be divided by zero... ");
            }
            else if(p%q == 0){
                throw new Myexception("cant divided");

            }
            else{
                 System.out.println("Answer = "+answer);
            }
        }
        catch(Myexception e){
            System.out.println(e.getMessage());

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }

       
        finally{
            System.out.println("program finished...");
            System.out.println("NAME-TUSHAR BARANWAL , ROLL NO-11");
        }
    }
    
}
