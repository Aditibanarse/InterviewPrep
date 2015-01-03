
public class ReverseWord {
	
	char[] stackArray;
	int size;
	int top;
	
	public ReverseWord(int size)
	{
		this.size=size;
		stackArray=new char[size];
		top=-1;
	}
	
	public void push(char s)
	{
		if(top==size)
			System.out.println("Stack full");
		else
			stackArray[++top]=s;
			
			
			
	}
	
	public char pop()
	{
		if(top==-1)
		{
			return '0';
		}
		else
			return stackArray[top--];
		
	}
	
	public char peek()
	{
		if(top==-1)
		{
			return '0';
		}
		else
			return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}

}
