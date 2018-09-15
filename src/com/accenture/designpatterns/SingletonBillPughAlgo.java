package com.accenture.designpatterns;

public class SingletonBillPughAlgo {
	
	private SingletonBillPughAlgo() {
		
	}
	
	private static class BillPughAlgo{
		private static final SingletonBillPughAlgo obj = new SingletonBillPughAlgo();
	}
	
	public SingletonBillPughAlgo getInstance() {
		
		return BillPughAlgo.obj;
	}

}
