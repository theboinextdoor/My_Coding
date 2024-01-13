public class BinarySearchTree2_ {

    private static BinaryTreeNode<Integer> root;


    private static boolean hasDataHelper(int data , BinaryTreeNode<Integer> root){
        if(root== null){
            return false;
        }

        if(root.data == data){
            return true;
        }else if(root.data > data){
            return hasDataHelper(data, root.left);
        }else{
            return hasDataHelper(data, root.right);
        }
    }
    public static boolean hasData(int data){
     return hasDataHelper(data, root);
    }
}
