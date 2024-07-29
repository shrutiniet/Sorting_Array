package Sorting;
import java.util.Scanner;
public class Bubble_sort_using_recurssion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Bubble(arr,n);
		System.out.println("After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");
	}
public static void Bubble(int[]arr, int n)
{
	if(n==1)
		return;
	for(int j=0;j<=n-2;j++)
	{
		if(arr[j]>arr[j+1])
		{
			int tmp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=tmp;
		}
	}
	Bubble(arr,n-1);
}
}
