package chapter3;

public class SortStackApp {

   public static void main(String[] args) 
   {
	   StackImpl stack=new StackImpl();
	   System.out.println("Pushing the elements to the stack");
	   stack.push(76);
	   stack.push(5);
	   stack.push(7);
	   stack.push(33);
	   stack.push(98);
	   stack.push(2);
	   stack.display();
	   SortStack sorted=new SortStack(stack);
	   stack=sorted.sort();
	   stack.display();
	
  }

}
