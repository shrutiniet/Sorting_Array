package Sorting;

import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Quick(arr,0,n-1);
		System.out.println("After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");

	}
	public static void Quick(int[]arr, int low, int high)
	{
		if(low<high)
		{
			int part=Partition(arr,low,high);
			Quick(arr,low, part-1);
			Quick(arr,part+1,high);
		}
		else
			return;
	}
	public static int Partition(int[]arr, int low, int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while(arr[i]<=pivot && i<=high-1)
				i++;
			while(arr[j]>pivot && j>=low+1)
				j--;
			if(i<j)
			{
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		int tmp=arr[j];
		arr[j]=arr[low];
		arr[low]=tmp;
		return j;
	}

}
