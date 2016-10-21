package com.java.programming.knowledge;

import java.util.ArrayList;
import java.util.ListIterator;
//import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
ArrayList<String> names = new ArrayList<String> ();

names.add("mark");
names.add("tom");
names.add("kim");
names.add("greg");
names.add("jim");
/*
ListIterator<String> itr = names.listIterator();
while(itr.hasNext())
System.out.println(itr.next());
System.out.println();*/
	


ListIterator<String> itr = names.listIterator();

while(itr.hasNext())
	System.out.println(itr.next());
while(itr.hasPrevious())
	System.out.println(itr.previous());	
	}

		
}
