class usestatic{
    static int a = 4;
    static int b= 5;

    static void num(int x,int y){
        System.out.println("x = "+x + " y =" +y);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    static{
        System.out.println("static meythod initialized :");
         a = b*5;
    
    }
    public static void main(String args[]){
        num(34,45);
    }
}