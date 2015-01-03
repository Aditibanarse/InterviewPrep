/*
 * implementation of stack using array
 */
public class StackImpl {
	
	private int size;
	public int stackArray[];
	private int top;
	
	/*
	 * constructor
	 */
	
	public StackImpl(int capacity)
	{
		this.size=capacity;
		stackArray=new int[size];
		top=-1;
	}
	
	
	/*
	 * push
	 * insert the element into stack. Stack is a LIFO structure.
	 */
	public void push(int element)
	{
		if(top==size-1)
			System.out.println("Stack is full");
		else
			stackArray[++top]=element;
	}
	
	/*
	 * peek
	 */
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
			return stackArray[top];
	}
	/*
	 * pop
	 */
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			int data = stackArray[top--];
			stackArray[top+1]=-1;
			return data;
			
		}
	}
	
	/*
	 * isEmpty
	 */
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		if(top==-1)
			return 0;
		else
			return top;
	}

}
