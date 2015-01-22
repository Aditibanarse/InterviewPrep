package chapter3;
/*
 * Implementing a Queue Using two stacks
 */
public class QueueStack {

	StackImpl front;
	StackImpl back;

	public QueueStack() {
		// TODO Auto-generated constructor stub
		front=new StackImpl();
		back=new StackImpl();
		
		
	}
	
	/*
	 * Making use of stack front just for pushing the element
	 */
	public void push(int val)
	{
		front.push(val);
		
		
	}
	/*
	 * For every pop, pop all the elements from front and push it to back
	 * This is as good as reversing the stack
	 * The top most element will be the first element inserted
	 */
	public int pop()
	{
		if(!back.isEmpty())
			return back.pop();
		while(!front.isEmpty())
		{
			back.push(front.pop());
		}
		return back.pop();
	}
	
	public int peek()
	{
		if(!back.isEmpty())
			return back.peek();
		while(!front.isEmpty() && back.isEmpty())
		{
			back.push(front.pop());
			
		}
		int val=back.peek();
		return val;
		
	}
	
	public void display()
	{
		System.out.println("front is");
		front.display();
		System.out.println("back is ");
		back.display();
		
		System.out.println("==============================");
	}
	

}
