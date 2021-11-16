public class Point {
    private int X;
    private int Y;

    public Point () {
        X = Y = 0;
    }

    public Point(int a, int b) {
        X = a;
        Y = b;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}


