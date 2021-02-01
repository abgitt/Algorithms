package Lists;

public class CircularSLLMain 
{
	static Node tail = null;
	static int len = 0;
	public static void main(String[] args) 
	{
		tail  = createCLL();
		display();
		System.out.println("Create LL :: Total nodes in the list : "+len);
		insertAtBeg();
		display();
		System.out.println("Ins Beg :: Total nodes in the list : "+len);
		insertAtEnd();
		display();
		System.out.println("Ins End :: Total nodes in the list : "+len);
		insertAtPos();
		display();
		System.out.println("Ins Pos:: Total nodes in the list : "+len);
		deleteFromBeg();
		display();
		System.out.println("Del Beg :: Total nodes in the list : "+len);
		deleteFromEnd();
		display();
		System.out.println("Del End :: Total nodes in the list : "+len);
		deleteFromPos();
		display();
		System.out.println("Del Pos :: Total nodes in the list : "+len);
		reverseCLL();
		display();
		System.out.println("Total nodes in the list : "+len);

	}
	
	static Node createCLL()
	{
		for(int i=0;i<10;i++)
		{
			if(tail==null)
			{
				Node newNode = new Node(0,null);
				tail = newNode;
				tail.next = newNode;
			}	
			else
			{
				
					Node newNode = new Node(i*5,null);
					newNode.next = tail.next;
					tail.next = newNode;
					tail = newNode;
			}
			len++;
		}
		return tail;	
	}
	
	static void display()
	{
		if(tail==null)
			System.out.println("List is not present");
		else
		{
			Node temp = tail.next;
			while(temp.next!=tail.next)
			{
				System.out.print(temp.val+" ");
				temp=temp.next;
				if(temp.next!=tail.next)
					System.out.print("->");
			}
			System.out.println();
		}
	}
	
	static void insertAtBeg()
	{
		Node newNode = new Node(-5,null);
		if(tail==null)
		{
			tail = newNode;
			tail.next = newNode;
		}
		else
		{
			newNode.next = tail.next;
			tail.next = newNode;
		}
		len++;
	}
	
	static void insertAtEnd()
	{
		Node newNode = new Node(45,null);
		if(tail==null)
		{
			tail = newNode;
			tail.next = newNode;
		}
		else
		{
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		len++;
	}
	
	static void insertAtPos()
	{
		int pos = LinkedListMain.getRandomNumber(1, len);
		System.out.println("Positions is :: "+pos);
		if(pos==1) {
			insertAtBeg();
		}
		else
		{
			Node newNode = new Node(100,null);
			Node temp = tail.next;
			int i=1;
			while((i++)<pos-1)
			{
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	static void deleteFromBeg()
	{
		if(tail==null)
		{
			System.out.println("nothing to delete");
		}
		else if(tail.next==tail)
		{
			tail = null;
			len--;

		}
		else
		{
			Node temp = tail.next;
			tail.next = temp.next;
			//free temp
			len--;
		}
	}
	
	static void deleteFromEnd()
	{
		if(tail==null)
		{
			System.out.println("nothing to delete");
		}
		else
		{
			Node temp = tail.next;
			Node prev=null;
			while(temp.next!=tail.next)
			{
				prev = temp;
				temp = temp.next;
			}
			temp.next = tail.next;
			tail = prev;
			//free(free)
			len--;
		}
	}
	
	static void deleteFromPos()
	{
		int pos = LinkedListMain.getRandomNumber(1, len);
		System.out.println("Positions is :: "+pos);
		if(pos==1)
			deleteFromBeg();
		else
		{
			Node temp = tail.next;
			int i=1;
			while((i++)<pos-1)
				temp = temp.next;
			Node fre = temp.next;
			temp.next = fre.next;
			//free(fre)
			len--;
		}
		
	}
	
	static void reverseCLL()
	{
		if(tail==null)
		{
			System.out.println("nothing to revers");
		}
		else if(tail==tail.next)
			return;
		else
		{
			Node prev,temp,nxtNode;
			prev = null;
			temp = tail.next;
			nxtNode = temp.next;
			while(temp!=tail)
			{
				prev = temp;
				temp = nxtNode;
				nxtNode = temp.next;
				temp.next = prev;
				
			}
			nxtNode.next = tail;
			tail = nxtNode;
		}
	}
}

