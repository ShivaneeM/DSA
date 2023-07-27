package SLLObj;

import java.util.Stack;

public class SLListOClass {

	private Node head;
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public SLListOClass() {
		this.head=null;
	}
	
	public boolean insert(Student s) {
		
		Node nn=new Node(s);
		Node temp=head;
		if(nn==null)
		{
			return false;
		}
		if(head==null) {
			this.head=nn;
			return true;
		}
		else {
		while(temp.getNext()!=null) {
				temp=temp.getNext();
				
		}
		temp.setNext(nn);
		}
		return true;
	
	}
	
	//insert at position
	public boolean insertAtPosition(Student s,int pos) {
		
		Node nn=new Node(s);
		Node temp=head;
		//invalid position
		if((head==null&&pos>1) || pos<=0) {
			return false;
		}
		
		//for first position
		if(pos==1) {
		
				nn.setNext(temp);
				head=nn;
				return true;
			}
	
		
		for(int i=1;i<pos-1;i++) {
			
			temp=temp.getNext();
			if(temp==null) {
				throw new RuntimeException("invalid pos");
			}
		}
		nn.setNext(temp.getNext());
		temp.setNext(nn);
	
		return true;
		
	}
	
	//delete by value
	public boolean deleteD(int rollNo) {
		
		Node temp=head;
		Node prev=head;
		
		if(head==null) {
			return false;
		}

		if(head.getS().getRollNo()==rollNo)
		{
			head=null;
			return true;
		}
		
		while(temp.getS().getRollNo()!=rollNo) {
			prev=temp;
			temp=temp.getNext();
			if(temp==null) {
				return false;
			}
		}
		prev.setNext(temp.getNext());
		return true;
		
	}
	
	
	//delete
	public boolean delete(int pos) {
		Node temp=head;
		if(pos<=0) {
			return false;
		}
		
		if(head==null) {
			return false;
		}
		
		if(pos==1) {
			head=temp.getNext();
			return true;
		}
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		
		return true;
		
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			
			System.out.println(temp.getS());
			temp=temp.getNext();
		}
	}
	
	
	//reverse
	public void reverse() {
		Stack<Node> s=new Stack<>();
		Node temp=head;
		while(temp!=null) {
			
			s.push(temp);
			temp=temp.getNext();
		
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop().getS());	
		}
	}
	
	//searching
	public void search(int rollNo) {
		Node temp=head;
		boolean flag=false;
		while(temp!=null) {
			//System.out.println(temp.getData());
			if(temp.getS().getRollNo()==rollNo) {
				flag=true;
				
				break;
			}
			temp=temp.getNext();
		}
		if(flag==true) {
			System.out.println("data found:"+temp.getS());
		}else
			System.out.println(" data not found");
		
	}
	
	 static class Node{
		private Student s;
		private Node next;
		
		public Node(){
			this.s=null;
			this.next=null;
		}
		
		public Node(Student s) {
			this.s=s;
			this.next=null;
		}

		public Student getS() {
			return s;
		}

		public void setS(Student s) {
			this.s = s;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [data=" + s+ ", next=" + next + "]";
		}
			
	}
	
}
	
