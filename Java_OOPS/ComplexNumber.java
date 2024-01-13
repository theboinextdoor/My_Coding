import java.util.concurrent.ConcurrentMap;

public class ComplexNumber {

    private int real;
    private int imagionary;
    private int iota= -1;

    public ComplexNumber(int real , int imagionary){
        this.real= real;
        this.imagionary= imagionary;
//        simplify();
    }

    public void print(){
        if(imagionary<0){
            imagionary*=-1;
            System.out.println(real+" - i"+imagionary);
        }else{
            System.out.println(real+" + i"+imagionary);
        }
    }

    public int setReal(int real){
        this.real= real;
        return real;
    }
//
    public int setImg(int imagionary){
        this.imagionary= imagionary;
        return imagionary;
    }

    public void plus(ComplexNumber c2){
        this.real= this.real+ c2.real;
        this.imagionary= this.imagionary+c2.imagionary;

    }

    public void multiply(ComplexNumber c2){
        int realSum= this.real*c2.real;
        int realImgSum= this.real*c2.imagionary + this.imagionary*c2.real;
        int imgSum= (this.imagionary * c2.imagionary)*iota;

        this.imagionary= realImgSum;
        this.real= realSum + imgSum;

    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3){
        int newReal = c1.real + c3.real;
        int newImg= c1.imagionary + c3.imagionary;
        ComplexNumber c= new ComplexNumber(newReal, newImg);
        return c;
    }

//    public static ComplexNumber conjugate(){
//
//
//
//    }

}
