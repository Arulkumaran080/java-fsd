package subsequence;

import java.util.Scanner;

public class Longsubsequence {
	static int longestsubsequence(int[] arr,int length){
		int max=0,i,j,count=0;
		int[] x=new int[length];
		for(i=0;i<length;i++){
			max=0;
			count=0;
			for(j=i;j<length;j++){
				if(arr[j]>max){
					count++;
					max=arr[j];
				}
			}
			x[i]=count;
		}
		max=0;
		for(i=0;i<length;i++){
			if(max<x[i]){
				max=x[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr=new int[100];
		System.out.println("Enter the number of elements: ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The length of the longest increasing subsequence is "+longestsubsequence(arr,n));
	}

}
