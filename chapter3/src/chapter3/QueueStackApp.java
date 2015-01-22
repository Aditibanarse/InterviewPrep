package chapter3;

public class QueueStackApp {

	public static void main(String[] args) {
		QueueStack queue=new QueueStack();
		queue.push(65);
		queue.push(76);
		queue.push(43);
		queue.push(11);
		queue.push(12);
		queue.push(54);
		queue.push(64);
		queue.push(35);
		queue.display();
		
		queue.pop();
		queue.display();
		
		queue.push(65);
		queue.push(76);
		queue.push(43);
		queue.display();
		
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.display();
		
	}

}
