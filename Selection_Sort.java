package Sorting;
import java.util.Scanner;
public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			int mini=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[mini])
					mini=j;
			}
			int tmp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=tmp;
		}
		System.out.println("After Sorting");
		for(int x:arr)
			System.out.print(x+" ");

	}

}
