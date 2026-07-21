abstract class Vehicle{

    private String vehicleNumber;
    private String ownerName;

    public void setDetails(String vehicleNumber, String ownerName){
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }
    
    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Ownwer Name: " + ownerName);
    }

    public abstract void calculateParkingFee();
    
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts using self start");
    }
    @Override
    public void calculateParkingFee(){
        System.out.println("Parking Fee: 20/-");
    }
}

class car extends Vehicle{
    @Override
    public void calculateParkingFee(){
        System.out.println("Parking Fee: 50/-");
    }
}

public class VehicleParking {
    public static void main(String[] args){

        Vehicle bike = new Bike();
        Bike bk = new Bike();
        bike.setDetails("TS09AB1234","Ram");
        bike.setDetails("TS07AB1278","Mani");
        bk.setDetails("TS09AB1235","Priya");

        bike.displayDetails();
        bk.start();
        bk.displayDetails();
        bike.calculateParkingFee();

        System.out.println();

        Vehicle car = new car();
        car.setDetails("TS10XY1598","Raj");

        car.displayDetails();
        car.calculateParkingFee();

    }
}
