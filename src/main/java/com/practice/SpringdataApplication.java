package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@SpringBootApplication
public class SpringdataApplication {

	public static void main(String[] args) {

		Developer o1 = new Developer();
		o1.setName("mkyong");
		o1.addBook("Java 8 in Action");
		o1.addBook("Spring Boot in Action");
		o1.addBook("Effective Java (3nd Edition)");

		Developer o2 = new Developer();
		o2.setName("zilap");
		o2.addBook("Learning Python, 5th Edition");
		o2.addBook("Effective Java (3nd Edition)");

		List<Developer> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);

		Set<String> collect =
				list.stream()
						.map(x -> x.getBook()).map()                           //  Stream<Set<String>>
						                   //  Stream<String>

		.filter(x -> !x.toLowerCase().contains("python"))   //  filter python book
						.collect(Collectors.toSet());


		collect.forEach(System.out::println);
	}
}
