public class hackerrank_15 {
    public static void main(String[] args) {
        //fabinacci series
        //0 1 1 2 3 5 8
        int count =7;
        int a =0;
        int b =1;
        
        for(int i=0;i<count;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }

    }
    
}
