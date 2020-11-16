package Lists;

import java.util.*;
import java.util.function.*;

public class DblEmployeeNode
{
	private Employee emp;
	private DblEmployeeNode prev;
	private DblEmployeeNode next;
	public DblEmployeeNode(Employee emp)
	{
		this.emp = emp;
	}	

	public Supplier<Employee> getEmployee = () -> emp;	
	public Consumer<Employee> setEmployee = emp -> this.emp=emp;	

	public Supplier<DblEmployeeNode> getNext = () -> next;
	public Consumer<DblEmployeeNode> setNext = next -> this.next=next;	

	public Supplier<DblEmployeeNode> getPrev = () -> prev;
	public Consumer<DblEmployeeNode> setPrev = prev -> this.prev=prev;

	public String toString()
	{
		return emp.toString();
	}
}