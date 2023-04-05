public class reverse_string {
    public static void main(String[] args) {
       String name = "tushar";
          char[] reversed = name.toCharArray();
          for(int i = reversed.length-1;i>=0;i--){
            System.out.println(reversed[i]);
          }
           
    }
    
}
