package chapter3;

import java.util.ArrayList;

public class SetOfStacks {

	ArrayList<Stack> stacks=new ArrayList<Stack>();
	int top=0;
	int stacksize=5;
	int capacity;
	public SetOfStacks(int capacity)
	{
		this.capacity=capacity;
	}
	//Insert in the stack
	/*
	 * For every element pushed, check if the stack(inner) is full
	 * if yes, increment the top and create a new stack
	 */
	public void push(int val)
	{
//		Stack stackTop=getTop();
		if(isEmpty())
		{
			
			Stack stack=new Stack(stacksize);
			
			//add a stack to the set of stacks
			stacks.add(stack);
			top++;
			Stack stackTop=getTop();
			//push the value to the inner stack
			stackTop.push(val);
			
		}
		else
		{
			
		Stack stackTop=getTop();
		if(isFull())
		{
			System.out.println("Set of stacks is full");
			return;
		}
			
		//check if the inner stack is full
		if(stackTop.isFull())
		{
			
			Stack stack=new Stack(stacksize);
			stacks.add(stack);
			top++;
			stackTop=getTop();
			stackTop.push(val);
		}
		//if the inner stack is not full 
		else
			stackTop.push(val);
		}	
	}
	
	public int pop()
	{
		//get the stack top
		Stack stackTop=getTop();
		if(stackTop.isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		int val=stackTop.pop();
		if(stackTop.top==0)
		{	
			stacks.remove(--top);
			
		}
		return val;
		
	}
	
	public Stack getTop()
	{
		return stacks.get(top-1);
	}
	public boolean isEmpty()
	{
		return top==0;
	}
	
	public boolean isFull()
	{
		return stacks.size()==capacity;
	}
	
	public void display()
	{
		for(int stop=0;stop<stacks.size();stop++)
		{
			stacks.get(stop).display();
		}
	}

}
