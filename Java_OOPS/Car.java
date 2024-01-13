public class Car extends Vehicle{
    String modelName;
    public int mileage;



    public void promptCar(){
        super.promptVehicle();
        System.out.println("Enter the Model Name : ");
        modelName= sc.next();
        System.out.println("Enter the Mileage of Car: ");
        mileage= sc.nextInt();

    }

    public  boolean isMotorised(){
        return true;
    }

    public void print(){
        super.print();
        System.out.println("Model Name : "+modelName);
        System.out.println("Mileage: "+ mileage+"km/hr");
    }


}
