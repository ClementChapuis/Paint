import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure {
    protected Color c;
    protected Point p;

    public Figure(Point p1){
        p=p1;
    }

    public Figure(Color c, Point p) {
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

    public abstract int getPerimetre();
    public abstract int getSurface();
    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);
}
