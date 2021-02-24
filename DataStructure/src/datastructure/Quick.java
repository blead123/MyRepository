package datastructure;
//!!파워 퀵 소트 !!
//작성일 2021.2.25
//히오스는 살아있당
public class Quick
{
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w)<0;
	}
	
	private static void exchange(Comparable[] a, int i ,int j)
	{
		Comparable temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void show(Comparable[] a)
	{
		for(int i =0 ;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void qucik_sort(Comparable[] a)
	{
		sort(a,0,a.length-1);
	}
	
	private static void sort(Comparable[] a ,int lo ,int hi)
	{
		//종료 조건
		if(hi<=lo)
			return;
		int piviot_pointer = partition(a,lo,hi);
		sort(a,lo,piviot_pointer-1);
		sort(a,piviot_pointer+1,hi);
	}
	
	private static int partition(Comparable[] a ,int lo ,int hi)
	{
		int i = lo;
		int j = hi+1;
		
		Comparable v=a[lo];
		
		while(true)
		{
			while(less(a[++i] , v))
				if(i==hi)
					break;
			while(less(v,a[--j]))
				if(j==lo)
					break;
			if(i>=j)
				break;
			exchange(a,i,j);
		}
		exchange(a,lo,j);
		return j;

	}
	
	public static void main(String[] agrs)
	{
		Integer [] a = {8,2,42,1};
		qucik_sort(a);
		show(a);
	}
}