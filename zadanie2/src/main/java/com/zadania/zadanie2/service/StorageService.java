package com.zadania.zadanie2.service;

import java.util.ArrayList;
import java.util.List;

import com.zadania.zadanie2.domain.Person;

public class StorageService {
	
	private List<Person> db = new ArrayList<Person>();

	public void add(Person person){
		Person newPerson = new Person();
		db.add(newPerson);
	}
	
	public List<Person> getAllPersons(){
		return db;
	}
	
}
