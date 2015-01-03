
public class Queue 
{
	Node start;
	Node last;
	
	public Queue() {
		// TODO Auto-generated constructor stub
		start=null;
		last=null;
	}
	
	public void insert(int x)
	{
		if(isEmpty())
		{
			last=new Node(x,last);
			start=last;
			System.out.println("Inserted = "+x);
		}
		else
		{
			last.next=new Node(x,last.next);
			last=last.next;
			System.out.println("Inserted = "+x);

		}
		
	}
	
	public int remove()
	{
		int pop;
		if(start==last)
		{
			pop=start.data;
			last=last.next;
			start=last;
		}
		else
		{
			pop=start.data;
			start=start.next;
			
		}
		return pop;

		
	}
	
	public boolean isEmpty()
	{
		return(start==null);
	}

	
	
}
