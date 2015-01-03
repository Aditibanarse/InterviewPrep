
public class DelimeterStack {
	
	public char[] delimStack;
	private int top;
	private int size;
	
	public DelimeterStack(int size)
	{
		this.size=size;
		delimStack=new char[size];
		top=-1;
	}
	
	public void push(char c)
	{
		if(top==size)
			System.out.println("Stack full, cannot insert new element");
		else
			delimStack[++top]=c;
	}
	
	public char pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
			return '0';
		}
		else
			return delimStack[top--];
	}
	
	public boolean isEmpty()
	{
		return(top==-1);
			
		
	}
	

}
