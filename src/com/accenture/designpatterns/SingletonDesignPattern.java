package com.accenture.designpatterns;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern singletonobject= null;

	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getInstance() {
		if(singletonobject == null)
			singletonobject = new SingletonDesignPattern();
		
		return singletonobject;
	}
	
	
}
