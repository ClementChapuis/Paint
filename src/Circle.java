import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int axis){
        super(axis, axis);
    }

    public Circle(int px, int py, Color c) {
        super(px, py, c);
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.SemiAxisX=heightBB;
        this.SemiAxisY=heightBB;
    }

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
}
