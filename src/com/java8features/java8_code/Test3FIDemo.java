package com.java8features;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentInfo{
	String name;
	int marks;
	public StudentInfo(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
public class Test3FIDemo {

    public static void main(String[] args) {
        ArrayList<StudentInfo> al = new ArrayList<>();
        populate(al);

        Predicate<StudentInfo> p = s -> s.marks >= 90;

        Function<StudentInfo, String> f = s -> {
            int marks = s.marks;
            if (marks > 90) {
                return "A [Distinction]";
            } else if (marks > 80) {
                return "B [First Class]";
            } else if (marks > 60) {
                return "C [Second Class]";
            } else {
                return "D [Pass]";
            }
        };

        Consumer<StudentInfo> c = s -> {
            System.out.println("Student Name: " + s.name);
            System.out.println("Student's Marks: " + s.marks);
            System.out.println("Student's Grade: " + f.apply(s));
        };

        for (StudentInfo student : al) {
            if (p.test(student)) {
                c.accept(student);
                System.out.println(); // Print an empty line for better readability
            }
        }
    }

    private static void populate(ArrayList<StudentInfo> al) {
        al.add(new StudentInfo("Aish", 85));
        al.add(new StudentInfo("Ben", 91));
        al.add(new StudentInfo("Avi", 95));
        al.add(new StudentInfo("Radha", 82));
        al.add(new StudentInfo("Mayu", 48));
        al.add(new StudentInfo("Mayu", 36));
        al.add(new StudentInfo("Mayu", 72));
        al.add(new StudentInfo("Mayu", 68));
    }
}
