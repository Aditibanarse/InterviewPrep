
public class LinkedListApp {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		System.out.println("List empty? "+list.isEmpty());
		list.insertFirst(33);
		list.insertFirst(344);
		list.insertFirst(367);
		list.insertFirst(339);
		list.displayFirst();
		System.out.println();
		list.displayLast();
		System.out.println();
		list.insertLast(76);
		list.insertLast(55);
		list.displayFirst();
		list.deleteLast();
		list.deleteFirst();
		list.deleteLast();
		list.displayFirst();

	}

}
