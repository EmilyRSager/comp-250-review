import java.util.HashMap;


public class Dealership {
	
	HashMap<Object, Integer> aInventory; 
	
	public Dealership()
	{
		aInventory = new HashMap<Object, Integer>(); 
	}
	
	public void addVehicle(ConcreteVehicle pVehicle)
	{
		aInventory.put(pVehicle, pVehicle.getPrice()); 
	}
	
	public void addCar (Car pCar)
	{ 
		
		addVehicle(pCar);
	}
	
	public void addBus(Bus pBus)
	{
		addVehicle(pBus);
	}
	
	public static void main(String [] args)
	{
		Car v1 = new Car(); 
		ConcreteVehicle v2 = new Car(); 
		Vehicle v3 = new ConcreteVehicle();
		Vehicle v4 = new Car(); 
		
		v1.printType(); //Prints that it is a car -- runtime and compile time types match, easy one
		v2.printType(); 
		v3.printType(); 
		v4.printType();
	}

}
