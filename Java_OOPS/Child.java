public class Child extends Parents{
    Child(){
        System.out.println("This is Child Constructor");
    }

    Child(int x, int y){
        super(x);
        System.out.println("This is Child Constructor with "+y+" value");
    }

}
