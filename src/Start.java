public class Start {
    public static void main(String[] args) {
        // Circle
        Circle c = new Circle();
        c.print();
        c.move(-1,1);
        c.print();
        c.r = 10;
        c.print();
        c.zoom(0.5);
        c.print();

        // Triangle
        Triangle t = new Triangle();
        t.xA = 0;
        t.yA = 0;

        t.xB = 0.5;
        t.yB = 1;

        t.xC = 1;
        t.yC = 0.5;

        t.print();

        t.move(1,1);
        t.print();

        t.move(-1,-1);
        t.print();

        t.zoom(2);
        t.print();


    }

}
