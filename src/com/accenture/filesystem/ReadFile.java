package com.accenture.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public void readFileBufferedReader() {
		File file = new File("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
	
		try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String str;
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
				br.close();
				
			}
		catch(FileNotFoundException e){
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFileReader() {
		
		int i;
		try {
				FileReader file = new FileReader("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
				while((i=file.read()) != -1) {
					System.out.print((char)i);	
			}
				
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFileScanner(){
		
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
	
public void readFileNoLoop(){
		
		File file = new File("C:\\Users\\n.a.jaiswal\\Downloads\\Task.txt");
		
		try {
				Scanner sc = new Scanner(file);
				sc.useDelimiter("\\Z");
				System.out.println(sc.next());
				sc.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void main(String args[]) {
		ReadFile obj = new ReadFile();
		obj.readFileBufferedReader();
		System.out.println();
		obj.readFileReader();
		System.out.println();
		obj.readFileScanner();
		System.out.println();
		obj.readFileNoLoop();
	}

}
