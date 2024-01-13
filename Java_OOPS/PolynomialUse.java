public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1= new Polynomial();

        p1.setCofficient(0,3);
        p1.setCofficient(2,2);
        p1.print();

        Polynomial p2= new Polynomial();
        p2.setCofficient(0,3);
        p2.setCofficient(2,2);
        p2.setCofficient(1,5);
        p2.setCofficient(2,5);
        p2.print();
//
        p1.add(p2);
        p1.print();
        p2.print();
//
//        p2.multiply(p2);
//        p2.print();
//        p1.print();

//        Polynomial p3= new Polynomial.add(p1,p2);
//        p3.print();
//        p1.print();
//        p2.print();




    }
}
