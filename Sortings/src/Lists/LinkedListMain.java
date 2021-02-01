package Lists;

import java.util.*;
import java.lang.Math;
class Node
{
	int val;
	Node next;
	public Node(int val,Node next)
	{
		this.val = val;
		this.next = next;
	}
}
public class LinkedListMain
{
	public static void main(String[] args) 
	{
		Node head = null;
		head = createLL();
		display(head);	
		head = reverseLL(head);
		display(head);
		head = insertAtBeg(head);
		display(head);
		head = insertAtEnd(head);
		display(head);
		head = insertAtPos(head,getRandomNumber(1,len(head)));
		display(head);
		head = deleteAtBeg(head);
		display(head);
		head = deleteAtEnd(head);
		display(head);
		head = deleteAtPos(head,getRandomNumber(1,len(head)));
		display(head);

	}

	public static Node deleteAtBeg(Node head)
	{
		System.out.println("****Delete at the begining of Linked List******");
		if(head==null)
			return null;
		else
		{
			Node temp = head;
			head = head.next;
			System.out.println("Deleted node data is "+temp.val);
			//free(temp)
		}
		return head;
	}

	public static Node deleteAtEnd(Node head)
	{
		System.out.println("****Delete at the End of Linked List******");
		if(head==null)
			return null;
		else
		{
			Node temp = head;
			while(temp.next.next!=null) // At this moment pointer is 2 nodes before the last. until that loop will execute
			{
				temp = temp.next; // now we are getting after that node 
			}
			System.out.println("Deleted node data is "+temp.next.val);
			temp.next = null; // we are making temp.next that is last but one node value as null
			//free temp.next.next
		}
		return head;
	}

	public static Node deleteAtPos(Node head,int pos)
	{
		if(head==null)
			return null;
		else
		{
			System.out.println("****Delete value at the given position"+pos+" of Linked List******");
			if(pos==1)
			{
				Node temp = head;
				head = head.next;
				System.out.println("Deleted node data is "+temp.val);
			}
			else
			{
				Node temp = head,prev = head;
				int i=1;
				while(i<pos)
				{
					prev = temp;
					temp = temp.next;
					i++;
				}// prev and temp.. temp will be one above and contains the original data.therfore prev.next is pointing to temp.next 
				prev.next = temp.next;
			}
			return head;
		}
		
	}

	public static Node insertAtPos(Node head,int pos)
	{
		// inserting an element at a position like 1,2,3 etcc.. not in indexes. 
		Node temp = head,prev=head;
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		Collections.shuffle(al);
		Node newNode = new Node(al.get(0)*7,null);
		System.out.println("****Insert value"+al.get(0)+" at the given position"+pos+" of Linked List******");
		if(pos==1) // same like insert at begining
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{	
			int i = 1; // start from 1 it will go to till the position  
			while(i<pos)
			{
				prev=temp; // it will contain the previous node before position
				i++;
				temp=temp.next; // it will contain the node at given position 
			}
			prev.next = newNode;
			newNode.next = temp;
		}	

		return head;
	}

	public static Node insertAtBeg(Node head)
	{
		System.out.println("****Insert at the begining of Linked List******");
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		Collections.shuffle(al);
		Node newNode = new Node(al.get(0)*11,null);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		return head;

	}



	public static Node insertAtEnd(Node head)
	{
		System.out.println("****Insert at the End of Linked List******");
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		Collections.shuffle(al);
		Node newNode = new Node(al.get(0)*10,null);
		Node temp = head;
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;

	}
	public static Node createLL()
	{
		System.out.println("****Creating the Linked List******");
		Node head = null;
		Node temp = head;
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		Collections.shuffle(al);
		for(int num:al)
		{
			Node newNode = new Node(num,null); // Creating a new node
			if(head==null)
			{
				head = newNode;	// Assigning the first node
				temp = head;	
			}
			else
			{
				temp.next = newNode; // if head is already created, while creating the node it self, we are making a pointer which pointing to the last node
				temp = newNode;	  // Assign the new node to last always
			}

		}
		return head;
	}

	public static Node reverseLL(Node head)
	{
		System.out.println("Reversing the Linked List");
		Node prev = null,curr = head, nxt = head;
		while(nxt!=null)
		{
			nxt = nxt.next; // moving nxt pointer to next
			curr.next = prev; // reversing the link. curr node pointing to the previous node.
			prev = curr ; //once node pointed, then moving the previous pointer to curr
			curr = nxt;// curr moving to the next pointer.   
		}
		head = prev; // by end, curr adn nxt will move to last. So we are returning prev as head  
		return head;
	}

	public static void display(Node temp)
	{
		System.out.println("*******Current State of list is **********n");
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static int len(Node temp)
	{
		int lengthh = 0;
		while(temp!=null)
		{
			lengthh++;
			temp = temp.next;
		}
		return lengthh;
	}
	public static int getRandomNumber(int min, int max) 
	{
		System.out.println("Indexs located between "+min+" and "+max);
    	return (int) ((Math.random() * (max - min)) + min);
	}
}

