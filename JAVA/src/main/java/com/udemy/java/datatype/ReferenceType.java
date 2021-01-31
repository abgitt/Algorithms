package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType 
{
	public static void main(String[] args)
	{
		int[] a = {5}; // here we are creating the new instanace of arrray type. Therefore, Array is a class
			// Here object is created that is a
		System.out.println("Before change : "+ Arrays.toString(a)); //[5]
		change(a);
		System.out.println("After change : "+ Arrays.toString(a)); //[6]
		change2(a);
		System.out.println("After change : {this is new instance of array created,,,}"+ Arrays.toString(a)); //[6]

	}

	private static void change2(int[] a) {
		a=new int[] {5}; // if this line is commeneted then we lost the original ref that passed. Therefore, calling fucntion won't get the sum value
		a[0]++;
	}

	private static void change(int[] a) {
		a[0]++;
	}
}
