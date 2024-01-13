import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EnumSet;

public class Map<K, V> {

    ArrayList<MapNode<K, V>> buckets;
    int size;                                   // Number of entry
    int numBuckets;                          //Number of buckets


    public Map(){
        numBuckets = 5;
        buckets= new ArrayList<>();
        for(int i=0; i < 20 ; i++){
            buckets.add(null);
        }
    }


    private int getBucketIndex(K key){
        int hashCode = key.hashCode();                      //generating HashCode ;
        return hashCode%numBuckets ;                        //compressing the hashcode
    }


    public double loadfactor() {
        return (1.0 * size) / numBuckets;
    }


    private void rehash(){
        System.out.println("Rehashing buckets:  "+ numBuckets + " , size : "+ size);
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();

        for(int i=0; i<2*numBuckets; i++){
            buckets.add(null);
        }
        size= 0;
        numBuckets*=2;

        for(int i=0; i< temp.size(); i++){
            MapNode<K, V> head= temp.get(i);
            while(head != null){
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head= head.next;
            }
        }

    }



//    put function of hashmap
    public void insert(K key, V value){
        int bucketIndex= getBucketIndex(key);
        MapNode<K , V> head= buckets.get(bucketIndex);

        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
            }
            head =head.next;
        }

        head= buckets.get(bucketIndex);
        MapNode<K, V> newElement= new MapNode<>(key, value);
        size++;
        newElement.next = head;
        buckets.set(bucketIndex, newElement);
        double loadFunction = (1.0 * size) / numBuckets;
        if(loadFunction > 0.7){
            rehash();
        }

    }



    //search function of hashmap
    public V getValue(K key){
            int bucketIndex = getBucketIndex(key);
            MapNode<K , V> head= buckets.get(bucketIndex);

            while(head != null){
                if(head.key.equals(key)){
                    return head.value;
                }
                head=head.next;
            }
            return null;
    }



    //remove function of hashmap
    public V removeKey(K key){
        int bucketIndex= getBucketIndex(key);
        MapNode<K, V> head= buckets.get(bucketIndex);

        MapNode<K, V> prev = null;
        while(head != null){
           if(head.key.equals(key)){
               size--;
              if(prev == null){
                  buckets.set(bucketIndex, head.next);
              }else{
                  prev.next = head.next;
              }
               return head.value;
           }
            prev= head;
            head= head.next;
        }
      return null;
    }


    //size function
    public int size(){
        return size;
    }


    public static void main(String[] args) {
        Map<String , Integer> map = new Map<>();
        for(int i= 0; i< 20; i++){
            map.insert("abc"+i , i+1);
            System.out.println("i = "+ i+ " lf : "+ map.loadfactor());
        }
    }

}
