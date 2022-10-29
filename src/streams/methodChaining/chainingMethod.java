package streams.methodChaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class chainingMethod {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        // 3 1 5 9 21 81 7
        // 1 1 5 3  7 27
        // 51

        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> {if( e % 3 == 0){ e = e / 3;} return e;})
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
        System.out.println("-----------------------------------------------------------------------------------------");










        Student st1 = new Student("Иван", 'М', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'М', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'Ж', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'М', 35, 4, 7);
        Student st5 = new Student("Мария", 'Ж', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        students.stream()
                .map(element -> {element.setName(element.getName().toUpperCase()); return element;})
                .filter(element -> element.getSex()=='Ж')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(element -> System.out.println(element));

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
