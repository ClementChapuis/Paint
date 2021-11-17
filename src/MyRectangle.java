    /* Imports */
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends Figure{
    /* Variables */
    protected int length;
    protected int width;

    /* Getters & setters */
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /* Constructors */
    public MyRectangle(Point p){
        super (p);
        this.length = 0;
        this.width = 0;
    }

    public MyRectangle(int l, int w) {
        super(new Point());
        length = l;
        width = w;
    }

    public MyRectangle(int px, int py, Color c) {
        super(new Point(px, py), c);
        this.length = 0;
        this.width = 0;
    }

    /* Methods */

    @Override
    public int getPerimeter(int length, int width) {
        return 2*length+2*width;
    }

    @Override
    public int getSurface(int length, int width) {
        return length*width;
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.length=heightBB;
        this.width=widthBB;
    }

    public void draw (Graphics g){
        g.setColor(this.c);
        g.fillRect(p.getX(), p.getY(), this.length, this.width);
    }
}
