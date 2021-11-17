    /* Imports */
import java.awt.*;

public class Circle extends Ellipse{
    /* Getters & setters */
    @Override
    public void setSemiAxisX(int axis) {
        super.SemiAxisX = axis;
        super.SemiAxisY = axis;
    }

    @Override
    public void setSemiAxisY(int axis) {
        super.SemiAxisX = axis;
        super.SemiAxisY = axis;
    }

    /* Constructors */
    public Circle(int axis){
        super(axis, axis);
    }

    public Circle(int px, int py, Color c) {
        super(px, py, c);
    }

    /* Methods */
    public void setBoundingBox (int heightBB, int widthBB){
        this.SemiAxisX=heightBB;
        this.SemiAxisY=heightBB;
    }
}
