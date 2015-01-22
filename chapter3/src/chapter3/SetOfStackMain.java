package chapter3;

public class SetOfStackMain {

	public static void main(String[] args) {
		SetOfStacks set=new SetOfStacks(5);
		System.out.println("Is Empty? "+set.isEmpty());
		set.push(45);
		set.push(33);
		set.push(32);
		set.push(13);
		set.push(35);
		set.push(63);
		set.push(38);
		set.push(67);
		set.display();
		System.out.println();
		
		System.out.println(set.pop());
		System.out.println(set.pop());
		System.out.println(set.pop());
		set.display();
		System.out.println();

	}

}
