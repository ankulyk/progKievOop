package progKievOop.Lesson1.Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vaska", "black", 3.5, 2, true);
        Cat cat2 = new Cat("Murka", "brown", 1.5, 1, false);

        System.out.println(cat1.toString());
        System.out.print("When " + cat1.getName() + " want eat he say: ");
        cat1.meow();
        System.out.print ("When " + cat1.getName() + " want sleep - ");
        cat1.sleep();
        System.out.print("When " + cat1.getName() + " want play - ");
        cat1.play();
        System.out.println();

        System.out.println(cat2.toString());
        System.out.print("When " + cat2.getName() + " want eat he say: ");
        cat2.meow();
        System.out.print ("When " + cat2.getName() + " want sleep - ");
        cat2.sleep();
        System.out.print("When " + cat2.getName() + " want play - ");
        cat2.play();

    }
}
