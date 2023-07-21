package sll;

public class SLLclass {
	private Node head;

	public SLLclass() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

//insertion
	public boolean insert(int data) {
		Node nn = new Node(data);
		Node temp = head;

		if (nn == null)
			return false;

		if (head == null) {
			head = nn;
			return true;
		}

		// insert at end
		while (temp.getnext() != null) {
			temp = temp.getnext();
		}
		temp.setnext(nn);

		return true;

	}

//insert at position
	public boolean insertAtPos(int data, int pos) {
		// initialize node
		Node nn = new Node(data);
		Node temp = head;
		if (pos < 1 || (pos == 1 && head == null)) {
			return false;
		}
		if (pos == 1) {
			nn.setnext(head);
			head = nn;
			return true;
		}

		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getnext();

		}
		nn.setnext(prev.getnext());
		prev.setnext(nn);

		return true;

	}

//display
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getnext();

		}

	}

//search
	public boolean search(int data) {
		Node temp = head;
		boolean flag = true;
		while (temp != null) {

			if (temp.getData() == data) {
				System.out.println("found data:" + temp.getData());
				flag = true;
				break;
			} else {
				flag = false;
			}
			temp = temp.getnext();
		}

		if (flag == false) {
			System.out.println("data not found");
		}
		return true;
	}

}
