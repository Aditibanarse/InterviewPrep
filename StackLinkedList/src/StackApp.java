
public class StackApp {
	public static void main(String[] args) 
	{
		Stack stack=new Stack();
		System.out.println("Stack Empty? "+stack.isEmpty());
		stack.push(76);
		stack.push(54);
		stack.push(87);
		stack.push(90);
		System.out.println("Top of the stack = "+stack.peek());
		System.out.println("Pop "+stack.pop());
		System.out.println("Pop "+stack.pop());
		System.out.println("Pop "+stack.pop());

		


		
	}


}
