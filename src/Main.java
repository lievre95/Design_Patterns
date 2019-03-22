public class Main {
    public Main(){}
    public static void main (String[] args){
        Human original = new Human (23, "Ion");
        System.out.println(original+"This is authentic obj");

        Vehicle vehicle = VehicleSelector.getInstance().getVehicle(RoadType.CITY);
        Human copy1 =(Human)original.copy();
        System.out.println(copy1+"this is copy1"); //(Prototype)
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();
        vehicle = VehicleSelector.getInstance().getVehicle(RoadType.MONTAINS);
        Human copy2 =(Human)original.copy();
        System.out.println(copy2+"this is copy2"); //(Prototype)
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();
        vehicle = VehicleSelector.getInstance().getVehicle(RoadType.SEA);
        Human copy3 =(Human)original.copy();
        System.out.println(copy3+"this is copy3"); //(Prototype)
        vehicle.pick_up();
        vehicle.drive();
        vehicle.get_fuel();
        vehicle.stop();
    }
}
