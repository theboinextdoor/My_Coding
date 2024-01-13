public class Polynomial {
    private int[] pol;
    private int coef;

    public Polynomial(){
        pol=new int[100];
        coef=0;
    }

    public void setCofficient(int degree, int coef){
        pol[degree]=coef;
    }

    public void print(){
        for(int i=0; i<pol.length; i++){
            if(pol[i]!=0){
                System.out.print(pol[i]+"x^"+i+" ");
            }
        }
        System.out.println();
    }

    public void add(Polynomial p2){
        for(int i=0 ;i< pol.length; i++){
            
        }
    }
}
