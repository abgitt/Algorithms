package Lists;

import java.util.*;
import java.util.function.*;
public class EmployeeLinkedList
{
	private EmployeeNode head;
	private int size;
	public void addAtFront(Employee emp)
	{
		EmployeeNode myNode = new EmployeeNode(emp);
		myNode.setNext.accept(head);
		head = myNode;
		size++;
	}

	public void printLst()
	{
		EmployeeNode cur = head;
		while(cur!=null)
		{
			System.out.println(cur.getEmployee.get().getName()+"--"+cur);
			cur=cur.getNext.get();
		}
	}

	public EmployeeNode removeAtFront() //removeFromFront
	{
		if(isListEmpty())
			return null;
		EmployeeNode removeNode = head;
		head = head.getNext.get();
		size--;
		removeNode.setNext.accept(null);
		return removeNode;
	}

	public void addAtEnd(Employee emp)
	{
		EmployeeNode cur = head;
		EmployeeNode myNode = new EmployeeNode(emp);
		EmployeeNode prev = head;

		while(cur!=null)
		{
			// System.out.println(cur);
			cur = cur.getNext.get();
			if(cur!=null)
			prev = cur;
		}
		prev.setNext.accept(myNode);
		myNode.setNext.accept(null);
		size++;
	}

	public EmployeeNode removeAtEnd()
	{
		EmployeeNode removeNode = null;
		EmployeeNode cur = head;
		
		while(cur.getNext.get().getNext.get()!=null)
			cur = cur.getNext.get();
		removeNode = cur.getNext.get();
		cur.setNext.accept(null);
				size--;

		return removeNode;
	}
	public int getSize()
	{
		return size;
	}
	public boolean isListEmpty()
	{
		return head==null;
	}
}