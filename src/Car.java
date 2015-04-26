
public class Car extends ConcreteVehicle{


	
	public Car(String pBrand, int pPrice, String pColor)
	{
		super(pBrand, pPrice, pColor); 
	}

	public Car()
	{
		super();
	}
	public static void  printAvailableCarBrands() 
	{
		System.out.println("Audi, Porshce, Ferrari");
	}
	
	@Override
	public void printType()
	{
		System.out.println("I am a Car!");
	}
	
	


}


