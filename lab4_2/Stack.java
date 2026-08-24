package lab4_2;

public class Stack {
    private int top;
    int stack[];

    void create(int n){
        stack = new int[n];
        top =-1;
    }
    void display(){
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i]+" ");
        }
    }
    boolean empty(){
        return top==-1;
    }
    void push(int x){
        stack[++top] = x;
    }
    int pop(){
        return stack[top--];
    }



}
