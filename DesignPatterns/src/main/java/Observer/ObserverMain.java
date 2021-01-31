package Observer;

public class ObserverMain {

	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
		WeatherStation station = new WeatherStation();
		PhoneDisplay p = new PhoneDisplay(station);
		station.add(p);
		station.notifyObserver();		
		WindowDisplay w = new WindowDisplay(station);
		station.add(w);
		station.notifyObserver();
		System.out.println("**************************\n\n\n");
		}
	}

}
