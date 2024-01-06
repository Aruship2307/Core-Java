package com.java8features.stream.operations;

import com.java8features.stream.operations.Student;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMethodsDemo {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankita", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. filter rank between 50 and 100
       List<Student> rankStudent =  studentList.stream()
                                           .filter(ranks->ranks.getRank()>50 && ranks.getRank()<100)
                                           .collect(Collectors.toList());

        //System.out.println(rankStudent);

        // 2.find the students who stay in karnataka and sort by their name
        List<Student> stGrp  =studentList.stream()
                .filter(city->city.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())) // Ascending order sort
                .toList();
               // .sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())) // Descending order sort


        // System.out.println(stGrp);
//  age is sorted as Int
        List<Student> stGrp2  =studentList.stream()
                .filter(city->city.getCity().equals("Karnataka"))
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toList());

       //  System.out.println(stGrp2);

        // 3. Fina all department names with natural sort
        // map=OneToOne-> map applies a function to each element and returns a new collection of the same structure.
          List<String> listDept =  studentList.stream()
                   .map(Student::getDept)
                  .distinct()
                  .sorted(Comparator.naturalOrder())
                  .collect(Collectors.toList());
       // System.out.println(listDept);

        // 2nd way to avoid duplicate is to use set ds
        Set<String> setDept = studentList.stream().map(Student::getDept)
        .collect(Collectors.toSet());

        // 4. find all the contactNo
        // flatMap = OneToMany = it applies a function to each element and flattens the results into a single collection.
        List<String> numList = studentList.stream()
                .flatMap(contacts->contacts.getContacts().stream())
                        .distinct()
                        .collect(Collectors.toList());

       // System.out.println(numList);

        // 5.Group the student by deptName, use Map<K,V> = groupingBy only it has key value ways to store
        Map<String,List<Student>> listDept2 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
       // System.out.println(listDept2);

        // Key= deptName by groupingBy & value = Long = Count
        Map<String,Long> deptCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
       // System.out.println(deptCount);  //{Mech Engg=4, EE=1}

        // 6.Find the department who is having maximum number of students
        // In above we have Map, Just we iterated map get the max Count as In one Dept
        Map.Entry<String,Long> depMaxCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
       // System.out.println(depMaxCount); //MechEngg=4

        // 7. Find the average age of male and female students
               Map<String,Double> ageAvgGrp = studentList.stream()
                                    .collect(Collectors.groupingBy(Student::getGender,
                                            Collectors.averagingInt(Student::getAge)));

       // System.out.println(ageAvgGrp);
        //Collectors.maxBy(Comparator.comparingInt(Student::getRank)))

        // 8. Find the highest rank in each department
             Map<String, Optional<Student>> maxRankDept = studentList.stream()
                     .collect(Collectors.groupingBy(Student::getDept,
                             Collectors.maxBy(Comparator.comparingInt(Student::getRank))));
        //System.out.println(maxRankDept);

        // 9. Find the student who has the second rank
                   Student secRankStudent = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1).findFirst().get();
        System.out.println(secRankStudent);




    }
}

