
public class SinglySortedLinkedList {

	Node start;
	
	public SinglySortedLinkedList(Node start) {
		// TODO Auto-generated constructor stub
		
		this.start=start;
	}
	
	//insert
	public void insert(int x)
	{
//		System.out.println(start);
		if(start==null || start.data>x)
		{
			start=new Node(x,start);
			System.out.println("Inserted at start");
			return;
		}
		
		Node p=start;
		
		while(p.next!=null)
		{
			if(p.next.data>x)
			{
				break;
			}
			else
				p=p.next;
		}
		p=new Node(x,p.next);
		System.out.println("Inserted");
	}
	
	//delete
	public void delete(int x)
	{
		if(start==null || start.data>x)
		{
			System.out.println("Element not in the list");
			return;
		}
		if(start.data==x)
		{
			start=start.next;
			return;
		}
		
		Node p=start;
		while(p.next!=null)
		{
			if(p.data>x)
				break;
			else if(p.next.data==x)
			{
				p.next=p.next.next;
				break;
			}
				
		}
		System.out.println("Deleted");
	}
	//find
	
	public int find(int x)
	{
		if(start==null)
			return -1;
		Node p=start;
		while(p.next!=null)
		{
			if(p.data==x)
				return x;
			p=p.next;
		}
		return -1;
	}
	//isEmpty
	public boolean isEmpty()
	{
		return (start==null);
			
	}
	
	public void display()
	{
		if(start==null)
		{
			System.out.println("null");
		}
		else
		{
				Node p=start;
				while(p!=null)	
				{
				System.out.print(p.data+ "|");
				p=p.next;
				}
				System.out.println();
				
			}
		}
	}
	
	

