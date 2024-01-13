import java.util.*;

public class BinaryTreeNode<T>  {
    public T data;
    public BinaryTreeNode<T> right;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode(T data) {
        this.data = data;
    }
    public  static BinaryTreeNode<Integer> takeInputIteratively(){

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootData= sc.nextInt();
        if(rootData == -1) return null;

        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        queue.add(root);

        while(!queue.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = queue.poll();
            System.out.println("Enter the left data of " + frontNode.data);
            int leftNodeData = sc.nextInt();
            if (leftNodeData != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftNodeData);
                queue.add(leftNode);
                frontNode.left = leftNode;
            }
            System.out.println("Enter the right data of " + frontNode.data);
            int rightNodeData = sc.nextInt();
            if (rightNodeData != -1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightNodeData);
                queue.add(rightNode);
                frontNode.right = rightNode;
            }
        }

        return root;
    }
    public static void printInputIteratively(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> mq= new LinkedList<>();
        mq.add(root);

        while(!mq.isEmpty()){
            BinaryTreeNode<Integer> frontNode = mq.remove();
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
    public static void printBinaryNode(BinaryTreeNode<Integer> root){
        if(root==null) return ;
        String s= root.data+": ";
        if(root.left != null) s+="L"+root.left.data+" ";
        if(root.right != null) s+="L"+root.right.data+" ";
        System.out.println(s);
        printBinaryNode(root.left);
        printBinaryNode(root.right);
    }
    public static BinaryTreeNode<Integer> takeInputRecursively(Scanner sc){

        System.out.println("Enter the root data: ");
        int rootData= sc.nextInt();
        if(rootData== -1) return null;
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        root.left= takeInputRecursively(sc);
        root.right = takeInputRecursively(sc);
        return root;
    }
    public static int countNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count =1;
        count+=countNode(root.left);
        count+=countNode(root.right);
        return count;
    }
    public static int nodeWithLargestData(BinaryTreeNode<Integer> root){
        if(root == null) return -1;
        int max = -1;
        int ans = root.data;

        int leftData = nodeWithLargestData(root.left);
        int rightData = nodeWithLargestData(root.right);

        if(leftData>rightData){
            max=leftData;
        }else{
            max=rightData;
        }

        if (max > ans) {
            return max;
        }
        return ans;
    }
    public static int nodeGreaterThanX(BinaryTreeNode<Integer> root, int x){
        if(root == null) return 0;
        int count =0;
        if(root.data > x) count++;
        count+=nodeGreaterThanX(root.left, x);
        count+= nodeGreaterThanX(root.right, x);
        return count ;
    }
    public static void printNodeatDepthK(BinaryTreeNode<Integer> root, int k){
        if(root== null) return ;
        if(k==0){
            System.out.print(root.data+" ");
        }
        printNodeatDepthK(root.left, k-1);
        printNodeatDepthK(root.right, k-1);

    }
    public static int numOfLeafNode(BinaryTreeNode<Integer> root){
        if(root== null) return 0;
        if(root.left== null && root.right == null) return 1;
        return numOfLeafNode(root.left) + numOfLeafNode(root.right);
    }
    public static void replaceNodeWithDepth(BinaryTreeNode<Integer> root){
        int k=0;
        privatereplace(root, k);
    }
    private static void privatereplace(BinaryTreeNode<Integer> root, int k){
        if(root==null) return ;
        root.data = k;
        privatereplace(root.left, k+1);
        privatereplace(root.right, k+1);
    }
    public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
        if(root==null) return null;
        if(root.left == null && root.right==null) root.data=null;

        removeLeafNode(root.left);
        removeLeafNode(root.right);
        return root;
    }
    public static BalancedTreeReturn isBalanceBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBal = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalanceBetter(root.left);
        BalancedTreeReturn rightOutput = isBalanceBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) isBal = false;
        if (!leftOutput.isBal || rightOutput.isBal) isBal = false;

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBal = isBal;
        return ans;
    }
