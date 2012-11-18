package com.zadania.zadanie2.domain;

public class Person {
	
	private String nick = "unknown";
	private String pssw = "";
	
	public Person() {
		super();
	}
	
	public Person(String nick, String pssw) {
		super();
		this.nick = nick;
		this.pssw = pssw;
	}
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPssw() {
		return pssw;
	}

	public void setPssw(String pssw) {
		this.pssw = pssw;
	}
	
}