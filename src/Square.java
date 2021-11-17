    /* Imports */
import java.awt.*;

public class Square extends MyRectangle {
    /* Getters & setters */
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

    /* Constructors */
    public Square(int side){
        super(side, side);
    }

    public Square (int px, int py, Color c){
        super(px, py, c);
    }

    /* Methods */
    public void setBoundingBox (int heightBB, int widthBB){
        this.length=heightBB;
        this.width=heightBB;
    }
}
