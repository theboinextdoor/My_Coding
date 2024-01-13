public class Fraction_Use {
    public static void main(String[] args) {   //handling the error exception
        Fraction f1= new Fraction(20,30);
        f1.print();

        f1.setNumerator(12);
        int d= f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
//        int i=0;
        
        try{
            f1.setDenominator(30);
        }catch(ZeroDenominatorException e){
            System.out.println("Denominator can't be 0.");
        }
        f1.print();

        Fraction f2= new Fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3= new Fraction(4,5);
        f3.mul(f2);
        f3.print();
        f2.print();

        Fraction f4= Fraction.add(f1,f2);
        f1.print();
        f3.print();
        f4.print();
//        System.out.println("Value of i is "+i);
    }
}
