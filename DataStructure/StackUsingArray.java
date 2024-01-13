
import java.util.Scanner;

public class StackUsingArray {

    private int[] data;    // we will keep data and top private because e don't ant anybody to access and change the value from outside by creating an object ..
    private int top;

    public StackUsingArray(){
        data= new int[10];
        top= -1;
    }
    public StackUsingArray(int capacity){
        data= new int[capacity];
        top= -1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException{
        if(size()==0) throw new StackEmptyException();
        return data[top];
    }

    public void push(int elem) /*throws StackFullException*/ {

//      if(size()== data.length) throw new StackFullException();
        if(size()==data.length){
            doubleCapacity();
        }
        top++;
        data[top]= elem;
    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[2 * temp.length];
        for(int i=0; i<temp.length; i++){
            data[i]= temp[i];
        }
    }

    public int pop() throws StackEmptyException{
        if(size()== 0) throw new StackEmptyException();
        int temp= data[top];
        top--;
        return temp;

    }

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int capacity= sc.nextInt();
        StackUsingArray stack = new StackUsingArray(capacity);
        for(int i=0; i<=capacity; i++){
            stack.push(i);
        }
        int j=capacity;
        while(!stack.isEmpty()){
            try{
                System.out.println(j+"-> "+stack.pop());
                j--;
            }catch (StackEmptyException ignored){   //ignored is a parameter.
                ///we will never reach here .
            }
        }

    }

}
