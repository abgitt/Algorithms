package Lists;

/**

	we have nodes head and tail
	node prev next

	head -> prev null
	tail -> next null

	<-jane	jone	marry	mike->null
		h                     t
		jane->next   jone
		jone->prev   jane 

	If we want to add an element at end we can do in constant time since we are having a ref to end node
	If it is in middle we have to do linear way


	Insert At head
	===========
	Bill

	1) Create Bill node
	2) Assign Jane to Bill's next field
	3) Assign whatever jane is pointing to as previous to Bill's previous field
	4) Assign Bill to Janes' prev
	5) Assign head to Bill
	6) O(1)	

	Insert At Tail
	==============
	BILL

	1) Create Bill Node
	2) Assign tail's next to bill next
	3) Assign tail to bill prev
	4) Assign tails next field to bill
	5) Assign tail to bill
	6) O(1)

	Delete from Head
	================

	1) Assign jane to ramoveNode
	2) Assign John's prev to Jane Prev
	3) Assign head to Jane's next
	4) return removedNode
	5) Set jane's next to null
	6) O(1)

	Delete from end
	===============

	1) Assign Bill to removedNode
	2) Assign Mikes next to Bills next
	3) Assign tail to bill's prev
	4) return removedNode
	5) O(1) 

	To insert Node A b/n BandC
	===========================
	1) Assign A's next filed to B' next filed(C)
	2) Assign A's Prev field to C's prev filed(B)
	3) Assign B's next to A
	4) Assign C's prev to A
	5) O(1), but we have to find the insert position first which is going  to take O(n).

	To remove node A, b/n BandC
	===========================
	1) Assign A to removedNode
	2) Assign C's prev to A's Prev
	3) Assign B's next to A's next
	4) Return A       
	5) O(1), but we have to find the A's position first which is going  to take O(n).

*/
import java.util.*;
public class DoublyLinkedList
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Abi","Gitt","23");
		Employee emp2 = new Employee("Adi","Seshu","24");
		Employee emp3 = new Employee("Isha","Arora","25");
		Employee emp4 = new Employee("Twisa","Tewary","26");	


		DblEmployeeLinkedList lst = new DblEmployeeLinkedList();
		System.out.println(lst.isListEmpty());
		lst.addToFront(emp1);
		// lst.printLst();
		lst.addToFront(emp2);
		// lst.printLst();
		lst.addToFront(emp4);
		// lst.printLst();
		lst.addToFront(emp3);
		System.out.println("After adding all the elements  - "+lst.getSize());
		lst.printLst();

		System.out.print("After adding the element at end  - ");
		lst.addToEnd(new Employee("Sonali","Chaudary","27"));
		System.out.println(lst.getSize());
		lst.printLst();
		System.out.print("After adding the element at begining  - ");
		lst.addToFront(new Employee("Navneetha","Chaudary","28"));
		System.out.println(lst.getSize());
		lst.printLst();

	}
}