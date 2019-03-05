package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		List<String> shootingmachine = new ArrayList<>();
		shootingmachine.add("三分球");
		shootingmachine.add("兩分球");
		shootingmachine.add("三分球");
		shootingmachine.add("三分球");
		shootingmachine.add("兩分球");
		System.out.println(shootingmachine);
		//投籃機報分數
		
		Set<String> book = new HashSet<>();
		book.add("Jack Chen, 11:00, 4位");
		book.add("David Huang, 12:00, 5位");
		book.add("Shelly Lin, 11:30, 8位");
		book.add("Jack Chen, 11:00, 4位");
		book.add("Jack Lin, 13:00, 4位");
		System.out.println(book);
		//上網登記訂位,重複訂位擇一

	}

}
