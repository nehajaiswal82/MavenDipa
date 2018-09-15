package com.accenture.algorithim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountAlphabate {
	
	public String printSeries(String S) {
		String newS="";
		int flag=0,k=0,ctr=0;
		char[] c = new char[S.length()];
		c[0]=S.charAt(0);
		for(int i=0;i<S.length();i++) {
			flag=0;
			k=0;
			while(c[k]!='\0') {
				
				if(c[k] == S.charAt(i)) {
					flag=1;
					break;
				}
				k++;
			}
			
			if(flag==0) {
				c[k]=S.charAt(i);
			}
		}
		k=0;
		
		while(c[k]!='\0') {
			ctr=0;
			for(int i=0;i<S.length();i++) {
				if(c[k]==S.charAt(i))
					ctr++;
			}
			newS= newS+c[k]+ctr;
			k++;
		}
		return newS;
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		CountAlphabate obj = new CountAlphabate();
		String output = obj.printSeries(S);
		System.out.println(output);
		
		
	}

}
