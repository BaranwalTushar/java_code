interface stack{
    void push(int item);
    int pop();
}
class Mystack implements stack{
    int tos =-1;
    int stck[];
    Mystack(int stck){
        this.stck = new int[stck];
    }
    public void push(int item){
        if(tos == stck.length-1){
            System.out.println("Stack is overflow");
        }
        else{
            stck[++ tos] = item;
        }
    }
    public int pop(){
        if(tos<0){
            System.out.println("stack is underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
public class interface_stack {
    public static void main(String[] args) {
         
        Mystack st = new Mystack(5);
        Mystack ts = new Mystack(8);

        for(int i=0;i<5;i++) st.push(i);
        for(int i =0;i<8;i++) ts.push(i);

        System.out.println("my stack in st");
        for(int i=0;i<5;i++){
            System.out.println(st.pop());
        }
        for(int i=0;i<8;i++){
            System.out.println(ts.pop());
        }
        
    }
    
}
