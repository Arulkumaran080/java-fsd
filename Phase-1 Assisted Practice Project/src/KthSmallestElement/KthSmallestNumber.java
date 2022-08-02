package KthSmallestElement;

import java.util.Arrays;

public class KthSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,6,25,85,36,8,55,64,54};
		int k=4;
		Arrays.sort(arr);
		System.out.println("Kth Smallest number is "+arr[k-1]);
	}

}
