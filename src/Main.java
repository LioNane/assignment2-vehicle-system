void main() {
    Driver john = new Driver("John", "1");
    Driver mike = new Driver("Mike", "2");

    Car car = new Car("Audi", 2014, john,4, "Petrol");
    Motorcycle motorcycle = new Motorcycle("BMW", 2007, john, true);
    Truck truck = new Truck("Kamaz", 2003, mike, 8.0, 2);

    ArrayList<Vehicle> vehicles = new ArrayList<>(3);
    vehicles.add(0, car);
    vehicles.add(1, motorcycle);
    vehicles.add(2, truck);

    for (Vehicle vehicle : vehicles) {
        vehicle.startEngine();
        vehicle.displayInfo();
        vehicle.stopEngine();
        vehicle.GetDriver().displayDriverInfo();
    }
}
