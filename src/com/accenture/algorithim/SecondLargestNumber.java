package com.accenture.algorithim;

public class SecondLargestNumber {

	public int getSecondLargestEmentofArray(int arr[]) {
		int max=0,secmax=0;
		
		if(arr[0]>arr[1]) {
			max=arr[0];
			secmax = arr[1];
		}
		else {
			max=arr[1];
			secmax=arr[0];
		}
		
		for(int i =2;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}else
				if(arr[i]<max && arr[i]>secmax) {
					secmax=arr[i];
				}
		}
		return secmax;
	}
	
	public static void main(String[] args) {
		
		SecondLargestNumber obj = new SecondLargestNumber();
		int[] arr={45,9,78,56,0,3,99,100,76,121,565};
		System.out.println(arr);
		int secmax = obj.getSecondLargestEmentofArray(arr);
		System.out.println(secmax);
		
	}
}
