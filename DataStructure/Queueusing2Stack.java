import java.util.Stack;
public class Queueusing2Stack<T> {
    private  Stack<T> s1;
    private  Stack<T> s2;
    private  int size;

    public Queueusing2Stack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
        size=0;
    }

    int getSize(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    void enqueue(T elem){
        s1.push(elem);
        size++;
    }

    T dequeue() throws StackEmptyException{
        if(s1.isEmpty()) throw new StackEmptyException();
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        T dequeue_elem= s1.pop();
//        s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        size--;
        return dequeue_elem;
    }

    T front() throws StackEmptyException{
        if(s1.isEmpty()) throw new StackEmptyException();
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T front_elem = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return front_elem;
    }

    public static void main(String[] args) throws Exception{
        Queueusing2Stack<Integer> q1= new Queueusing2Stack<>();
        for(int i=1; i<=5; i++){
            q1.enqueue(10*i);
        }

        System.out.println("Element at the front : "+q1.front());
        System.out.println("Size of the element: " + q1.getSize());
        System.out.println("Dequeue element one by one : ");
        while(!q1.isEmpty()){
            System.out.println(q1.dequeue());
        }

    }


}
