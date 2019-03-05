package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		List<Integer> box = new ArrayList<>();
		box.add(35);
		box.add(50);
		box.add(85);
		box.add(50);
		System.out.println(box);
		//list有index值
		for (int i=0;i<box.size(); i++) {
			System.out.println(box.get(i));
		}
		System.out.println();
		for (int number:box) {
			System.out.println(number);
		}
		
		Set<Integer> a = new HashSet<>();
		a.add(100);
		a.add(88);
		a.add(95);
		a.add(43);
		a.add(87);
		a.add(100);
		System.out.println(a);
		//set會隨便跳 沒有index值
		for (int element:a) {
			System.out.println(element);
		}
	}
}
