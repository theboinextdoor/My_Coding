import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<=4; i++){
            System.out.print(i+1+": ");
            arr.add(sc.nextInt());
        }
//        arr.remove();

        for(int elem :arr){
            System.out.print(elem+" ");
        }

        System.out.println();
        arr.add(60);
        arr.add(70);
        System.out.println("After Adding two more ELements : ");
        for(int elem :arr){
            System.out.print(elem+" ");
        }

        System.out.println();
        for(int i=0;i<arr.size(); i++){
            System.out.print(i+1+": ");
            arr.set(i, sc.nextInt());
        }

        for(int elem : arr){
            System.out.print(elem+" ");
        }

        arr.clear();
        System.out.println("\n After clear the Array size \n Now thw size of the Array: "+arr.size());

    }
}