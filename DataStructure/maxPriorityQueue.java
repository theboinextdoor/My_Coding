import java.util.ArrayList;
import java.util.Comparator;



public class maxPriorityQueue {
    private ArrayList<Integer> heap ;
    public maxPriorityQueue(){
        heap = new ArrayList<>();
    }
    boolean isEmpty(){
        return heap.isEmpty();
    }
    int size(){
        return heap.size();
    }
    int getMax(){
        if(heap.isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
    }
    void insert(int elem){
        heap.add(elem);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(parentIndex >= 0){

            if(heap.get(childIndex) > heap.get(parentIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);


                childIndex = parentIndex ;
                parentIndex  = (childIndex -1)/ 2;

            }else{
                return;
            }
        }
    }
    int removeMax() {

        if(heap.isEmpty()){
           return Integer.MIN_VALUE;
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        downHeapify();
        return maxValue;
    }
    private void downHeapify(){

        int parentIndex = 0;
        int minIndex = parentIndex;
        int leftChildIndex = 1;
        int rightChildIndex = 2;


        while(leftChildIndex < heap.size()){

            if(heap.get(leftChildIndex) > heap.get(minIndex)){
                minIndex= leftChildIndex;
            }

            if(rightChildIndex< heap.size() && heap.get(rightChildIndex) > heap.get(minIndex)){
                minIndex = rightChildIndex;
            }

            if(minIndex != parentIndex){
                int temp = heap.get(minIndex);
                heap.set(minIndex, heap.get(parentIndex));
                heap.set(parentIndex , temp);
                parentIndex= minIndex;
                leftChildIndex = 2 * parentIndex +1 ;
                rightChildIndex  = 2 * parentIndex + 2;
            }else{
                break;
            }

        }
    }

    public  static void insertIntoVirtualHeap(int[] arr, int i){
         int childIdnex = i;
         int parentIndex = (childIdnex -1 )/2;

         while(parentIndex >= 0){
             if(arr[childIdnex] > arr[parentIndex]){
                 int temp = arr[childIdnex];
                 arr[childIdnex] = arr[parentIndex];
                 arr[parentIndex] = temp;

                 childIdnex = parentIndex;
                 parentIndex = (childIdnex-1)/2;
             }else{
                 break;
             }
         }
    }

    private static int removeFromVeirtualHeap(int[] arr, int heapSize) throws PriorityQueueException{

        if(heapSize==0){
            throw new PriorityQueueException();
        }

        int maxValue = arr[0];
        arr[0] = arr[heapSize-1];
//        heapSize--;

        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex  + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int index = parentIndex;

        while(leftChildIndex < heapSize){

            if(arr[leftChildIndex] > arr[index]){
                index = leftChildIndex ;
            }

            if(rightChildIndex < heapSize && arr[rightChildIndex] > arr[index]){
                index = rightChildIndex;
            }

            if(index != parentIndex){
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[index];
                arr[index] = temp;

                parentIndex = index ;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            }else{
                break;
            }

        }
        return maxValue ;
    }

   public static void main(String[] args) throws PriorityQueueException{
        maxPriorityQueue pq = new maxPriorityQueue();
        int[] arr= {5,1,9,2,0,6};

        for(int i =0 ; i<arr.length ; i++)
        {
            insertIntoVirtualHeap(arr, i);
        }

        for(int i= 0 ; i<arr.length ; i++){
            arr[arr.length -1 -i] = removeFromVeirtualHeap(arr, arr.length-i);
        }

        for(int i= 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }



//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

//        for(int i =0 ; i<arr.length ; i++){
//            pq.insert(arr[i]);
//        }

//        while(!pq.isEmpty()){
//            System.out.print(pq.removeMax()+" ");
//        }

//        System.out.println();

    }

}
