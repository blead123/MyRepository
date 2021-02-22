package datastructure;
//���Ḯ��Ʈ ����
//�ۼ����� 2021.2.22 
public class LinkedList<Item>{
	
	private class Node{
		Item item;
		Node next;
	}
	
	private Node firstNode;//ù��° ���
	private int n;// ��ũ�� ����Ʈ�� ����
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	public int size()
	{
		return n;
	}
	
	public void push(Item item)
	{
		Node oldFirst = firstNode;//���
		firstNode = new Node();//����� ����
		firstNode.item=item;
		firstNode.next = oldFirst; //�����Ű��
		n++;//��������
	}
	
	public Item pop()
	{
		Item item = firstNode.item;//�� ����
		firstNode=firstNode.next;//ó����尡 �������� ����Ŵ--> ó������ ��ư� �Ǽ� ����� �Ф�
		n--;//���� ����
		return item;//�� ��ȯ
	}
	
	public void Iterate()
	{
		for (Node x=firstNode ; x!=null; x=x.next)
			System.out.println(x.item);
	}
	
	
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.Iterate();
	}
	
}
