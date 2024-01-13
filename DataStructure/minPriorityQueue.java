import java.util.ArrayList;

public class minPriorityQueue {

    //    to implement the Priority Queue , we use a data structure called heap ,
    // and we store Heap in the form of Array.
    //we are using the ArrayList because size is not fixed

    private ArrayList<Integer>  heap;
    public minPriorityQueue(){
        heap  = new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin() throws PriorityQueueException{
        if(heap.isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }



    void insert(int element){
        heap.add(element);
        int childIndex= heap.size()-1;
        int parentIndex = (childIndex - 1)/2;

       while(childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex,temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }else{
                return ;
            }
        }
    }

    int removeMin() throws PriorityQueueException{
       if(isEmpty()){
           throw new PriorityQueueException();
       }

       int minValue = heap.get(0);

       heap.set(0, heap.get(heap.size()-1));
       heap.remove(heap.size() - 1);
        downHeapify();
       return minValue;
    }
    private void downHeapify(){
        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex + 1;
        int rightChildIndex  = 2*parentIndex + 2;
        int minIndex = 0;

        while(leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex) < heap.get(minIndex)){
                leftChildIndex= minIndex;
            }

            if(rightChildIndex < heap.size()  &&  heap.get(rightChildIndex) < heap.get(minIndex)){
                rightChildIndex = minIndex;
            }
            if(minIndex != parentIndex){
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(minIndex));
                heap.set(minIndex, temp);
                parentIndex = minIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            }else{
                break;
            }
        }

    }

    public static int removeFromVertualHeap(int[] arr, int heapSize) throws PriorityQueueException{
        if(arr.length == 0){
            throw new PriorityQueueException();
        }
        int minValue = arr[0];
        arr[0]= arr[heapSize -1];

        int parentIndex = 0;
        int leftChildIndex  = 2 * parentIndex +1;
        int rightChildIndex = 2* parentIndex + 2;



        while(leftChildIndex < heapSize){
            int minIndex  = parentIndex;
            if(arr[leftChildIndex] < arr[minIndex]){
                minIndex  = leftChildIndex;
            }

            if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex ]){
                minIndex = rightChildIndex;
            }
            if(minIndex != parentIndex){
                int temp = arr[parentIndex];
                arr[parentIndex]= arr[minIndex];
                arr[minIndex] = temp;

                parentIndex= minIndex;
                leftChildIndex  = 2 * parentIndex +1;
                rightChildIndex = 2* parentIndex + 2;
            }else{
                break ;
            }
        }
        return minValue;
    }


    public static void insertintoVertualHeap(int[] arr, int i){
        int childIndex = i;
        int parentIndex = (childIndex-1)/2;

        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex]){
                int temp = arr[childIndex];
                arr[childIndex]= arr[parentIndex];
                arr[parentIndex] = temp;

                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;

            }else{
                return ;
            }
        }
    }


    public static void main(String[] args) throws PriorityQueueException {
        minPriorityQueue pq = new minPriorityQueue();
//        int[] arr= {9,0,2,7,4,1,8,6};
//        for(int i = 0; i<arr.length ; i++){
//            pq.insert(arr[i]);
//        }
//
//        while(!pq.isEmpty()) {
//            System.out.print(pq.removeMin() + " ");
//        }

        int[] arr= {5,1,9,2,0,6};
        for(int i=0; i<arr.length; i++){
            insertintoVertualHeap(arr, i);
        }

        for(int i=0; i<arr.length ; i++){
            arr[arr.length-1-i]  = removeFromVertualHeap(arr, arr.length -i);
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

   }
}
