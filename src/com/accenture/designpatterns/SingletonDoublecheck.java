package com.accenture.designpatterns;

public class SingletonDoublecheck {

	private static SingletonDoublecheck doublecheckobject = null;
	
	private SingletonDoublecheck() {
		
	}
	
	public static SingletonDoublecheck getInstance() {
		
		if(doublecheckobject == null) {
			synchronized(SingletonDoublecheck.class) {
				if(doublecheckobject == null) {
					doublecheckobject = new SingletonDoublecheck();
					
				}
			}
		}
		
		return doublecheckobject;
	}
}
