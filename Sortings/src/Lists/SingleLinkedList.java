/*
Each item in a linked list is again an array of another item
Each item contain a link to another element
Each item in the list called a node

Node class contain two types -- Data(typeofObj), and next(typeofNode) 
if we have referernce to head we can traverse untill we found the null

JANE   JOHN   MARRY   MIKE   null
insert at the beginng
======================
	1) Create a new node BILL
	2) Assign Jane to the next field
	3) Assign Head to Bill
	4) O(1)
Res::---	BILL   JANE   JOHN   MARRY   MIKE   null

Delete at the begining
======================
	1)	Assign Bill to the temporary va "removeNode"
	2)	Assign head to Jane
	3)	Return removeNode
	4)	O(1) 
	JANE   JOHN   MARRY   MIKE   null

IMP:	Arrays perform well until insertion and deletion is being done at end since there is no shifting is involved 

If we want remove and add the elements at the front of list then singly linked list is useful

memory wastage interms of storing location 	
*/

import java.util.*;
public class SingleLinkedList
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Abi","Gitt","23");
		Employee emp2 = new Employee("Adi","Seshu","24");
		Employee emp3 = new Employee("Isha","Arora","25");
		Employee emp4 = new Employee("Twisa","Tewary","26");
		List<Employee> empList = Arrays.asList(emp4,emp2,emp3,emp1);
		// empList.forEach(System.out::println);
		System.out.println(emp4.equals(new Employee("Twisa","Tewary","26")));

		EmployeeLinkedList lst = new EmployeeLinkedList();
		lst.addAtFront(emp1);
		// lst.printLst();
		lst.addAtFront(emp2);
		// lst.printLst();
		lst.addAtFront(emp4);
		// lst.printLst();
		lst.addAtFront(emp3);
		System.out.println("After adding the elements  - "+lst.getSize());
		lst.printLst();

		// System.out.println("This node got deleted - "+lst.removeAtFront().getEmployee.get());
		lst.printLst();
		System.out.println("After adding the element at end  - ");
		lst.addAtEnd(new Employee("Sonali","Chaudary","27"));
		lst.printLst();

		System.out.println("After adding the element at end  - "+lst.getSize());
		lst.addAtEnd(new Employee("Navneetha","Chaudary","28"));
		lst.printLst();
		System.out.println("After adding the element at top  - "+lst.getSize());
		lst.addAtFront(new Employee("Nishant","Pandey","1"));
		lst.printLst();
		System.out.println(lst.getSize());
		System.out.println("This last node got deleted - "+lst.removeAtEnd().getEmployee.get()+"--"+lst.getSize());
		lst.printLst();


	}
}