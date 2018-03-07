public class Triangle extends Figure {
    public double xA; // The abscissa of the base point of the triangle
    public double yA; // the ordinate of the base point of the triangle

    public double xB;
    public double yB;

    public double xC;
    public double yC;


    @Override
    void print() {
        System.out.println("Triangle with coordinates A ("+xA+";"+yA+")");
        System.out.println("Triangle with coordinates B ("+xB+";"+yB+")");
        System.out.println("Triangle with coordinates C ("+xC+";"+yC+")");
    }

    @Override
    void move(double a, double b) {
        xA = xA + a;
        yA = yA + b;

        xB = xB + a;
        yB = yB + b;

        xC = xC + a;
        yC = yC + b;



    }

    @Override
    void zoom(double k) {
        xB = (xB - xA) * k + xA;
        yB = (yB - yA) * k + yA;

        xC = (xC - xA) * k + xA;
        yC = (yC - yA) * k + yA;

    }
}
