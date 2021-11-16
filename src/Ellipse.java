import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Figure {
    protected int SemiAxisX;
    protected int SemiAxisY;

    public Ellipse(Point p){
        super (p);
        this.SemiAxisX = 0;
        this.SemiAxisY = 0;
    }

    public Ellipse(int ga, int pa) {
        super(new Point());
        SemiAxisX = ga;
        SemiAxisY = pa;
    }

    public Ellipse (int px, int py, Color c){
        super(new Point(px, py), c);
        this.SemiAxisX = 0;
        this.SemiAxisY = 0;
    }

    @Override
    public int getPerimeter(int length, int width){
        return (int) (Math.PI*length*width);
    }

    @Override
    public int getSurface(int length, int width){
        return (int) (2*Math.PI*Math.sqrt(((length)^2+(width)^2)/2));
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.SemiAxisX=heightBB;
        this.SemiAxisY=widthBB;
    }

    public void setSemiAxisX(int semiAxisX) {
        SemiAxisX = semiAxisX;
    }

    public void setSemiAxisY(int semiAxisY) {
        SemiAxisY = semiAxisY;
    }

    public void draw (Graphics g){
        g.setColor(this.c);
        g.fillOval(p.getX(), p.getY(), this.SemiAxisX, this.SemiAxisY);
    }

    public int getSemiAxisX() {
        return SemiAxisX;
    }

    public int getSemiAxisY() {
        return SemiAxisY;
    }
}
