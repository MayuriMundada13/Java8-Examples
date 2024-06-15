package basic.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ListStudentWhoseNameStartWithA {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        //name starting with A
        List<Student> collect = list.stream().filter(student -> student.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println(collect);

        //Find the total count of student
        long count = list.stream().count();
        System.out.println("Total count of student = " + count);

        //max age of student
        //Optional<Student> max = list.stream().max(Comparator.comparing(Student::getAge));
        OptionalInt max = list.stream().mapToInt(Student::getAge).max();
        System.out.println("Max age of student = " + max);

        //find all department name
        List<String> collect1 = list.stream()
                .map(name -> name.getDepartmantName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All department list = " + collect1);

        //Find the count of student in each department
        Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println(collect2);

        //Find the list of students whose age is less than 30
        List<Student> collect3 = list.stream()
                                     .filter(age -> age.getAge() < 30)
                                     .collect(Collectors.toList());
        System.out.println("List of student whose age is less than 30 = " + collect3);

        //Find the list of students whose rank is in between 50 and 100
        List<Student> collect4 = list.stream()
                                     .filter(student -> student.getRank() > 50 && student.getRank() < 100)
                                     .collect(Collectors.toList());
        System.out.println("Student list whose rank is in between 50 and 100 = " + collect4);


    }
}
