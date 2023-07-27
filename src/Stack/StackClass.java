package stack;

public class StackClass<T> {

	private T[] arr;
	private int top;
	private int size;

	@SuppressWarnings("unchecked")
	public StackClass(int size) {

		this.top = -1;
		this.size = size;
		arr = (T[]) new Object[size];

	}

	public boolean isFull() {
		return top == (size - 1);

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean push(T data) {
		if (isFull()) {
			return false;
		} else {
			arr[++top] = data;
		}
		return true;

	}

	public T pop() {
		if (isEmpty()) {
			return null;
		}

		return arr[top--];

	}

	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return arr[top];

	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i].toString());

		}
	}

	public void displayRev() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i].toString());

		}
	}

}
