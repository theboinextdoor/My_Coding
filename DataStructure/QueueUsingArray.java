public class QueueUsingArray {

    private int[] data;
    private int size;  //size of the array;
    private int front; //index at which front element is stored.
    private int rear;  //index at which rear element is stored.


    public QueueUsingArray(){
        data= new int[10];
        front = -1;
        rear= -1;
        size = 0;
    }
    public QueueUsingArray(int capacity){
        data= new int[capacity];
        front = -1;
        rear= -1;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int front() throws QueueEmptyException{
        if(size==0) throw  new QueueEmptyException();
        else return data[front];
    }

    void enqueue(int element) {

        if(size==data.length) doubleCapacity();
        if(size == 0){
            front = 0;
        }
        size++;
        rear = (rear + 1) % data.length;
        data[rear] = element;

    }

    private void doubleCapacity(){
        int[] temp = data;
        int index= 0;
        data= new int [2 * temp.length];
        for(int i= front; i<temp.length; i++){
            data[index] = temp[i];
            index++;
        }
        for(int i=0; i<=front-1; i++){
            data[index]= temp[i];
            index++;
        }
        front= 0;
        rear= temp.length-1;
    }

    int dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }


    public static void main(String[] args)  {
        QueueUsingArray queue = new QueueUsingArray();
//        for(int i=0;  i<=5 ; i++){
//            queue.enqueue(i);
//        }
//
//        while(!queue.isEmpty()){
//            try{
//                System.out.println(queue.dequeue());
//            }catch(QueueEmptyException ignored){
//                //we are not doing anything
//            }
//        }

//        queue.enqueue(100);
//        System.out.println("Another Enqueue and dequeue: ");
//        try{
//            System.out.println(queue.dequeue());
//        }catch(QueueEmptyException ignored){
//            //we are not doing anything
//        }
    }
}
