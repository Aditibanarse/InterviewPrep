
public class DoubleEndedListApp {
	
	public static void main(String[] args) {
		DoubleEndedList delist=new DoubleEndedList();
		System.out.println(delist.isEmpty());
		delist.insertFirst(67);
		delist.insertFirst(57);
		delist.display();
		delist.deleteFirst();
		System.out.println(delist.isEmpty());
		delist.display();
		delist.insertLast(77);
		delist.insertLast(27);
		delist.display();
	}

}
