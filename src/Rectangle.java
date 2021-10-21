import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure{
    protected int length;
    protected int width;
    protected Color c;

    public Rectangle(Point p){
        super (p);
        this.length = 0;
    }

    public Rectangle(int l, int w) {
        super(new Point());
        length = l;
        width = w;
    }

    public Rectangle(int px, int py, Color c) {
        super(c, new Point(px,py));
        this.length = 0;
        this.width = 0;
    }

    @Override
    public int getPerimetre() {
        return 2*length+2*width;
    }

    @Override
    public int getSurface() {
        return length*width;
    }

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

    public void setBoundingBox (int heightBB, int widthBB){
        this.length=heightBB;
        this.width=widthBB;
    }

    public void draw (Graphics g){

    }
}