public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null) return true;
       int leftHeight =  height(root.left);
       int rightHeight =  height(root.right);

       if(Math.abs(leftHeight - rightHeight)>1) return false;

       boolean isLeftBalanced = isBalanced(root.left);
       boolean isRightBalanced = isBalanced(root.right);

       return( isLeftBalanced && isRightBalanced);
    }
    private static int height(BinaryTreeNode<Integer> root){
        if(root==null) return 0;
        int leftHeight= height(root.left);
        int rightHeight = height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);

    }
    public static int diameter(BinaryTreeNode<Integer> root){
        if( root== null ) return 0;
        int option1= height(root.left) + height(root.right);
        int option2= diameter(root.left);
        int option3= diameter(root.right);

        return Math.max(option1, Math.max(option2, option3));
    }
 public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root==null){
            int first = 0;
            int second = 0;
            Pair<Integer, Integer> output= new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer, Integer> lo= heightDiameter(root.left);
        Pair<Integer, Integer> ro= heightDiameter(root.right);
        int height= 1+Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2= lo.second;
        int option3= ro.second;
        int diameter= Math.max(option1, Math.max(option2, option3));

     Pair<Integer, Integer> output= new Pair<>();
     output.first = height;
     output.second = diameter;
     return output;
 }
 public static void inorderTraversal(BinaryTreeNode<Integer> root){
        if(root==null) return ;

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
 }
 public static void preOrderTraversal(BinaryTreeNode<Integer> root){
        if(root == null) return;
     System.out.print(root.data+" ");
     preOrderTraversal(root.left);
     preOrderTraversal(root.right);
 }
 public static void postOrderTraversal(BinaryTreeNode<Integer> root){
        if(root==null) return ;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right );
        System.out.print(root.data+" ");
    }
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE){
        if(inS > inE) {
            return null;
        }

        int rootData = pre[preS];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);

        int rootIndex=-1;
        for(int i=inS;  i<=inE; i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }

        if(rootIndex==-1) {
            return null;
        }

        int leftInS = inS;
        int leftInE= rootIndex-1;

        int leftPreS=preS+1;
        int leftPreE = leftInE-leftInS +leftPreS;

        int rightInS = rootIndex+1;
        int rightInE= inE;

        int rightPreS= leftPreE+1;
        int rightPreE = preE;

        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);

        return root;

    }
    public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre){
        return buildTreeHelper(in, pre, 0, in.length-1, 0, pre.length-1);
    }
    public static void evenNodes(BinaryTreeNode<Integer> root){
        if(root == null) {
            return;
        }
        if(root.data %2!=0){
            System.out.print(root.data+" ");
        }
        evenNodes(root.left);
        evenNodes(root.right);
    }
    public static PairMaxMin<Integer, Integer> getMaxMin(BinaryTreeNode<Integer> root){
        if(root==null) {
            return new PairMaxMin<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        PairMaxMin<Integer, Integer> leftNodes = getMaxMin(root.left);
        PairMaxMin<Integer, Integer> rightNodes = getMaxMin(root.right);

        int minimmum = Math.min(root.data , Math.min(leftNodes.minimum, rightNodes.minimum));
        int maximum  = Math.max(root.data , Math.max(leftNodes.maximum, rightNodes.maximum));

        return new PairMaxMin<>(minimmum, maximum);
    }
    public static void printNodeatKsidt(BinaryTreeNode<Integer> root, int k){
        if(root == null) return ;
        if(k==0){
            System.out.print(root.data+" ");
        }
        printNodeatKsidt(root.left, k-1);
        printNodeatKsidt(root.right , k-1);
    }
    public static void morrisTreaversal(BinaryTreeNode<Integer> root){
        BinaryTreeNode<Integer> curr, prev;
        if(root==null){
            curr= root;
        }

        curr= root;
        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.data+" ");
                curr= curr.right ;
            }else{
                prev= curr.left;
                while(prev.right != null && prev.right != curr){
                    prev= prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr= curr.left;
                }else{
                    prev.right = null;
                    System.out.print(curr.data +" ");
                    curr= curr.right;
                }
            }
        }
    }


    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean findNodetoRootPath(BinaryTreeNode<Integer> root, int val){
        if(root == null) return false;

        if(root .data== val) {
            list.add(root.data);
            return true;
        }

        boolean leftSubTree = findNodetoRootPath(root.left, val);
        if(leftSubTree){
            list.add(root.data);
            return true;
        }


        if(root.data == val){
            list.add(root.data);
            return true;
        }

        if(findNodetoRootPath(root.left , val) || findNodetoRootPath(root.right , val)){
            list.add(root.data);
            return true;
        }

        return false;

    }

    public static ArrayList<Integer> roottonode(BinaryTreeNode<Integer> root, int data){
        if(root== null) return null;

        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }


        ArrayList<Integer> leftOutput = roottonode(root.left, data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = roottonode(root.right , data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }

        return null;
    }


    public static boolean checkifCousin(BinaryTreeNode<Integer> root, int x, int y){
        if(root == null) return false;
        if(getLevelk(root.left, x, 1) != getLevelk(root.right , y, 1)){
            return false ;
        }
        boolean smallAns  = isSibbling(root, x, y);
        if(smallAns){
            return false;
        }
        return true;
    }

    private static int getLevelk(BinaryTreeNode<Integer> root, int val, int level){
        if(root== null){
            return 0;
        }
        if(root.data== val) return level;

        int l = getLevelk(root.left, val , level+1);
        if(l != 0){
            return l;
        }
        l= getLevelk(root.right ,val,  level+1 );
        return l;
    }
    private static boolean isSibbling(BinaryTreeNode<Integer> root, int x, int y){
        if(root== null) return false;
        return (root.left.data == x && root.right.data ==y) || (root.left.data == y && root.right.data ==x) ||
                isSibbling(root.left , x, y) || isSibbling(root.right , x, y);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BinaryTreeNode<Integer> root= takeInputIteratively();
        printInputIteratively(root);

//        System.out.println("Number of Nodes is Binary Tree is: "+countNode(root));
//        System.out.println("Largest Node is: "+ nodeWithLargestData(root));
//        int num = nodeGreaterThanX(root, 2);
//        System.out.println("Numbers Greater than 2 is "+num);
//        System.out.println("Number of leaf Node is : "+ numOfLeafNode(root));
//        printNodeatDepthK(root, 3);
//        replaceNodeWithDepth(root);
//        printBinaryNode(root);

//        System.out.println("Nodes after removing the leaf Node: ");
//        BinaryTreeNode<Integer> finalTree = removeLeafNode(root);
//        printInputIteratively(root);

//        boolean checkBalance = isBalanced(root);
//       if(checkBalance) System.out.println("Tree is Balanced");
//       else System.out.println("Tree is not Balance");

//        System.out.println("Diameter of given Binary Tree: "+diameter(root));

//        System.out.println("Diameter:  "+ heightDiameter(root).second);
//        System.out.println("Height:  "+ heightDiameter(root).first);

//        System.out.println("InOrder Traversal : ");
//        inorderTraversal(root);
//
//        System.out.println();
//        System.out.println("PostOrder Traversal : ");
//        postOrderTraversal(root);
//
//        System.out.println();
//        System.out.println("PreOrder Traversal: ");
//        preOrderTraversal(root);

//        int[] inTree = {4,2,5,1,6,3,7};
//        int[] preTree = {1,2,4,5,3,6,7};
//        BinaryTreeNode<Integer> ans = buildTree(inTree, preTree);
//        printInputIteratively(ans);

//        System.out.println("Minimum num in Binary Tree: "+getMaxMin(root).minimum );
//        System.out.println("Maximum num in Binary Tree: "+getMaxMin(root).maximum );


//        System.out.println("All the odd nodes: ");
//        evenNodes(root);

//        morrisTreaversal(root);

//        System.out.print("All the nodes at level 2 are : ");
//          printNodeatKsidt(root, 2);

//        System.out.println("Enter the data you want to search: ");
//        int data  = sc.nextInt();
//        boolean ans = findNodetoRootPath(root, data);
//
//        System.out.println("Node to leaf Path");
//        for(int i=0; i<list.size(); i++){
//            System.out.print(list.get(i)+" ");
//        }


        System.out.println(checkifCousin(root, 4 , 7));



    }
}
