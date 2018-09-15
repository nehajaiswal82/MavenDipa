package com.accenture.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileTrial {
	
	public void readFromBufferedReader() {
		
		File file = new File("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFromFileReader() {
		
		try {
			FileReader file = new FileReader("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
			
			int i;
			while((i=file.read())!=-1) {
				
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void readFromScanner() {
		
		File file = new File("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
		
		try {
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void main(String args[]) {
		ReadFileTrial obj = new ReadFileTrial();
		obj.readFromBufferedReader();
		System.out.println();
		obj.readFromFileReader();
		System.out.println();
		obj.readFromScanner();
	}

}
