package com.faizan;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JustForCode {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		Product p1=new Product("byke", 9, "B0101", "noida", new Date(10-05-2020),"bhfc nbxfhz");
		Product p2=new Product("car", 19, "B0105", "Gurgaon", new Date(11-05-2020),"bhfc nbxfhz");
		Product p3=new Product("byke", 9, "B0101", "aligarh", new Date(12-05-2020),"bhfc nbxfhz");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Collections.sort(list);
		Set<Product> nonDuplicateProduct=new HashSet<>(list);
		System.out.println(nonDuplicateProduct);
	}
}