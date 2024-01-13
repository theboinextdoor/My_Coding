import java.lang.reflect.Array;
import java.util.*;

class MaxPQcomparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}

class MinPQcomparator implements  Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1 < o2){
            return -1;
        }else if(o1 > o2){
            return 1;
        }
        return 0;
    }
}

public class InbuiltPriorityQueue {
    public static void sortKSorted(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i=0;

        //Adding K element  to the priority Queue.
        for(; i<k ; i++){
            pq.add(arr[i]);
        }

        //Adding element to the Array
        for(; i<arr.length ; i++){
            arr[i-k] = pq.remove();
            pq.add(arr[i]);
        }

        //Adding Last few element to the priority Queue
        for(int j = arr.length - k; j< arr.length; j++){
            arr[j] = pq.remove();
        }

    }


    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ArrayList<Integer> list = new ArrayList<>();

        int row = arr.size();
        int col = arr.get(0).size();

        for(int i=0; i<arr.size() ; i++){
            for(int j=0; j<arr.get(i).size() ; j++){
                list.add(arr.get(i).get(j));
            }
        }

        return list;

    }

    public static void main(String[] args) {

        MaxPQcomparator maxPQComparator = new MaxPQcomparator();
        MinPQcomparator minPQComparator = new MinPQcomparator();
        PriorityQueue<Integer> minpq = new PriorityQueue<>(minPQComparator);
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(maxPQComparator);

        //inbuilt Comparator method
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr= {5,2,8,3,9,4,0,1};
        System.out.println("Using Min PQ: ");
        for(int i=0; i<arr.length; i++){
            minpq.add(arr[i]);
        }

        for(int i=0; i<arr.length ; i++){
            System.out.print(minpq.poll()+ " ");
        }

        System.out.println("\nUsing Max PQ: ");

        for(int i=0; i<arr.length; i++){
            maxpq.add(arr[i]);
        }

        for(int i=0; i<arr.length ; i++){
            System.out.print(maxpq.poll()+ " ");
        }

        System.out.println("\nInbuit Reverse Order Check");
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        for(int i=0; i<arr.length ; i++){
            System.out.print(pq.poll()+ " ");
        }



//       checking  for the K sorted Array
//        int[] arr = {2,4,1,9,6,8};
//        sortKSorted(arr, 3);
//
//        for(int i =0; i<arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }


        System.out.println();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 5,9)));
        list.add(new ArrayList<>(Arrays.asList(45, 90)));
        list.add(new ArrayList<>(Arrays.asList(2, 6, 70, 100)));
        list.add(new ArrayList<>(Arrays.asList(0)));

        ArrayList<Integer> l= mergeKSortedArrays(list);
        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i)+" ");
        }


    }
}
