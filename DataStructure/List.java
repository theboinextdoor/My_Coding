import java.util.Scanner;

public class List<T> {
    T data;
    List<T> next;

    List(T data){
        this.data= data;
    }

    public static List<Integer> takeInputs(){
        Scanner sc= new Scanner(System.in);
        List<Integer> head=null,tail=null;
        int data= sc.nextInt();
        while(data != -1){
            List<Integer> newNode= new List<>(data);
            if(head==null){
                head= newNode;
                tail= newNode;
            }
            else{
                tail.next= newNode;
                tail= newNode;
            }
            data= sc.nextInt();

        }
        return head;
    }

    public static void printInputs(List<Integer> head){
        if(head== null){
            System.out.print("Null");
            return ;
        }
        System.out.print(head.data+" -> ");
        printInputs(head.next);
    }

    public static List<Integer> midpoint(List<Integer> head){
        if(head==null){
            return head;
        }
        List<Integer> slow= head, fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int size(List<Integer> head){
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return 1;
        }

        int count =0;
        List<Integer> temp=head;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count ;
    }

    public static List<Integer> reverseKnodes(List<Integer> head, int k){
        if(head==null || head.next== null){
            return head;
        }
        if(size(head)<k){
            return head;
        }
        List<Integer> pre=null, curr= head, nex = null;
        int count=0;
        while(curr!= null && count < k){
            nex= curr.next;
            curr.next= pre;
            pre= curr;
            curr= nex;
            count++;
        }
        if(curr!= null && size(nex)>=k){
            head.next= reverseKnodes(nex , k);
        }else{
            head.next= nex;
        }
        return pre;
    }

    public static List<Integer> rotatebyK(List<Integer> head, int k){
        if(head==null || head.next == null) return head;
        int length= size(head);

        int loop = k%length;
        int bp = length-loop;

        if(k==0 || k==length || bp == 0) return head;

        List<Integer> temp = head;
        while(temp != null && bp>1){
            bp--;
            temp= temp.next;
        }

        List<Integer> newHead= temp.next;
        temp.next= null;
        temp= newHead;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next= head;


        return newHead;
    }





    public static void main(String[] args) {
        List<Integer> head= takeInputs();
        printInputs(head);
//        head= mergeSort(head);
        System.out.print("\nAfter Reversing the Nodes: ");
        head= rotatebyK(head, 10);
        printInputs(head);


    }
}
