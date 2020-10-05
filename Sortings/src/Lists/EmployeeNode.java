import java.util.*;
import java.util.function.*;
public class EmployeeNode
{
	private Employee emp;
	private EmployeeNode next;
	public EmployeeNode(Employee emp)
	{
		this.emp = emp;
	}

	public Supplier<Employee> getEmployee = () -> emp;	
	public Supplier<EmployeeNode> getNext = () -> next;
	public Consumer<Employee> setEmployee = emp -> this.emp=emp;	
	public Consumer<EmployeeNode> setNext = next -> this.next=next;	

	public String toString()
	{
		return emp.toString();
	}
}