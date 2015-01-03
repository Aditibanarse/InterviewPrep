
public class Stack {
	
	Node start;
	
	Stack()
	{
		start=null;
	}
	
	public void push(int x)
	{
		start=new Node(x,start);
		System.out.println("Pushed "+x);
	}
	
	public int pop()
	{
		int pop;
		if(isEmpty())
		{
			return -1;
		}
		pop=start.data;
		start=start.next;
		return pop;
	}
	
	public int peek()
	{
		return(start.data);
		
	}
	
	public boolean isEmpty()
	{
		return(start==null);
			
		
	}

}
