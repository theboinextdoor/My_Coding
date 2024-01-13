import java.util.HashMap;
import java.util.Set;

public class InbuildMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        inserting the value inside the map:
        map.put("abc", 1);
        map.put("def", 1);


//      to know the size of the map:
        int len = map.size();
        System.out.println("SIze of the InbuildMap is : " + len);


//        iteration over the map
        Set<String> keys = map.keySet();
        System.out.println("Iteration: ");
        for (String str : keys) {                         //this is the fast way to iteration
            System.out.print(str + " ");
        }

        System.out.println();

////        check if the key is present or not
        if (map.containsKey("abc")) {
            System.out.println("yes it has abc");
        }
        if (map.containsKey("def")) {
            System.out.println("Yes it has def");
        }

//        check if the key is present or not
        if (map.containsValue(2)) {
            System.out.println("Yes it has the given Value.");
        } else {
            System.out.println("No it has not the given value.");
        }


//       get the value of the key by :  get()
        int v = 0;
        if (map.containsKey("abc")) {
            v = map.get("abc");        //it will give the value of the key
            System.out.println("Value of the key is : " + v);
        } else {
            System.out.println("-1");
        }


//        remove the key you want to delete and keep the value inside a variable

//      two ways to delete the value :-
//      1. if you want to keep the value of the key you have deleted:-

        int s = map.remove("abc");
        System.out.println("value of removed key is : " + s);

//        1. if you don't want to keep the value of the key you have deleted:-
        map.remove("abc");


    }
}