package com.accenture.algorithim;

public class permutation {
	
	public void printseries(String str) {
		int i=-1,j=0;
		char[] arr = str.toCharArray();
		char[] newarr;
		while(i!=arr.length && j!=arr.length) {
			if(i+1>j && i>0) {
				j++;
				newarr = swap(i,j,arr);
				System.out.println(newarr.toString());
				arr= swap(i,j,newarr);
				System.out.println(arr.toString());
			}
			else if(i+1>j && i<0) {
				i++;
				newarr = swap(i,j,arr);
				System.out.println(newarr.toString());
				j++;
				arr= swap(i,j,newarr);
				System.out.println(arr.toString());
			}
			else if(i+1<j && i>0) {
				newarr = swap(i,j,arr);
				System.out.println(newarr.toString());
				j++;
				arr= swap(i,j,newarr);
				System.out.println(arr.toString());
				i++;	
			}
			
			
		}
	}
	public char[] swap(int i,int j,char[] arr) {
		
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}

}
