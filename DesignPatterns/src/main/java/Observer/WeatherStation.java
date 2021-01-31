package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherStation implements IObservable
{
	List<IObserver> observers = new ArrayList<>();
	private String temp =new Date().toLocaleString();
	@Override
	public void add(IObserver observer) 
	{
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) 
	{
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() 
	{
		for(IObserver obj:observers)
		{
			obj.update();
		}
	}
	
	public String getTime()
	{
		return temp;
	}
	
}
