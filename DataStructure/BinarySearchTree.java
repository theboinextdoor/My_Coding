import java.util.*;

public class BinarySearchTree<T> {
    public T data;
    public BinarySearchTree<T> left;
    public BinarySearchTree<T> right;

    public BinarySearchTree(T data){
        super();
        this.data= data;
        this.left= null;
        this.right= null;
    }
    public  static BinarySearchTree<Integer> takeInputIteratively(){

        Queue<BinarySearchTree<Integer>> queue = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootData= sc.nextInt();
        if(rootData == -1) return null;

        BinarySearchTree<Integer> root= new BinarySearchTree<>(rootData);
        queue.add(root);

        while(!queue.isEmpty()) {
            BinarySearchTree<Integer> frontNode = queue.poll();
            System.out.println("Enter the left data of " + frontNode.data);
            int leftNodeData = sc.nextInt();
            if (leftNodeData != -1) {
                BinarySearchTree<Integer> leftNode = new BinarySearchTree<>(leftNodeData);
                queue.add(leftNode);
                frontNode.left = leftNode;
            }
            System.out.println("Enter the right data of " + frontNode.data);
            int rightNodeData = sc.nextInt();
            if (rightNodeData != -1) {
                BinarySearchTree<Integer> rightNode = new BinarySearchTree<>(rightNodeData);
                queue.add(rightNode);
                frontNode.right = rightNode;
            }
        }
        return root;
    }
    public static void printInputIteratively(BinarySearchTree<Integer> root){
        Queue<BinarySearchTree<Integer>> mq= new LinkedList<>();
        mq.add(root);

        while(!mq.isEmpty()){
            BinarySearchTree<Integer> frontNode = mq.remove();
            System.out.print(frontNode.data+": ");
            if(frontNode.left != null){
                mq.add(frontNode.left);
                System.out.print("L"+frontNode.left.data+" ");
            }
            if(frontNode.right != null){
                mq.add(frontNode.right);
                System.out.print("R"+frontNode.right.data+" ");
            }
            System.out.println();
        }
    }
    public static BinarySearchTree<Integer> takeBSTInput(){
        QueueUsingLinkedList<BinarySearchTree<Integer>> mq= new QueueUsingLinkedList<>();
        System.out.println("Enter the root data: ");
        Scanner sc= new Scanner(System.in);

        int rootData = sc.nextInt();
        BinarySearchTree<Integer> root= new BinarySearchTree<>(rootData);
        mq.enqueue(root);

        while(!mq.isEmpty()){
            BinarySearchTree<Integer> frontNode ;
            try{
                frontNode= mq.dequeue();
            }catch(QueueEmptyException ignore ){
                return null;
            }

            System.out.println("Enter the left data of "+frontNode.data);
            int leftData= sc.nextInt();
            if(leftData!=-1){
                if(leftData > frontNode.data){
                    System.out.println("Left Node can't be greater than the root data.");
                    System.out.println("Please Try Again");
                    return null;
                }else{
                    BinarySearchTree<Integer> leftNode = new BinarySearchTree<>(leftData);
                    frontNode.left = leftNode;
                    mq.enqueue(leftNode);
                }
            }

            System.out.println("Enter the right Data : ");
            int rightData = sc.nextInt();
            if(rightData!=-1){
                if(rightData < frontNode.data){
                    System.out.println("Right Node can't be less than the root data.");
                    System.out.println("Please Try Again");
                    return null;
                }else{
                BinarySearchTree<Integer> rightNode = new BinarySearchTree<>(rightData);
                frontNode.right = rightNode;
                mq.enqueue(rightNode);
                }
            }
        }
        return root;
    }
    public static boolean  searchInBST(BinarySearchTree<Integer> root, int target){
        if(root==null) return false;

        if(root.data == target) return true;
        if(root.data > target) return searchInBST(root.left, target);
        else return searchInBST(root.right, target);
    }
    public static int maximum(BinarySearchTree<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
    public static int minimum(BinarySearchTree<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }
    public static boolean isBST1(BinarySearchTree<Integer> root){
        if(root==null) return true;
        int leftData = maximum(root.left);
        int rightData = minimum(root.right);

        if(leftData > root.data || rightData <root.data) return false;
        return isBST1(root.left) && isBST1(root.right);
    }
    public static Pair<Boolean , Pair<Integer, Integer>> isBST2(BinarySearchTree<Integer> root){
        if(root == null){
            Pair<Boolean, Pair<Integer, Integer>> output= new Pair<>();
            output.first = true;
            output.second= new Pair<>();
            output.second.first= Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftoutput= isBST2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightoutput= isBST2(root.right);

        int min= Math.min(root.data , Math.min(leftoutput.second.first, rightoutput.second.first));
        int max= Math.max(root.data, Math.max(leftoutput.second.second, rightoutput.second.second));

        boolean isBST= (root.data > leftoutput.second.second) && (root.data <= rightoutput.second.first)
                                     && leftoutput.first && rightoutput.first;

        Pair<Boolean, Pair<Integer, Integer>> output= new Pair<>();
        output.first = isBST;
        output.second= new Pair<>();
        output.second.first=min;
        output.second.second = max;
        return output;
    }
    private static boolean isBST3Helper(BinarySearchTree<Integer> root, int min, int max){
        if(root==null) return true;

        if(root.data < min || root.data >max ) return false;

        boolean isLeftOk= isBST3Helper(root.left, min, root.data-1);
        boolean isRightOk= isBST3Helper(root.right, root.data, max);
        return isLeftOk && isRightOk;

    }
    public static boolean isBST3(BinarySearchTree<Integer> root){
        return isBST3Helper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static BinarySearchTree<Integer> BSTformArray( int[] arr){
        return BSTformArrayHelper(arr, 0, arr.length-1);
    }
    private static BinarySearchTree<Integer> BSTformArrayHelper(int[] arr, int si, int ei){
        if(si>ei){
            return null;
        }
        int midPoint = (si+ei)/2;
        int rootData = arr[midPoint];
        BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(rootData);

        root.left = BSTformArrayHelper(arr, si, midPoint-1);
        root.right = BSTformArrayHelper(arr, midPoint+1, ei);

        return root;
    }
    public static int kthlargestinBST(BinarySearchTree<Integer> root){
        return 0;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BinarySearchTree<Integer> root= takeInputIteratively();
        printInputIteratively(root);

//        System.out.println("Enter the number you want to search :");
//        int num= sc.nextInt();
//        System.out.println(searchInBST(root, num));

//        System.out.println("Binary Search Tree is Balanced : "+ isBST1(root));


//        System.out.println("is Binary Tree Balanced: "+isBST2(root).first);
//        System.out.println("Minimum Number : "+ isBST2(root).second.first);
//        System.out.println("Maximum Number : "+ isBST2(root).second.second);

//        System.out.println("Is BST3 is Valid: "+isBST3(root));

//        int[] arr= {1,1,2,3,4,5,9};
//        BinarySearchTree<Integer> ans = BSTformArray(arr);
//        printInputIteratively(ans);




    }
}

