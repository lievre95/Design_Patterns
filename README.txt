That's simplest example of using design patterns. Specifically here is Singleton, Factory Method and Prototype.
Examples:

      /////////////Singleton
 public static VehicleSelector getInstance(){ //we have a pair of instances with same state (Singleton)
        if (instance==null){
            instance = new VehicleSelector();
        }
        return instance;
    }

      /////////////Factory Method
 Vehicle vehicle = VehicleSelector.getInstance().getVehicle(RoadType.CITY);

      /////////////Prototype
Human original = new Human (23, "Ion");
Human copy1 =(Human)original.copy();
System.out.println(copy1+"this is copy1"); //(Prototype)