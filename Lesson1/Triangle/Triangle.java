package progKievOop.Lesson1.Triangle;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideThree, double sideTwo) {
        this.sideOne = sideOne;
        this.sideThree = sideThree;
        this.sideTwo = sideTwo;
    }

    public Triangle() {
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideOne = " + sideOne +
                ", sideTwo = " + sideTwo +
                ", sideThree = " + sideThree +
                '}';
    }

    public double area() {
        double p;
        double s;
        p = (sideOne + sideTwo + sideThree) / 2;
        s = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
        return s;
    }
}
