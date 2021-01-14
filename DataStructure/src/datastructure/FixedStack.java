package datastructure;

public class FixedStack<Item> {

	private int top;
	public  Item[] array;

	public FixedStack(int cap) {
		array = (Item[]) new Object[cap];
		top = -1;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == array.length;
	}

	public void push(Item x) {
		array[top+1] = x;
		top++;
	}

	public Item pop() {
		return array[--top];
	}

	public static void main(String args[]) {
		FixedStack fstack = new FixedStack(10);

		for (int i = 0; i < 10; i++) {
			fstack.push(i);
			System.out.println(i + "���� ���ԵǾ����ϴ�");
		}

		System.out.println("�����Ѱ�"+fstack.pop());
		System.out.println("�����Ѱ�"+fstack.pop());
		
	}
}
