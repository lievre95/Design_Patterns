public class VehicleSelector {
    public static VehicleSelector instance;

    public static VehicleSelector getInstance(){ //we have a pair of instances with same state (Singleton)
        if (instance==null){
            instance = new VehicleSelector();
        }
        return instance;
    }
    private VehicleSelector(){
    }
    public Vehicle getVehicle(RoadType roadType){ // creating new obj (Factory)
        Vehicle vehicle  = null;
        switch (roadType){
            case CITY:
                vehicle = new BMW();
            break;
            case MONTAINS:
                vehicle = new Bike();
            break;
            case SEA:
                vehicle = new Boat();
            break;
        }
        return vehicle;
    }
}
