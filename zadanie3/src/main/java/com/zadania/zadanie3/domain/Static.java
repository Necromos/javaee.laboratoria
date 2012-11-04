package com.zadania.zadanie3.domain;

public class Static {
	private String stat = "Ta wiadomość nigdy nie ulegnie zmianie.";
	
	public Static(){
		super();
	}

	public String getStat() {
		return stat;
	}
	
	public void statTrat() {
		this.stat = "Napewno?";
	}

	public void setStat(String stat) {
		this.stat = stat;
	}
	
}
