import java.awt.Color;
import java.awt.Graphics;

public class Ellipse {
    protected int SemiAxisX;
    protected int SemiAxisY;
    protected Color c;

    public Ellipse(int semiAxisX, int semiAxisY){
        SemiAxisX = 0;
        SemiAxisY = 0;
    }

    public Ellipse(int px, int py, Color c) {
        this.SemiAxisX = px;
        this.SemiAxisY = py;
        this.c = c;
    }

    public int getPerimeter(int length, int width){
        return (int) (Math.PI*length*width);
    }

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

    }
}
