class Myexception1 extends Exception{
    String message;
    Myexception1(String message){
           this.message = message;
    }
}
public class ass_6_ques_4 {
    public static void main(String[] args) {
        int sum =0;
        try{
            if(args.length<4){
                throw new Myexception1("required 5 numbers");

            }
            else{
            
                for(int i=0;i<5;i++){
                    sum += Integer.parseInt(args[i]); //important
                   
                }
                System.out.println("Sum = " +sum);
            }
        }
        catch(Myexception1 e){
            System.out.println("error "+e.getMessage());
            System.out.println("error caught");
        }
        finally{
            System.out.println("Name-TUSHAR BARANWAL, ROLL NO -11");
        }
        
    }
    
}
