<h1><a id="Creational_Design_Patterns_0"></a>Creational Design Patterns:</h1>
<h3><a id="Singleton_Factory_Method__Prototype__Builder_1"></a>Singleton, Factory Method , Prototype , Builder</h3>
<p>That’s simplest example of using design patterns. Specifically here is Singleton, Factory Method , Prototype , Builder.</p>
<p><strong>Singleton</strong><br>
Here we have a VehicleSelector, which implements behavour of singleton and creates new object depends on his state. Moreover, we have a pair of instances with same state and to avoid the dublicating the instances we just create new obj if <em>instance==null</em>. In that case we return completly new instance</p>
<p><em>Example of code:</em></p>
<blockquote>
<p>public static VehicleSelector getInstance(){<br>
if (instance==null){<br>
instance = new VehicleSelector();<br>
}<br>
return instance;<br>
}</p>
</blockquote>
<p><strong>Factory Method</strong><br>
Here we have an object with some  simple inteface, which is appealing the VehicleSelector by specific RoadType.<br>
We have a file, in which is different types of road (RoadType.java). See in RoadType.java the list. Also we have VehicleSelector with one method,<br>
which according by case creates a new specific vehicle.</p>
<p><em>Example of code:</em></p>
<blockquote>
<p>Vehicle vehicle = VehicleSelector.getInstance().getVehicle(RoadType.CITY);</p>
</blockquote>
<p><strong>Prototype</strong><br>
So we have original object Human and the appealing inteface which return the copyable object. Also we have some params as age and name which help us<br>
to edentify the authentic obj and copy. So that’s help us to save time and make the code easy-readable.</p>
<p><em>Example of code:</em></p>
<blockquote>
<p>Human original = new Human (23, “Ion”);<br>
Human copy1 =(Human)original.copy();<br>
System.out.println(copy1+“this is copy1”);</p>
</blockquote>

<strong>Builder</strong><br>
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.</p>
<p><em>Example of code:</em><br>
<blockquote>
<p>Vehicle vehicle = new VehicleBuilder()<br>
.buildMake(“Mercedes”)<br>
.buildTransmission(Transmission.AUTO)<br>
.buildSpeed(240)<br>
.build()</p>
</blockquote>

