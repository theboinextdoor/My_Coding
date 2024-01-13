import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        // Stack using Array:
        int[] arr= {5,8,4,1};
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        System.out.println("Stack is based on LIFO(Last in First Out )");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

        // Stack using Linked List:
//        stack.push(9);
//        stack.push(10);
//        stack.push(29);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.empty());

    }
}
