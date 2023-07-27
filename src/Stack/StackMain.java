package stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of stack");
		int size = sc.nextInt();
		StackClass<Student> stack = new StackClass<>(size);

		int ch;
		do {
			System.out.println("enter your choice \n 0:exit,1:push,2:pop,3:peek,4:display all,5:reverse display");
			switch (ch = sc.nextInt()) {
			case 1: {
				System.out.println("enter student's roll no,name and fees");
				Student s = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
				stack.push(s);
			}
				break;
			case 2: {
				System.out.println(stack.pop());
			}
				break;
			case 3: {
				System.out.println(stack.peek());
			}
				break;
			case 4: {
				stack.display();
			}
				break;
			case 5: {
				stack.displayRev();
			}
				break;

			}
		} while (ch != 0);

	}

}
