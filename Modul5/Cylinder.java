package soal1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius) * height;    	//return 3.74 * (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
    }



    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}