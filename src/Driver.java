import java.util.ArrayList;

public class Driver {
    private String name;
    private String licenseNumber;
    private ArrayList<Vehicle> vehicles;

    public Driver(String name, String licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
        vehicles = new ArrayList<>();
    }

    public void displayDriverInfo(){
        System.out.println("Name: " + name);
        System.out.println("License number: " + licenseNumber);
    }
}
