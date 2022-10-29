package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 13);
        Schoolar schoolar2 = new Schoolar("Мария", 15);


        Student student1 = new Student("Николай", 20);
        Student student2 = new Student("Ксения", 18);

        Employee employee1 = new Employee("Заур", 32);
        Employee employee2 = new Employee("Михайло", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Драконы");
        Team<Student> studentTeam = new Team<>("Крымский мост");
        Team<Employee> employeeTeam = new Team<>("Назад");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> anotherTeam = new Team<>("Фантазия");
//        anotherTeam.addNewParticipant("Привет");

        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        Schoolar schoolar3 = new Schoolar("Дёма", 14);
        Schoolar schoolar4 = new Schoolar("Мирий", 12);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
//        schoolarTeam.playWith(employeeTeam);
    }
}
