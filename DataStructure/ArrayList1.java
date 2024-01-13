import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
//    Creating an ArrayList from another collection
        ArrayList<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        System.out.println("\nAll First Five Prime Number : ");
        for(int elem : firstFivePrimeNumber){
            System.out.print(elem+" ");
        }

        ArrayList<Integer> firstTenPrimeNumber= new ArrayList<>(firstFivePrimeNumber);

        System.out.println();
        ArrayList<Integer> nextFivePrimeNumber= new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);
        System.out.println("Next Five Prime Number: ");
        for(int elem : nextFivePrimeNumber){
            System.out.print(elem+" ");
        }



        System.out.println();
        System.out.println("Adding all 10 Prime numbers: ");
        firstFivePrimeNumber.addAll(nextFivePrimeNumber);
        for(int elem : firstFivePrimeNumber){
            System.out.print(elem+" ");
        }
    }


}
