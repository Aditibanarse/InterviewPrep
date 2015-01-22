package chapter3;

public class SortStack {

	StackImpl sorted_stack=new StackImpl();
	StackImpl stack;
	public SortStack(StackImpl stack) {
		// TODO Auto-generated constructor stub
		this.stack=stack;
	}
	
	public StackImpl sort()
	{
		stack.display();
		while(!stack.isEmpty())
		{	
		if(sorted_stack.isEmpty())
		{
			
			int pop=stack.pop();
			sorted_stack.push(pop);
			sorted_stack.display();
		}
		else
		{
			int pop=stack.pop();
			while(!sorted_stack.isEmpty() && pop>sorted_stack.peek())
			{
				int sortedStackPop=sorted_stack.pop();
				stack.push(sortedStackPop);
				
			}
			sorted_stack.push(pop);
			sorted_stack.display();
			
		}
		}
		return sorted_stack;
	}

}
