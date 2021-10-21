import java.awt.*;

public class Circle extends Ellipse{
    protected int SemiAxisX;
    protected int SemiAxisY;

    public Circle(int semiAxisX){
        super(semiAxisX,semiAxisX);
    }

    public Circle(int px, int py, Color c) {
        super(px, py, c);
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.SemiAxisX=heightBB;
        this.SemiAxisY=widthBB;
    }

    @Override
    public void setSemiAxisX(int semiAxisX) {
        SemiAxisX = semiAxisX;
    }

    @Override
    public void setSemiAxisY(int semiAxisY) {
        SemiAxisY = semiAxisY;
    }
}
