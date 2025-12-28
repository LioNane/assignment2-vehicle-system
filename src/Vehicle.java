public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    protected Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    protected void SetDriver(Driver driver){
        this.driver = driver;
    }

    protected Driver GetDriver(){
        return driver;
    }

    protected abstract void startEngine();
    protected abstract void stopEngine();

    protected void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
