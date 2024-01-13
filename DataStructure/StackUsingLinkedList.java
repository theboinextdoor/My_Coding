import java.util.Scanner;

public class StackUsingLinkedList<T> {

    private StackUsingLinkedList<T> head;
    private StackUsingLinkedList<T> next;
    private StackUsingLinkedList<T> tail;
    private static int size;
    private T data;

    public StackUsingLinkedList(){
        head= null;
        size= 0;
    }
    public StackUsingLinkedList(T element){
        this.data= element;
    }

    public int getsize(){
        if(head== null) return 0;
        return size;
    }

    public T top(){
        if(head==null) return null;
        return head.data;
    }

    public boolean isExpmty(){
        return (head==null);
    }



    public T pop() throws StackEmptyException{
        if(head==null) {
            throw new StackEmptyException();
        }
       T temp = head.data;

        head= head.next;
        size--;
        return temp;
    }

    public void push(int elem){

        StackUsingLinkedList<T> newNode = new StackUsingLinkedList(elem);
        if(head==null) {
            head=newNode;
            tail= newNode;
            tail.next= null;
            size++;
            return ;
        }
        newNode.next= head;
        head= newNode;
        size++;
    }

    public void takeInput(){
        Scanner sc= new Scanner(System.in);
        int val= sc.nextInt();
        while(val != -1){
            push(val);
            val= sc.nextInt();
        }
    }

    public void printStackItem(){
        int stackNum=size;
        if(head==null) return ;
        StackUsingLinkedList<T> temp = head;
        while(temp != tail.next){
            System.out.print(stackNum+"-> ");
            System.out.println(temp.data);
            temp= temp.next;
            stackNum--;
        }
    }


    public static void main(String[] args) throws StackEmptyException {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        stack.takeInput();
        stack.printStackItem();
        System.out.println("Is Stack Empty: "+stack.isExpmty());
        System.out.println("Size of the Element is: "+ stack.getsize());
        System.out.println("The Top Most ELement is : "+ stack.top());
        System.out.println("Popping out the Top Element : "+stack.pop());
        System.out.println("After Popping the Top most ELement is : "+stack.top());

    }
}
