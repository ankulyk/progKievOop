package progKievOop.Lesson1.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 5, 4);
        double area1;
        area1 = triangle1.area();
        System.out.println(triangle1.toString());
        System.out.println("area1 = " + area1);

        Triangle triangle2 = new Triangle(6, 5, 4);
        double area2;
        area2 = triangle2.area();
        System.out.println(triangle2.toString());
        System.out.println("area2 = " + area2);
    }
}
