package chapter3;

import java.util.ArrayList;

/*
 * Implementation of stack using arraylist
 */
public class StackImpl {
    ArrayList<Integer> stack;
    int top;
	public StackImpl() 
	{
		stack=new ArrayList<Integer>();
		top=0;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Push an element to the stack
	 */
	public void push(int element)
	{
		
		stack.add(element);
		top++;
	}
	
	/*
	 * Pop the topmost element in the stack
	 */
	public int pop()
	{
		int pop=stack.get(top-1);
		stack.remove(top-1);
		top--;
		return pop;
	}
	/*
	 * Peek at the top of the stack without removing the element
	 */
	public int peek()
	{
		return stack.get(top-1);
	}
	
	public boolean isEmpty()
	{
		return top==0;
	}
	
	public void display()
	{
		for(int i=top-1;i>=0;i--)
		{
			System.out.print(stack.get(i)+"  ");
		}
		System.out.println();
	}

}
