import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizeableStack<Item> implements Iterable<Item> {
	
	private Item[] a;
	private int n=0;
	private int cap=8;
	
	public ResizeableStack()
	{
		
	}
	
	public ResizeableStack(int cap)
	{
		a = (Item[]) new Object[cap];
	}
	
	public boolean isEmpty()
	{
		return n==0;
	}
	
	private int size()
	{
		return n;
	}
	
	private void resize(int max)
	{
		Item[] temp = (Item[]) new Object[max];
		for(int i=0 ;i<n;i++)
			temp[i]=a[i];
		a=temp;
		System.out.println("resizing");
	}
	
	public void push(Item item)
	{
		System.out.println("push"+item);
		if(n==a.length)
			resize(2*a.length);
		a[n++]=item;
	}
	
	public Item pop()
	{
		Item item = a[--n];
		a[n]=null;
		if(n>0 && n==a.length/4)
			resize(a.length/2);
		return item;
	}
	
	public Iterator<Item> iterator()
	{
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>
	{
		private int i = n;
		public boolean hasNext()
		{
			return i>0;
		}
		
		public Item next()
		{
			return a[--i];
		}
		
		public void remove()
		{
			
		}
	}
	
	
	
}
