package chapter3;

public class ThreeStackMain {

	public static void main(String[] args) {
		
		ThreeStackImpl stack=new ThreeStackImpl(3);
		stack.push(0, 4);
		stack.push(2, 9);
		stack.push(1, 45);
		stack.display();
		
		stack.push(0, 32);
		stack.push(2, 22);
		stack.push(1, 98);
		stack.display();
		
		stack.push(0,12);
		stack.push(2,54);
		stack.push(1, 34);
		stack.display();
		
		System.out.println("from stack 2 "+stack.pop(2));
		stack.display();
}
}
