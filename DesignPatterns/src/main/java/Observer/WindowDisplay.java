package Observer;

public class WindowDisplay implements IDisplay, IObserver 
{
	WeatherStation station;
	public WindowDisplay(WeatherStation station)
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