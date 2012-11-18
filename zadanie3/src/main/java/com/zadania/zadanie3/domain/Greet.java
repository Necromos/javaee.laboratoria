package com.zadania.zadanie3.domain;

public class Greet {
	
	private String msg;
	private int i = 2;
	
	public Greet (){
		super();
	}
	
	public void changeMsg(){
		this.i++;
		if (i%2==0){
			this.msg = "Hello";
		}
		else if(i%3==0){
			this.msg = "Hi";
		}
		else if(i%5==0){
			this.msg = "Go away, you don't exist!";
		}
	}

	public String getMsg() {
		return msg;
	}

	public int getI() {
		return i;
	}
	
}
