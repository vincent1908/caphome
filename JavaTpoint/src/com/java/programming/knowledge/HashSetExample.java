package com.java.programming.knowledge;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();

		h.add("mark");
		h.add("mark");
		h.add("mark");
		h.add("mark");
		h.add("mark");
		h.add("mark");
		h.add("tom");
		Iterator<String> itr = h.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
