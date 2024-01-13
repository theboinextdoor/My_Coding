import javax.swing.*;
import java.util.Scanner;

public class If_else_Exception {

    public static void checkage(int age) throws NegaativeNumberException,ZeroDenominatorException{
        if(age<0){
            throw new NegaativeNumberException();
        }else if(age==0){
            throw new ZeroDenominatorException();
        }else{
            System.out.println("You are Elegible");

        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age= sc.nextInt();
        try{
            checkage(age);
        }catch(NegaativeNumberException e){
            System.out.println("Age can ever be Negative.");
        }catch(ZeroDenominatorException e){
            System.out.println("Age can never be Zero");
        }finally{
            System.out.println("  -This is Faraz for you");
        }
    }
}
