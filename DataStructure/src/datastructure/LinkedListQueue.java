package datastructure;

public class LinkedListQueue<Item> 
{
	Node first;
	Node last;
	int n;
	private class Node{
		Item item;
	    Node next;
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public int size()
	{
		return n;
	}
	
	public void enqueue(Item item)
	{
		Node oldLast = last;
		last = new Node();
		last.item=item;
		last.next=null;
		if(isEmpty())
			first=last;
		else
			oldLast.next=last;
		n++;
	}
	
	public Item dequeue()
	{
		Item item = first.item;
		first.next=first;
		n--;
		if(isEmpty())
			last.next=null;
		return item;
	}
	
//	public Iterator<Item> iterator()
//	{
//		return new ListIterator();
//	}
//	
//	private class ListIterator implements Iterator(Item)
//	{
//		private Node current =first;
//		
//		public boolean hasNext()
//		{
//			return current!=null;
//		}
//		
//		public void remove()
//		{
//			
//		}
//		
//		public Item next()
//		{
//			Item item = current.item;
//			current = current.next;
//			return item;
//					
//		}
//		
//	}
	public static void main(String agrs[])
	{
		LinkedListQueue q = new LinkedListQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
        System.out.println(q.size());
		
	}
}
