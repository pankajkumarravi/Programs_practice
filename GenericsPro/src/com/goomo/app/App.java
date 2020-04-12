package com.goomo.app;

import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printlistdata(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}

	public <E> void printArrayData(E[] array) {
		for (E e : array) {
			System.out.println(e);
		}
	}
}

public class App {
	public static void main(String[] args) {
		/*
		 * List<Integer> lst = new ArrayList<Integer>(); lst.add(1); lst.add(3);
		 * lst.add(2); lst.add(5); lst.add(7); Data data = new Data();
		 * data.printlistdata(lst);
		 * 
		 * List<String> strlst = new ArrayList<String>(); strlst.add("one");
		 * strlst.add("two"); strlst.add("three"); strlst.add("Five");
		 * data.printlistdata(strlst);
		 */
		String []  StrArray= {"One","two", "three","four","five"};
		Integer[] intArray= {1,2,3,4,5,6,7,8,9};
		Data data=new Data();
		data.printArrayData(StrArray);
		
		data.printArrayData(intArray);
	}
}
