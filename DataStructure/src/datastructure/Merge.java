package datastructure;
//병합정렬(merge sort)
//작성일 : 2021.2.22
//수정일 : 2021.2.24
public class Merge 
{
	public static void divide_and_merge(int [] arr , int lo , int hi)
	{
		if(lo<hi)
		{
			
		   int mid =(lo+hi)/2;//기준!
		
		   divide_and_merge(arr,lo,mid);//왼쪽 배열을 쪼갬
		   divide_and_merge(arr,mid+1,hi);//오른쪽 배열을 쪼갬
		
		   merge(arr,lo,mid,hi);//합치자 
		}
	}
	
	public static void merge(int[] arr , int lo ,int mid, int hi)
	{
		
		int i = lo;//왼쪽 배열의 포인터
		int j = mid+1;//오른쪽 배열의 포인터
		int temp_pointer=lo;//임시 배열의 포인터
		int [] temp_array =new int[arr.length];
		
		while(i<=mid && j<=hi)
		{
			if(arr[i]<arr[j])
				temp_array[temp_pointer++]=arr[i++];
			else
				temp_array[temp_pointer++]=arr[j++];
		}
		
		while(i<=mid)
		{
			temp_array[temp_pointer++]=arr[i++];
		}
		
		while(j<=hi)
		{
			temp_array[temp_pointer++]=arr[j++];
		}
		
		
		
		for(int pointer=lo ; pointer<temp_pointer; pointer++)
		{
			arr[pointer]=temp_array[pointer];
		}
		
		
		
	}
	
	public static void print(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] agrs)
	{
		int [] a = {5,32,2,1,0};
		divide_and_merge(a,0,a.length-1);
		print(a);
	}
}
