package com.accenture.designpatterns;

public class SingletonThreadsafe {
	
	private static SingletonThreadsafe threadsafeobject = null;
	
	private SingletonThreadsafe() {
		
	}
	
	public synchronized static SingletonThreadsafe getInstance() {
		
		if(threadsafeobject == null)
			threadsafeobject = new SingletonThreadsafe();
		
		return threadsafeobject;
	}

}
