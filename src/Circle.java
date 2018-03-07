public class Circle extends Figure {
    public double x; // abscissa of the center of a circle
    public double y; // the ordinate of the center of the circle
    public double r; // radius of a circle


    @Override
    void print() {
        System.out.println("Circle with center ("+x+";"+y+") and  radius "+r);

    }

    @Override
    void move(double a, double b) {
        x = x + a;
        y = y + b;

    }

    @Override
    void zoom(double k) {
        r = r * k;


    }
}
