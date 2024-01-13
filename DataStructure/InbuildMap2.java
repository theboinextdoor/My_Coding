import java.util.ArrayList;
import java.util.HashMap;

public class InbuildMap2 {


    public static ArrayList<Integer> RemoveDuplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.containsKey(arr[i])) {
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i], true);
        }



        return output;
    }


    public static void main(String[] args) {
        int[] arr= {1,3,2,4,5,2,3,1,5,6};
        ArrayList<Integer> ans = RemoveDuplicates(arr);
//        for(int i : ans){
//            System.out.print(i+" ");
//        }

        System.out.println(ans);

    }
}
