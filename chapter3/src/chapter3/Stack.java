package chapter3;

public class Stack {

	int top;
	int[] stack;
	int limit;
	public Stack(int size) {
		
		top=0;
		this.limit=size;
		stack=new int[size];
		// TODO Auto-generated constructor stub
	}
	
	public void push(int val)
	{
		stack[top]=val;
		top++;
		
	}
	
	public int pop()
	{
		int val=stack[--top];
		stack[top]=0;
		
		return val;
		
	}
	
	public boolean isEmpty()
	{
		
			return top==0;
		
	}
	
	public boolean isFull()
	{
		return top==limit;
	}
	
	public void display()
	{
		for(int i=0;i<limit;i++)
			System.out.println("Stack  "+stack[i]);
		
		System.out.println("=================");
	}

}
