class stack{
    int[] stack = new int[10];
    int top;

    stack(){
        top = -1;
    }
    void push(int item){
        if(top==9){
        System.out.println("stack is overflow");
        }
        else{
            stack[++top] = item;
        }
        
    }
    int pop(){
        if(top<0){
            System.out.println("stack is underflow");
             return 0;
        }
        else{
            return stack[top--];
        }
    }
}
public class Test_stack {
    public static void main(String[] args) {
        stack tushar = new stack();
         for(int i=0;i<10;i++){
            tushar.push(i);
    }
        System.out.println("stack in tushar :");
        for(int i=0;i<10;i++){
            System.out.println(tushar.pop());
        }
        
    }
    
}
