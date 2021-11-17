public class Point {
    /* Variables */
    private int X;
    private int Y;

    /* Getters & Setters */
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    /* Constructors */
    public Point () {
        X = Y = 0;
    }

    public Point(int a, int b) {
        X = a;
        Y = b;
    }

    /* Methods */
    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}


