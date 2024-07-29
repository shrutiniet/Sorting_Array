package Sorting;
import java.util.Scanner;
public class Insertion_sort_recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Insertion(arr,0,n);
		System.out.println("After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");

	}
public static void Insertion(int[]arr, int i, int n)
{
	if(i==n)
	{
		return;
	}
	int j=i;
	while(j>0 && arr[j-1]>arr[j])
	{
		int tmp=arr[j-1];
		arr[j-1]=arr[j];
		arr[j]=tmp;
		j--;
	}
	Insertion(arr,i+1,n);
}
}
