
public class DoubleEndedList {

	Node start;
	Node last;
	
	public DoubleEndedList() {
		// TODO Auto-generated constructor stub
		start=null;
		last=null;
	}
	
	public void insertFirst(int x)
	{
		if(isEmpty())
		{
			start=new Node(x,start);
			System.out.println("Inserted at position start");
			last=start;
			return;
		}
		
		start=new Node(x,start);
		
	}
	public void insertLast(int x)
	{
		if(isEmpty())
		{
			last=new Node(x,last);
			start=last;
			
		}
		else
		{
		last.next=new Node(x,last.next);
		last=last.next;
		}
	}
	public void deleteFirst()
	{
		Node p=start;
		if(start==last) //there is only one node in the linkedList
		{
			start=start.next;
			last=start;
		}
		start=start.next;
		
	}
	
	public void find(int x)
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node p=start;
			while(p!=null)
			{
				if(p.data==x)
				{
					System.out.println("Found element "+ x);
					break;
				}
				p=p.next;
					
					
			}
			System.out.println("Not Found");
		}
		
	}
	
	public boolean isEmpty()
	{
		return(start==null);
			
	}
	
	public void display()
	{
		System.out.println("Data at start = "+start.data);
		System.out.println("Data at last = "+last.data);
	}
	
}
