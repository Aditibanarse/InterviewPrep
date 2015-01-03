
public class LinkedList {
	
	Node start;
	Node last;
	
	LinkedList()
	{
		start=null;
		last=null;
	}
	
	public void insertFirst(int x)
	{
		if(isEmpty())
		{
			start=new Node(x,start);
			last=start;
		}
		else
		{
		start=new Node(x,start);
		start.next.prev=start;
		}
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
			Node p=last;
			last.next=new Node(x,null);
			last.next.prev=last;
			last=last.next;
			
		}
		
	}
	
	public void deleteFirst()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else if(start.next==null)
		{
			last=null;
		}
		else
		{
			start.next.prev=null;
		}
		start=start.next;

	}
	
	public void deleteLast()
	{
		if(last==null){
			System.out.println("list is empty");
			
		}
		else if(start==last)
		{
			start=null;
		}
		else
		{
			last.prev.next=null;
		}
		last=last.prev;
		
		
	}
	
	
	public boolean isEmpty()
	{
		return(start==null);
			
	}
	
	public void displayFirst()
	{
		Node p=start;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
		
	}
	
	public void displayLast()
	{
		Node p=last;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.prev;
		}
	}

}
