public class SecondVehicle implements CarInterface {
    @Override
    public void print() {
        System.out.println("Maximum Speed is: "+getMaxSpeed());
        System.out.println("Company Name is : "+CompanyName());
        System.out.println("Car Number : "+carNumber());
        System.out.println("Car is Motoorised ot not?: "+isMotorised());
    }

    @Override
    public String carNumber() {
        return "MH-0786";
    }

    @Override
    public boolean isMotorised() {
        return true;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public String CompanyName() {
        return "Mustang";
    }
}
