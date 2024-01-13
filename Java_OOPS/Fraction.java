public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        if(denominator==0){
            return;
        }
        this.denominator= denominator;
        simplify();
    }

    public void simplify(){
        int gcd= 1;
        int smallest = Math.min(numerator, denominator);
        for(int i=2; i<=smallest; i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator/=gcd;
        denominator/=gcd;
    }

    public void print() {
        if (denominator == 0) {
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    public void setNumerator(int numerator){
        this.numerator=numerator;
        simplify();
    }

    public void setDenominator(int denominator) throws ZeroDenominatorException{
        if(denominator==0){
            ZeroDenominatorException e= new ZeroDenominatorException();
            throw e;
        }
        this.denominator= denominator;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void add(Fraction f1){
        this.numerator= this.numerator*f1.denominator + this.numerator*f1.numerator;
        this.denominator= this.denominator*f1.denominator;
    }

    public void mul(Fraction f2){
        this.numerator= this.numerator*f2.numerator;
        this.denominator= this.denominator* f2.denominator;
    }

    public static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDenum= f1.denominator * f2.denominator;
        Fraction f= new Fraction(newNum, newDenum);
        return f;
    }


}
