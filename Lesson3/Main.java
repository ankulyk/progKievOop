package progKievOop.Lesson3.Homework;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", "Ivanov", 20);
        Student student2 = new Student("Vasya", "Petrov", 2);
        Student student3 = new Student("Vasya", "Sidorov", 2);
        Student student4 = new Student("Vasya", "Orlov", 2);
        Student student5 = new Student("Vasya", "Potapov", 2);
        Student student6 = new Student("Vasya", "Naumov", 2);
        Student student7 = new Student("Vasya", "Somov", 2);

        Group group1 = new Group();

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);

        System.out.println(group1.toString());

        Student student8 = new Student("Vasya", "Fomin", 2);
        Student student9 = new Student("Vasya", "Popov", 2);
        Student student10 = new Student("Vasya", "Andreev", 2);
        Student student11 = new Student("Vasya", "Smirnov", 2);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);
        group1.addStudent(student11);

        System.out.println(group1.toString());
        group1.sortGroup();
        System.out.println(group1.toString());

        group1.deleteStudent("Petrov");
        group1.deleteStudent("Sidorov");

        System.out.println(group1.toString());
        group1.sortGroup();
        System.out.println(group1.toString());


    }
}
