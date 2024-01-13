import java.sql.SQLOutput;

public class PairMain {
    public static void main(String[] args) {
        Pair<String> p = new Pair<String>("abc", "def");
        System.out.println(p.getFirst()+" "+p.getSecond());
        p.setFirst("faraaz");
        String str= p.getFirst();
        System.out.println(str);

        Pair<Integer> p1= new Pair<Integer>(100, 200);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        Pair<Character> p2= new Pair<>('a', 'b');
        System.out.println(p2.getFirst()+" "+ p.getSecond());
        p2.setFirst('d');
        p2.setSecond('v');
        System.out.println(p2.getFirst()+" "+ p.getSecond());

        System.out.println("Pair Second :- ");
        Pair2<Integer,String> pp= new Pair2<Integer, String>(123, "Faraaz");
        System.out.println(pp.getFirst());
        System.out.println(pp.getSecond());


        System.out.println("Pair 3:-");
        int a = 10;
        int b= 20;

        Pair<Integer, Integer> internalPair= new Pair<>(a, b);
        Pair2<Pair, Integer> String> ps= new Pair2<>(internalPair, String);

    }
}
