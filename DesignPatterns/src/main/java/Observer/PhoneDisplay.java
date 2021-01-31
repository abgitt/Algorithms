package Observer;

public class PhoneDisplay implements IDisplay, IObserver 
{
	WeatherStation station;
	public PhoneDisplay(WeatherStation station)
	{
		this.station = station;
	}
	@Override
	public void update() 
	{
		System.out.println(station.getTime());
	}

	@Override
	public void display() 
	{
		System.out.println("A sample methodd !!!!");
	}

}
