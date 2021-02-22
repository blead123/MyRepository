package datastructure;
//연결리스트 스택
//작성일자 2021.2.22 
public class LinkedList<Item>{
	
	private class Node{
		Item item;
		Node next;
	}
	
	private Node firstNode;//첫번째 노드
	private int n;// 링크드 리스트의 갯수
	
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
		Node oldFirst = firstNode;//백업
		firstNode = new Node();//새노드 생성
		firstNode.item=item;
		firstNode.next = oldFirst; //연결시키기
		n++;//갯수증가
	}
	
	public Item pop()
	{
		Item item = firstNode.item;//값 복사
		firstNode=firstNode.next;//처음노드가 다음값을 가리킴--> 처음노드는 고아가 되서 사라짐 ㅠㅠ
		n--;//갯수 감소
		return item;//값 반환
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
