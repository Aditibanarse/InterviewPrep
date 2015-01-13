
public class LinkedListApp {
	public static void main(String[] args) {
		Node start=null;
		SinglySortedLinkedList link=new SinglySortedLinkedList(start);
		System.out.println("Linked List empty? "+link.isEmpty());
		link.insert(99);
		link.insert(44);
		link.insert(32);
		link.insert(91);
		link.insert(12);
		link.insert(87);
		System.out.println(link.isEmpty());
		link.display();
		System.out.println("Deleting element 20");
		link.delete(20);
		link.display();
		System.out.println("deleting element 44");
		link.delete(44);
		link.display();
	

		link.display();
		link.reverseList();
		link.display();
		
	}
	

}
