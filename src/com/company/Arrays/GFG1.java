package com.company.Arrays;

// Java implementation of the approach
class GFG1 {

	// Function to return the maximum
	// absolute difference between
	// any two elements of the array
	static int[] maxAbsDiff(int arr[], int n)
	{

		// To store the minimum and the maximum
		// elements from the array
		int res[]= new int[2];
		int minEle = arr[0];
		int maxEle = arr[0];
		for (int i = 1; i < n; i++) {
			minEle = Math.min(minEle, arr[i]);
			maxEle = Math.max(maxEle, arr[i]);
		}
		res[0]=minEle;
		res[1]=maxEle;

		return res;
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] arr = { -10, 4, -9, -5};
		int n = arr.length;
		int[] a=(maxAbsDiff(arr, n));
		for (int i:a
			 ) {
			System.out.println(i);

		}
	}
}
