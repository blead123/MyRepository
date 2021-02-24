package datastructure;

public class Swap {
	public static void change(int i ,int j)
	{
		int temp =i;
		i=j;
		j=temp;
	}

	public static void main(String[] agrs)
	{
		int a=10;
		int b=20;
		change(a,b);
		
		System.out.println(a);
		System.out.println(b);
	}
}
