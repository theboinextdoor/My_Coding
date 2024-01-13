import java.util.Scanner;

public abstract class  Vehicle {
    Scanner sc= new Scanner(System.in);
    String brand;
   private int maxspeed;

   public void print(){
       System.out.println("Vehicle Brand: "+brand);
       System.out.println("Maximum Speed: "+getMaxspeedspeed());
   }

   public abstract boolean  isMotorised();
    public void setMaxspeed(){
        System.out.println("Set the Maximum speed of car: ");
        this.maxspeed= sc.nextInt();
    }

    public int getMaxspeedspeed(){
       return maxspeed;
    }

    public void promptVehicle(){
        System.out.println("Enter the Brand Name: ");
        brand= sc.next();
        setMaxspeed();

    }
}
