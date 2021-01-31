package com.udemy.java;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.interfacePolymorphism.Alarm;
import com.udemy.java.interfacePolymorphism.Clock;
import com.udemy.java.interfacePolymorphism.GoogleMini;
import com.udemy.java.interfacePolymorphism.IPhone;
import com.udemy.java.polymorphism.Animal;
import com.udemy.java.polymorphism.Cat;
import com.udemy.java.polymorphism.Dog;
import com.udemy.java.polymorphism.Horse;

public class TestMain {

	public static void main(String[] args) 
	{
		/*AreaCalculator obj = new AreaCalculator();
		System.out.println(obj.getArea(5));
		System.out.println(obj.getArea(5,6));
		System.out.println(obj.getArea(5.45));*/
		
		
		// this is overloading
		Cat c  = new Cat();
		test(c);
		
		Dog d = new Dog();
		test(d);

		Horse h = new Horse();
		test(h);
		
		//overriding using reference variable
		Animal a = new Cat();
		test(a);
		a = new Dog();
		test(a);
		a = new Horse();
		test(a);

		
		IPhone i = new IPhone();
		
		testAlarm(i);
		
		GoogleMini g = new GoogleMini();
		testAlarm(g);

		Clock cl = new Clock();	
		testAlarm(cl);
		
		//method ref
		
		Alarm al  = new IPhone();
		testAlarm(al);
		al = new GoogleMini();
		testAlarm(al);

		al = new Clock();	
		testAlarm(al);
		
		List<Alarm> k= new ArrayList();
		k.add(i);
		k.add(g);
		k.add(cl);

		
		

		
		
	}
	
// The below methods are overloaded methods.
// If more animals are there again we need to write one more method.
// Hense for such kind of cases instead of using overloading we can use overriding....
	/*private static void test(Horse c) {
		c.makeSound();
		c.walk();	
	}
	private static void test(Dog c) {
		c.makeSound();
		c.walk();	
	}
	public static void test(Cat c)
	{
		c.makeSound();
		c.walk();
	}*/
	
	private static void test(Animal c) {
		c.makeSound();
		c.walk();	
	}
	
	
	// overloaded methods
	/*public static void testAlarm(IPhone i)
	{
		i.setAlarm();
	}
	public static void testAlarm(GoogleMini i)
	{
		i.setAlarm();
	}
	public static void testAlarm(Clock i)
	{
		i.setAlarm();
	}*/
	
	//override
	public static void testAlarm(Alarm i)
	{
		i.setAlarm();
	}
}
