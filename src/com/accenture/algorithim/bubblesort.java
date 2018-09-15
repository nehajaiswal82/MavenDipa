package com.accenture.algorithim;

public class bubblesort {
	
	public int[] sort(int element[]) {
		
		for(int i=0;i<element.length;i++) {
			for(int j=0;j<element.length-i-1;j++) {
				
				if(element[j]>element[j+1]) {
					int temp= element[j];
					element[j]=element[j+1];
					element[j+1]=temp;
				}
			}
		}
		
		return element;
		
	}
	
	public int[] newSort(int element[]) {
		
		for(int i=element.length-1;i>=0;i--) {
			for(int j=0;j<i-1;j++) {
				if(element[j]>element[j+1]) {
					int temp = element[j];
					element[j]=element[j+1];
					element[j+1]=temp;
				}
			}
		}
		
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
