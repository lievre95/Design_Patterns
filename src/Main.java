public class Main {
    public static void main (String[] args){
        Vehicle vehicle = VehicleSelector.getInstance().getVehicle(RoadType.CITY);
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();

        vehicle = VehicleSelector.getInstance().getVehicle(RoadType.MONTAINS);
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();
        vehicle = VehicleSelector.getInstance().getVehicle(RoadType.SEA);
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();
    }
}
// Example Singleton+Fabric method
// We have just one obj and its do not care what specific vehicle there is