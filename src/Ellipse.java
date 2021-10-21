import java.awt.Color;
import java.awt.Graphics;

public class Ellipse {
    private int SemiAxisX; //attention à modifier le nom des variables (voir page 3)
    private int SemiAxisY;
    private Color c;

    public Ellipse(){
        SemiAxisX = 0;
        SemiAxisY = 0;
    }

    public Ellipse(int px, int py, Color c) {
        this.SemiAxisX = px;
        this.SemiAxisY = py;
        this.c = c;
    }

    public void setLength(int length) {
        this.SemiAxisX = length;
    }

    public void setWidth(int width) {
        this.SemiAxisY = width;
    }

    public int getLength() {
        return SemiAxisX;
    }

    public int getWidth() {
        return SemiAxisY;
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

    public void draw (Graphics g){

    }
}
