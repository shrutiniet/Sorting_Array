package Sorting;

import java.util.*;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int low=0;
		int high=n-1;
		MergeSort(arr,low,high);	
		System.out.println("After Sorting");
		for(int x:arr)
			System.out.print(x+" ");

	}
	public static void MergeSort(int[]arr, int low, int high)
	{
		if(low>=high)
			return;
		int mid=(low+high)/2;
		MergeSort(arr, low, mid);
		MergeSort(arr,mid+1, high);
		Merge(arr,low,mid,high);
		
	}
	public static void Merge(int[]arr, int low, int mid, int high)
	{
		ArrayList<Integer> AL=new ArrayList<>();
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high)
		{
			if(arr[left]<arr[right])
			{
				AL.add(arr[left]);
				left++;
			}
			else
			{
				AL.add(arr[right]);
				right++;
			}
		}
		while(left<=mid)
		{
			AL.add(arr[left]);
			left++;
		}
		while(right<=high)
		{
			AL.add(arr[right]);
			right++;
		}
		for(int i=low;i<=high;i++)
		{
			arr[i]=AL.get(i-low);
		}
		
	}

}
