
import java.util.*;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }

    public static void print(Node<Integer> head) {
//        Node<Integer> temp= head;
        int i = 0;
        while (head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
            i++;
        }
        System.out.print("Null");
    }

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        while (value != -1) {
            Node<Integer> newNode = new Node<Integer>(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            value = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {

        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        int index = 0;
        Node<Integer> temp = head;
        while (index < pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        } else if (pos == 0) {
            head = head.next;

        } else {
            Node<Integer> temp = head;
            int index = 0;
            while (index < pos - 1 && temp != null) {
                temp = temp.next;
                index++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
        }

        return head;
    }

    public static int length(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        int index = 0;
        while (head != null) {
            head = head.next;
            index++;
        }
        return index;
    }

    public static Node<Integer> increment(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp.data++;
            temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

        int len = length(head);
        int destination = len - n;
        Node<Integer> temp = head, tail = null;
        int index = 0;
        while (index < destination - 1) {
            temp = temp.next;
            index++;
        }
        tail = temp;
        Node<Integer> newHead = temp.next, newTail = null;
        while (index < len - 1) {
            temp = temp.next;
            index++;
        }
        newTail = temp;
        newTail.next = head;
        head= newHead;
        tail.next = null;

        return head;
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> uniqueNode= head.next, node= head;
        while(uniqueNode!=null){
            if(!(uniqueNode.data).equals(node.data)){
                node.next= uniqueNode;
                node= node.next;
            }
            uniqueNode= uniqueNode.next;
        }
        node.next= uniqueNode;
        return head;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        if(head== null){
            return head;
        }
        Node<Integer> slow= head, fast = head;
        while( fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast= fast.next.next;

        }
        return slow;
    }

    public static Node<Integer> midpoint2(Node<Integer> head){
        if(head==null){
            return head;
        }
        Node<Integer> slow= head, fast= head;
        while(fast!=null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }


    public static Node<Integer> mergeLinkList(Node<Integer> head1, Node<Integer> head2){
         if(head1 == null ){
            return head2;
        }else if(head2 == null){
            return head1;
        }



        Node<Integer> t1= head1, t2= head2;
        Node<Integer> head= null, tail= null;

        //startring the operation by declaring the head and the tail
        if(t1.data <= t2.data){
            head=t1;
            tail=t1;
            t1= t1.next;
        }else{
            head= t2;
            tail=t2;
            t2= t2.next;
        }

        while(t1 != null && t2 != null){
            if(t1.data<=t2.data){
                tail.next= t1;
                tail = t1;
                t1= t1.next;

            }else{
                tail.next= t2;
                tail= t2;
                t2= t2.next;
            }
        }
        if(t1 != null ){
            tail.next = t1;
        }else{
            tail.next = t2;
        }


        return head;


    }

    public static Node<Integer> reverseLinkList(Node<Integer> head){
        if(head== null || head.next == null){
            return head;
        }
            Node<Integer> prevNode= head, currentNode= head.next;
            while(currentNode != null){
                Node<Integer> nextNode= currentNode.next;
                currentNode.next= prevNode;

                //update
                prevNode= currentNode;
                currentNode= nextNode;
            }
            head.next= null;
            head= prevNode;
            return head ;
    }

    public static Node<Integer> reverseLinkListRecursion(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> smallAns= reverseLinkListRecursion(head.next);
        head.next.next= head;
        head.next= null;

        return smallAns;
    }

    public static Node<Integer> insertionRec(Node<Integer> head, int pos, int elem){
        if(pos == 0){
            Node<Integer> newNode= new Node<Integer>(elem);
            newNode.next= head;
            return newNode;
        }
        if(head == null){
            return head;
        }
        head.next= insertionRec(head.next, pos-1, elem);
        return head;
    }

    public static Node<Integer> deleteRec(Node<Integer> head, int pos){
        if(head== null)
        {
            return head;
        }
        if(pos == 0){
            head= head.next;
            return head;
        }
        head.next= deleteRec(head.next, pos-1);
        return head;
    }

    public static Node<Integer> evenafterodd(Node<Integer> head){

        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> node= head;
        Node<Integer> evenhead= null, evennode= null;
        Node<Integer> oddhead= null, oddnode= null;

        while(node != null){
            if(node.data %2 == 0){
                if(evennode== null){
                    evennode=node;
                    evenhead= node;
                }else{
                    evennode.next= node;
                    evennode= node;
                }
            }else{
                if(oddnode== null){
                    oddnode=node;
                    oddhead= node;
                }else{
                    oddnode.next= node;
                    oddnode = node;
                }
            }
            node= node.next;
        }

        if(oddnode== null){
            return evenhead;
        }else{
            oddnode.next=evenhead;
        }

        if(evennode != null){
            evennode.next = null;
        }

        return oddhead;

    }

    public static Node<Integer> BubbleSort(Node<Integer> head){
        if(head==null ||head.next ==null){
            return head;
        }

        int n = length(head);

        Node<Integer> n1=null,n2=null;
        for(int i=0; i<n;i++){

            n1 = head;
            n2 = head.next;

            for(int j=0; j<n-i; j++){

                int data1= n1.data;
                int data2 = n2.data;

                if(data1 > data2){
                    n1.data= data2;
                    n2.data= data1;
                }
                n1=n1.next;
                n2= n2.next;

            }
        }
        return head;
    }

    public static Node<Integer> deleteEveryNnode(Node<Integer> head, int m, int n){
        if(m==0){
            return null;
        }
        if(n==0){
            return head;
        }
        Node<Integer> node = head, delnode=null;
        while(node != null){

            for(int i=0; i<m-1 && node!= null; i++){
                node= node.next;
            }
            if(node==null){
                break;
            }
            delnode= node.next;
            for(int i=0; i<n && delnode!=null; i++){
                delnode= delnode.next;
            }
            node.next= delnode;
            node = delnode;
        }
        return head;
    }


public static Node<Integer> removeAllOccurence(Node<Integer> head, int val){
        if(head == null){
            return head;
        }
        head.next= removeAllOccurence(head.next, val);
        if(head.data == val){
        head= head.next;
         }
        return head;
}

public static Node<Integer> removeNthFromEnd(Node<Integer> head, int n){
        if(head== null){
            return head;
        }

      Node<Integer> slow = head, fast= head;
        for(int i=0; i<n-1; i++) fast= fast.next;
        if(fast == null)return head.next;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next;
        }
        slow.next= slow.next.next;
return head;
}

public static Node<Integer> removeNthFromEndandFront(Node<Integer> head, int n){
        if(head== null){
            return head;
        }
        Node<Integer> temp= head;
//        int data=head.data;
        for(int i=0; i<n && temp != null; i++) temp= temp.next;
        if(temp == null){
            return head;
        }else if(temp.next== null){
            int data1= head.data, data2= temp.data;
            head.data=data2;
            temp.data= data1;
        }
        Node<Integer> slow= head, fast= temp;
        while(fast.next != null){
            slow= slow.next;
            fast= fast.next;
        }
        int data1= temp.data, data2= slow.data;
        temp.data=data2;
        slow.data= data1;

        return head;

    }


    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        print(head);
//        head= insert(head, 80, 0);
//        System.out.println("\nAfter Inserting the Element: ");
//        print(head);

//        System.out.println("\nAfter deletion the element : ");
//        head= delete(head, 3);
//        print(head);

//        System.out.println("\nLength of the linked List is: ");
//        System.out.println(length(head));
//
//        System.out.println("\nAfter incrementing the elements : ");
//        head = increment(head);
//        print(head);

//        System.out.println("Appending the element on postion : ");
//        head = appendLastNToFirst(head, 3);
//        print(head);
//
//        System.out.println("\nRemove Duplicates: ");
//        head= removeDuplicates(head);
//        print(head);

//        System.out.println("\nMidPoint(1st value) of the List: ");
//        head= midPoint(head);
//        System.out.println(head.data);

//        System.out.println("\nInput of First Link: ");
//        Node<Integer> head1= takeInput();
//        System.out.println("\nInput of Second Array: ");
//        Node<Integer> head2= takeInput();
//        Node<Integer> head= mergeLinkList(head1, head2);
//        print(head);

//        System.out.println("\nMidPoint(2nd value) of the List: ");
//        head= midPoint(head);
//        System.out.println(head.data);


//        System.out.println("\nLink in reverse Order:  ");
//        head= reverseLinkList(head);
//        print(head);


//        System.out.println("\nLink in reverse order via Recursion: ");
//        head= reverseLinkListRecursion(head);
//        print(head);

//        System.out.println("\nAfter insertion the elem. are:  : ");
//        head= insertionRec(head, 2,10);
//        print(head);

//        System.out.print("\nAfter Deletion the elem are: ");
//          head= deleteRec(head, 2);
//          print(head);

//        System.out.println("\nRemove All Occurence: ");
//        head= removeAllOccurence(head, 7);
//        print(head);

//        System.out.println("\nOdd after even: ");
//        head= evenafterodd(head);
//        print(head);

//        System.out.println("\nSorted List : ");
//        head= BubbleSort(head);
//        print(head);

//        System.out.println("\nAfter deleting the nodes : ");
//        head= deleteEveryNnode(head,2,2);
//        print(head);

//        System.out.println("\nAfter removing k from start and end: ");
//        head= removeNthFromEndandFront(head, 4);
//        print(head);
//








    }
}
