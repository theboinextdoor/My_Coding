public class QueueUsingLinkedList<T> {
    private T data;
    private int size;
    private QueueUsingLinkedList<T> front;
    private QueueUsingLinkedList<T> rear;
    private QueueUsingLinkedList<T> next;



    public QueueUsingLinkedList(){
        front= null;
        rear= null;
        size= 0;
    }

    public QueueUsingLinkedList(T element){
        this.data= element;
    }

    int size(){
        return size;
    }

    T front() throws QueueEmptyException{
        if(front==null) throw new QueueEmptyException();
        return rear.data;
    }

    boolean isEmpty(){
        return size==0;
    }

    void enqueue(T element){
        QueueUsingLinkedList<T> newnode = new QueueUsingLinkedList<>(element);
        if(front == null){
//            front.next= newnode ;
            front= newnode;
            rear= newnode;

        }else{
            rear.next = newnode;
            rear= newnode;
        }
        size++;
    }

    T dequeue() throws QueueEmptyException{
        if(size == 0) throw new QueueEmptyException();
        T temp = front.data;
        front= front.next;
        size--;
        return temp;
    }

    public static void main(String[] args)  throws  Exception {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.front());
        System.out.println(queue.size());


        while(!queue.isEmpty()){

            System.out.println(queue.dequeue());
        }
    }

}
