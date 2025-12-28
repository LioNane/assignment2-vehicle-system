public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    protected abstract void startEngine();
    protected abstract void stopEngine();

    protected void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
