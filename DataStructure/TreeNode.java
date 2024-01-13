import java.util.*;
public class TreeNode<T> {
    public  T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data= data;
        children = new ArrayList<>();
    }

    public static TreeNode<Integer> takeInputLevel(){
        Scanner sc= new Scanner(System.in);
        QueueUsingLinkedList<TreeNode<Integer>> mq = new QueueUsingLinkedList<>();
//        QueueUsingLinkedList<TreeNode<Integer>> cq = new QueueUsingLinkedList<>();

        System.out.print("Enter the root data: ");
        int rootdata= sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootdata);
        mq.enqueue(root);

        while(!mq.isEmpty()){
           try{
               TreeNode<Integer> node = mq.dequeue();
               System.out.println("Enter the Number of child of: "+ node.data);
               int numChild= sc.nextInt();
               for(int i=0; i<numChild; i++){
                   System.out.println("Enter the "+(i+1)+"th child of "+node.data+": ");
                   int child= sc.nextInt();
                   TreeNode<Integer> childNode = new TreeNode<>(child);
                   node.children.add(childNode);
                   mq.enqueue(childNode);
               }
           }catch(QueueEmptyException ignore){
               return null;
           }
        }
        return root;
    }

    public static void printLevel(TreeNode<Integer> root){
        QueueUsingLinkedList<TreeNode<Integer>> mq = new QueueUsingLinkedList<>();
        QueueUsingLinkedList<TreeNode<Integer>> cq = new QueueUsingLinkedList<>();
        mq.enqueue(root);
        while(!mq.isEmpty()){
            try{
                TreeNode<Integer> node = mq.dequeue();
                String s= node.data +": ";
                for(TreeNode<Integer> child : node.children){
                    cq.enqueue(child);
                    s+= child.data +" ";
                }
                System.out.println(s);
                if(mq.size()==0){
                    mq= cq;
                    cq= new QueueUsingLinkedList<>();
                }
            }catch(QueueEmptyException ignored){
                return;
            }
        }
    }




    public static int SumOfNodes(TreeNode<Integer> root){
        QueueUsingLinkedList<TreeNode<Integer>> mq= new QueueUsingLinkedList<>();
        QueueUsingLinkedList<TreeNode<Integer>> cq= new QueueUsingLinkedList<>();
        mq.enqueue(root);
        int sum=0;

        while (!mq.isEmpty()){
            try{
                TreeNode<Integer> node = mq.dequeue();
                sum+=node.data;

                for(int i=0; i<node.children.size(); i++){
                    cq.enqueue(node.children.get(i));
                }

                if(mq.size()==0){
                    mq= cq;
                    cq= new QueueUsingLinkedList<>();
                }
            }catch(QueueEmptyException ignore){
                return 0;
            }
        }
        return sum;
    }

    public static int largestNode(TreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for(int i=0; i<root.children.size(); i++){
            int largest= largestNode(root.children.get(i));
            if(largest>ans){
                ans= largest;
            }
        }
        return ans ;
    }


    public static int numberofNodes(TreeNode<Integer> root){
        if(root==null) return 0;
        int count =1;
        for(int i=0; i<root.children.size(); i++){
            count+= numberofNodes(root.children.get(i));

        }
        return count ;
    }


    public static int numOfgreaterNode(TreeNode<Integer> root, int x){
         int count =0;
        if(root== null){
            if(root.data>x) return count;
        }
        if(root.data > x){
            count++;
        }
        for(int i=0; i<root.children.size(); i++){
            count+= numOfgreaterNode(root.children.get(i), x);
//            if(root.data>x) count++;
        }
        return count;
    }

    public static void printDepth(TreeNode<Integer> root, int k){
       if(k<0) return ;
       if(k==0) {
           System.out.print(root.data+" ");
           return ;
       }
       for(int i=0 ; i<root.children.size(); i++){
           printDepth(root.children.get(i), k-1);
       }
    }

    public static boolean checkIfContainX(TreeNode<Integer> root, int x){
        if(root == null) return false;
        if(root.data == x) return true;
        for(int i=0; i<root.children.size(); i++){
            boolean checkKar= checkIfContainX(root.children.get(i), x);
            if(checkKar==true){
                return true;
            }
        }
        return false;
    }



    public static int countLeafNode(TreeNode<Integer> root){
        int leaf =0;
        if(root==null) return 0;
        if(root.children.size()==0) return 1;
        for(TreeNode<Integer> child : root.children){
            leaf+=countLeafNode(child);
        }
        return leaf ;
    }

    public static void preOrderTraversal(TreeNode<Integer> root){
        if(root==null) return;
        System.out.print(root.data+" ");
       for(TreeNode<Integer> child: root.children){
           preOrderTraversal(child);
       }
    }

    public static void postOrderTraversal(TreeNode<Integer> root){
        if(root==null) return ;
        for(TreeNode<Integer> child : root.children){
            postOrderTraversal(child);
            if(child.children==null){
                System.out.print(child.data+" ");
                return ;
            }
        }
        System.out.print(root.data+" ");
    }

    public static boolean checkIfIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        if(root1==null || root2==null) return false;
        QueueUsingLinkedList<TreeNode<Integer>> q1= new QueueUsingLinkedList<>();
        QueueUsingLinkedList<TreeNode<Integer>> q2= new QueueUsingLinkedList<>();
        q1.enqueue(root1);
        q2.enqueue(root2);

        while(!q1.isEmpty() && !q2.isEmpty()){
            try{
                TreeNode<Integer> node1 = q1.dequeue();
                TreeNode<Integer> node2 = q2.dequeue();

                if(node1.data == node2.data){
                    for(TreeNode<Integer> child1 : root1.children ){
                        q1.enqueue(child1);
                    }
                    for(TreeNode<Integer> child2 : root2,.children ){
                        q2.enqueue(child2);
                    }
                }else{
                    return false;
                }
            }catch(QueueEmptyException ignore){
                return false;
            }
        }
        return true;
    }

    public static TreeNode<Integer> findnextgreaterElement(TreeNode<Integer> root, int x){

    }



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data of root 1: ");
        TreeNode<Integer> root= takeInputLevel();
        printLevel(root);

//        int ans= SumOfNodes(root);
//        System.out.println("Sum of all the nodes are : "+ ans);

//        int largestNumber= largestNode(root);
//        System.out.println("Largest Node in Tree is: "+ largestNumber );

//        System.out.println("Total number of Nodes are : "+ numberofNodes(root));
//        System.out.println("Enter the number to check the count: ");
//        int x= sc.nextInt();
//        System.out.println(numOfgreaterNode(root,x )+" nodes are greater than "+x);

//        System.out.println("Enter the depth : ");
//        int k=sc.nextInt();
//        System.out.println("Nodes at Depth "+k +" is : ");
//        printDepth(root, k);

//        System.out.println("Enter the number to search: ");
//        int x = sc.nextInt();
//        System.out.println(checkIfContainX(root, x));

//        System.out.println("Number of leaf node is : "+countLeafNode(root));
//        System.out.println("Pre-Order Traversal of Tree is: ");
//        preOrderTraversal(root);

//        System.out.println("Post-Order Traversal of Tree is: ");
//        postOrderTraversal(root);

//        System.out.println("Enter the data of root 2: ");
//        TreeNode<Integer> root2= takeInputLevel();
//        printLevel(root);
//        boolean flag = checkIfIdentical(root, root2);
//        System.out.println(flag);





    }
}
