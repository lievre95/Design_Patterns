#  Creational Design Patterns: 
### Singleton, Factory Method , Prototype , Builder
That's simplest example of using design patterns. Specifically here is Singleton, Factory Method , Prototype , Builder.

**Singleton**
Here we have a VehicleSelector, which implements behavour of singleton and creates new object depends on his state. Moreover, we have a pair of instances with same state and to avoid the dublicating the instances we just create new obj if *instance==null*. In that case we return completly new instance

*Example of code:* 
> public static VehicleSelector getInstance(){ 
        if (instance==null){
            instance = new VehicleSelector();
        }
        return instance;
>    }

**Factory Method**
Here we have an object with some  simple inteface, which is appealing the VehicleSelector by specific RoadType. 
We have a file, in which is different types of road (RoadType.java). See in RoadType.java the list. Also we have VehicleSelector with one method, 
which according by case creates a new specific vehicle.

*Example of code:* 
> Vehicle vehicle = VehicleSelector.getInstance().getVehicle(RoadType.CITY);

**Prototype**
So we have original object Human and the appealing inteface which return the copyable object. Also we have some params as age and name which help us 
to edentify the authentic obj and copy. So that's help us to save time and make the code easy-readable.

*Example of code:* 
>Human original = new Human (23, "Ion");
Human copy1 =(Human)original.copy();
>System.out.println(copy1+"this is copy1"); 

*Example of code:* 
**Builder**
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
>Vehicle vehicle = new VehicleBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildSpeed(240)
                .build()
>
