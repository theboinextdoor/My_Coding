import java.util.*;
public class BinaryTree<T> {
    T data ;
    BinaryTree<T> right ;
    BinaryTree<T> left ;
    public BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }


    public static void DistanceAtk(BinaryTree<Integer> root, int k, BinaryTree<Integer> blocker ){
        if(root== null || k< 0 || root==blocker) return ;

        if(k==0){
            System.out.print(root.data+" ");
            return ;
        }
        DistanceAtk(root.left, k-1, blocker);
        DistanceAtk(root.right , k-1, blocker);
    }
    static ArrayList<BinaryTree<Integer>> path = new ArrayList<>();
    public static boolean printNodeToRoot(BinaryTree<Integer> root, int  target){
        if(root==null){
            return false ;
        }

        if(root.data == target){
            path.add(root);
            return true;
        }

        if(printNodeToRoot(root.left, target) || printNodeToRoot(root.right, target)){
            path.add(root);
            return true;
        }

        return false;
    }

    public static void PrintAllNodeAtKDist(BinaryTree<Integer> root,  BinaryTree<Integer> target, int k){
        printNodeToRoot(root, target.data);
        for(int i=0; i<path.size(); i++){
            DistanceAtk(path.get(i),k-i, i==0 ? null : path.get(i-1));
        }
    }


}
