package SLLObj;

import java.util.Scanner;

public class SLListOMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SLListOClass sll=new SLListOClass();
	int ch;
	
	do
	{
		
		System.out.println("enter 0 for exit, 1 for insert, 2 for display, 3 for insert at position, 4 for delete, 5 for delete by value, 6 for reverse, 7 for search");
		switch(ch=sc.nextInt()) {

		case 1:
		{
			System.out.println("enter student's roll no,name ,fees");
			Student s=new Student(sc.nextInt(),sc.next(),sc.nextDouble());
			
			sll.insert(s);
		}
		break;
		case 2:
		{
			sll.display();
		}
		break;
		case 3:
		{
			System.out.println("enter data and position");
			Student s=new Student(sc.nextInt(),sc.next(),sc.nextDouble());
			sll.insertAtPosition(s,sc.nextInt());
		}
		break;
		case 4:
		{
			System.out.println("enter position to delete");
			sll.delete(sc.nextInt());
		}
		break;
		case 5:
		{
			System.out.println("enter roll no to delete");
			sll.deleteD(sc.nextInt());
		}
		break;
		case 6:
		{
			System.out.println("reverse");
            sll.reverse();
		}
		break;
		case 7:
		{
			System.out.println("enter no to be searched");
            sll.search(sc.nextInt());
		}
		break;
		}
	}while(ch!=0);
		
		
	}

}
