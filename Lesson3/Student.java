package progKievOop.Lesson3.Homework;

public class Student extends Human {

    private String group;
    private int studentNumber;

    public Student(String firstName, String lastName, int age, String group, int studentNumber) {
        super(firstName, lastName, age);
        this.group = group;
        this.studentNumber = studentNumber;
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Student() {
    }

    public String getGroup() {
        return group;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return
                "group='" + group + '\'' +
                        ", studentNumber=" + studentNumber +
                        ", " + super.toString();
    }
}
