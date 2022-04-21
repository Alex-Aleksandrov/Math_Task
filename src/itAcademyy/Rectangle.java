package itAcademyy;

public class Rectangle extends Figure{
    private double shirina;
    private double toll;

    public Rectangle(String color, double shirina, double toll) {
        super(color);
        this.shirina = shirina;
        this.toll = toll;
    }

    @Override
    public double area() {
        return shirina * toll;
    }

    @Override
    public double perimeter() {
        return 2 * (shirina + toll);
    }
}