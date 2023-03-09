package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Albert", 17, "Java", 8));
		list.add(new Student("Marta", 26, "Java", 9));
		list.add(new Student("Ricard", 31, "Data Science", 4));
		list.add(new Student("Elena", 20, "JavaScript", 6));
		list.add(new Student("Toni", 32, "PHP", 8));
		list.add(new Student("Ana", 16, "Java", 8));
		list.add(new Student("Javier", 37, "Node", 4));
		list.add(new Student("Lucas", 31, "Java", 8));
		list.add(new Student("Patricia", 19, "PHP", 8));
		list.add(new Student("Diana", 33, "Data Science", 8));

		
		// print the name and age of each student
		list.forEach( s -> System.out.println(s.getName() + ", " + s.getAge()) );
		System.out.println();
		
		// print the names that starts with "a"
		List<Student> list2 = list.stream().filter( s -> s.getName().toLowerCase().startsWith("a") )					
				.collect(Collectors.toList());
		list2.forEach(s -> System.out.println(s.getName() + ", " + s.getAge()));
		System.out.println();
		
		// filter students with a grade higher than 5
		list.stream().filter( s -> s.getGrade() > 5 ).forEach(System.out::println);
		System.out.println();
		
		// filter students with a grade higher than 5 and are not coursing PHP
		list.stream().filter( s -> s.getCourse() != "PHP" && s.getGrade() > 5 )
				.forEach(System.out::println);
		System.out.println();
		
		// filter students of legal age who are coursing JAVA
		list.stream().filter( s -> s.getCourse() == "Java" && s.getAge() > 17 )
				.forEach(System.out::println);
		
	}

}
