import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StackUsing2Queue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public StackUsing2Queue(){
        q1= new LinkedList<>();
        q2= new LinkedList<>();
        size = 0;
    }

    int getsize(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    void push(int elem){
        q1.add(elem);
        size++;
    }

    int pop() throws QueueEmptyException{
        if(q1.isEmpty()) throw new QueueEmptyException();
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int popping_elem = q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        size--;
        return popping_elem;
    }

    int top() throws QueueEmptyException{
        if(q1.isEmpty()) throw new QueueEmptyException();
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int top_elem= q1.peek();
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1= q2;
        q2= temp;
        return top_elem;
    }

    public static void main(String[] args) {
        StackUsing2Queue s1= new StackUsing2Queue();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println();
        System.out.println("Size of the satck: "+ s1.getsize());
        try{
            System.out.println("Element at te top: "+ s1.top());

        }catch(QueueEmptyException ignored){
            //nothing to do here
        }
        System.out.println();
        while(!s1.isEmpty()){
            try{
                System.out.println(s1.pop());

            }catch(QueueEmptyException ignored){
                //nothing to do here
            }
        }
        System.out.println("Stack is Empty ? :- "+s1.isEmpty());

    }









}
