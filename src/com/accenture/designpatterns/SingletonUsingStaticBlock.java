package com.accenture.designpatterns;

public class SingletonUsingStaticBlock {
	
	public static SingletonUsingStaticBlock staticblockobject;
	
	private SingletonUsingStaticBlock() {
		
	}
	
	static
	{
		staticblockobject = new SingletonUsingStaticBlock();
	}

}
