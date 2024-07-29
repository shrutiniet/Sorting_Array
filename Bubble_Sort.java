package Sorting;
import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Sorting1(arr,n);    //Complexity:  O(n*n)
		Sorting2(arr,n);     // Complexity: Best case= O(n), worst case: O(n*n)
		

	}
	public static void Sorting1(int[]arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println("After Sorting= ");
		for(int x:arr)
			System.out.print(x+" ");
	}
public static void Sorting2(int[]arr, int n)
{
	int did_swap=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				did_swap=1;
			}
		}
		if(did_swap==0)
			break;
	}
	System.out.println("After Sorting= ");
	for(int x:arr)
		System.out.print(x+" ");	
}
}
