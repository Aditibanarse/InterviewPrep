
public class StackImplApp {
	public static void main(String[] args) {
		StackImpl stack=new StackImpl(20);
		
		System.out.println("Stack empty? "+stack.isEmpty());
		stack.push(82);
		stack.push(65);
		stack.push(44);
		stack.push(33);
		System.out.println("Top of the stack " +stack.peek());
		System.out.println("Pop stack "+stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());


	
	}

}
