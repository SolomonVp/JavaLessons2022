package collection.Map.TreeMap;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirmov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 4);
        Student st7 = new Student("Elena", "Sidorova", 3);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);

//        Student st8 = new Student("Elena", "Sidorova", 3);
//        System.out.println(treeMap.toString());
//        System.out.println(treeMap.containsKey(st8));

//        System.out.println(treeMap.get(6.4));

//        treeMap.remove(5.8);
//        System.out.println(treeMap.toString());

//        System.out.println(treeMap.descendingMap().toString());

//        System.out.println(treeMap.tailMap(7.3));

//        System.out.println(treeMap.headMap(7.3));

//        System.out.println(treeMap.lastEntry());

//        System.out.println(treeMap.firstEntry());


    }
}

final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final int course;
    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}' + "\n";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
}
