package com.zadania.zadanie3.domain;

public class Counter {
	private int counter=0;
	
	public Counter(){
		super();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void incCounter() {
		this.counter += 1;
	}
	
	public void decCounter() {
		this.counter -= 1;
	}
}
