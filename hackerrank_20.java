public class hackerrank_20 {
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
        
    }
    public static void main(String[] args) {
        System.out.println("the factorial of given no. is "+factorial(20));
    }
    
}
