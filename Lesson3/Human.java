package progKievOop.Lesson3.Homework;

public class Human {
    private String firstName;
    private String lastName;
    private int age;


    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", age=" + age;
    }
}
