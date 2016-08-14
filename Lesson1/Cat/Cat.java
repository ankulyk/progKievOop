package progKievOop.Lesson1.Cat;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String color;
    private boolean haveOwner;

    public Cat(String name, String color, double weight, int age, boolean haveOwner) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.haveOwner = haveOwner;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaveOwner() {
        return haveOwner;
    }

    public void setHaveOwner(boolean haveOwner) {
        this.haveOwner = haveOwner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", haveOwner=" + haveOwner +
                '}';
    }

    public void meow() {
        System.out.println("Meow meow.");

    }

    public void sleep() {
        if (haveOwner) {
            System.out.println(name + " sleeping on the couch.");
        } else {
            System.out.println(name + " sleeping on the street.");
        }
    }
    public void play(){
        if (haveOwner) {
            System.out.println(name + " playing with toys.");
        } else {
            System.out.println(name + " playing with branches and debris.");
        }
    }


}
