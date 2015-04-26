
public class ConcreteVehicle implements Vehicle{
	
	private int kmPerHour; 
	private String brand; 
	private int price; 
	private String color; 
	private int gasReading; 
	
	public ConcreteVehicle(String pBrand, int pPrice, String pColor )
	{
		kmPerHour = 0; 
		brand = pBrand; 
		price = pPrice;
		color = pColor;
		gasReading = 0;
		
	}
	
	public ConcreteVehicle()
	{
		kmPerHour = 0; 
		brand = "none"; 
		price = 0;
		color = "grey";
		gasReading = 0;
	}
	public void drive()
	{
		kmPerHour = 50; 
	}

	public void driveFaster()
	{
		kmPerHour = 75; 
	}

	public int getSpeed() 
	{
		return kmPerHour;
	}
	public void slowDown()
	{
		if (kmPerHour>10)
		{
			kmPerHour = kmPerHour -10; 
		}
	}

	public void stop()
	{
		if (this.getSpeed()!= 0)
		{
			this.setSpeed(0); 
		}
	}
	
	
	private void setSpeed(int i) {
		kmPerHour = i; 
		
	}
	
	public void printType()
	{
		System.out.println("I am a Vehicle!");
	}

	public int getPrice()
	{
		return price;
	}
	public static boolean isDriving(ConcreteVehicle crtVehicle)
	{
		if (crtVehicle.getSpeed() != 0) 
		{
			return true;
		}
		return false; 
	}

}
