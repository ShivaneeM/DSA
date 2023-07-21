package sll;

public class tester {

	public static void main(String[] args) {
		SLLclass ll = new SLLclass();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.display();
		ll.search(30);
		ll.search(60);
		
		System.out.println("after inserting at pos");
		ll.insertAtPos(80, 1);
		ll.insertAtPos(70, 4);
		ll.insertAtPos(90, 8);
		ll.display();

	}

}
