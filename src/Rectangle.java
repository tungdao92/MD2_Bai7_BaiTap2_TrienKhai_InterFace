public class Rectangle extends Shape {
    private double with = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }

    public Rectangle(double with, double length) {
        this.with = with;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double with, double length) {
        super(color, filled);
        this.with = with;
        this.length = length;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return with * length;
    }
    public double getPerimeter(){
        return 2*(with + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with with = " + getWith() + ", length = " + getLength() +
                ", which is a subclass of" + super.toString();
    }
}
