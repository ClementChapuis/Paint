import java.awt.*;

public class Square extends MyRectangle {

    public Square(int side){
        super(side, side);
    }

    public Square (int px, int py, Color c){
        super(px, py, c);
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.length=heightBB;
        this.width=heightBB;
    }

    @Override
    public void setLength(int side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public void setWidth(int side) {
        super.length = side;
        super.width = side;
    }
}
