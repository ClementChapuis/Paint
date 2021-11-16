import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure {
    protected Color c;
    protected Point p;

    public Figure(Point p1){
        p=p1;
    }

    public Figure(Point p, Color c) {
        this.c = c;
        this.p = p;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "c=" + c +
                ", p=" + p +
                '}';
    }

    public abstract int getPerimeter(int length, int width);

    public abstract int getSurface(int length, int width);

    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);
}
