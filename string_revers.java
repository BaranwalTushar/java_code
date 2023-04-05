public class string_revers {
    public static void main(String[] args) {
        String s1 = "tushar";
        String s2 = "lovevaishnavi";

       String sum = s1 + s2;
       char[] reversed = sum.toCharArray();//important
          
       for(int i=reversed.length-1;i>=0;i--){
        System.out.print(reversed[i]);
       }


    }
    
}
