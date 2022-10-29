package streams.mapToInt;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntL {
    public static void main(String[] args) {
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

        //int
        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);
        System.out.println("-----------------------------------------------------------------");

        //double
        List<Double> courses2 = students.stream()
                .mapToDouble(el -> el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses2);
        System.out.println("-----------------------------------------------------------------");

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        double avg = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(avg);

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);
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
