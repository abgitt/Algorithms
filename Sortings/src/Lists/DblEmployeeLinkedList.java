package Lists;
import java.util.*;
import java.util.function.*;
public class DblEmployeeLinkedList
{
	private DblEmployeeNode head;
	private DblEmployeeNode tail;
	private int size=0;

	public int getSize()
	{
		return size;
	}
	public boolean isListEmpty()
	{
		return head==null;
	}

	public void printLst()
	{
		DblEmployeeNode cur = head;
		while(cur!=null)
		{
			System.out.println(cur.getEmployee.get().getName()+"--"+cur);
			cur=cur.getNext.get();
		}
	}

	public void addToFront(Employee emp)
	{
		/*1) Create Bill node
		2) Assign Jane to Bill's next field
		3) Assign whatever jane is pointing to as previous to Bill's previous field
		4) Assign Bill to Janes' prev
		5) Assign head to Bill
		6) O(1)*/	

		DblEmployeeNode empNode = new DblEmployeeNode(emp);
		empNode.setNext.accept(head);
		if(head==null)
			tail = empNode;
		else
			head.setPrev.accept(empNode);
		head = empNode;
		size++;
	}

	public void addToEnd(Employee emp)
	{
		DblEmployeeNode empNode = new DblEmployeeNode(emp);
		if(tail==null)
			head = empNode;
		else
		{
			tail.setNext.accept(empNode);
			empNode.setPrev.accept(tail);
		}
		tail = empNode;
		size++;

	}
}