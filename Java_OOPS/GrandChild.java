public class GrandChild extends Child {
    GrandChild(){
        System.out.println("This is GrandSon COnstructor");
    }

    GrandChild(int x, int y, int z){
        super(x,y);
        System.out.println("This is GrandSon Constructor with "+z+" value");
    }
}
