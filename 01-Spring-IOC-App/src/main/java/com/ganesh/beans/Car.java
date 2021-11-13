package com.ganesh.beans;

public class Car {
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int engStatus = eng.start();
		if(engStatus == 1) {
			System.out.println("Engine started");		
		}else {
			System.out.println("Engine not started");
		}
	}

}
