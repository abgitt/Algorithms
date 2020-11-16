package Lists;
/*
List is an abstarct data type(means interface is invloved) and not concrete data structure.
	AbstractList And AbstarctSequentailList
		instead of implementing list we can extend above list

		add,contains,get,indexOf,remove,size

	Abstarct data type is not a concreate data structure	
	Doesn't dictate how the data is organized.
	Dictates the operations can perform
	Concrete data structure is a calss where as abstract data type is an interface(They are just giving the behavior)

	ArrayList init cap is 10 only....

	imp:
	==
	good for random access , if you have index you can iterate through list
	not good to insert elements other than end
	not food for deletions,removals and checking for an element index which is not present.

	Vector : Threadsafe arraylist

*/
import java.util.*;
public class ArrayList
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Abi","Gitt","23");
		Employee emp2 = new Employee("Adi","Seshu","24");
		Employee emp3 = new Employee("Isha","Arora","25");
		Employee emp4 = new Employee("Twisa","Tewary","26");
		List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4);
		empList.forEach(System.out::println);
		System.out.println(emp4.equals(new Employee("Twisa","Tewary","26")));

	}
}
