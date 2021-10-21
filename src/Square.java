import java.awt.*;

public class Square extends Rectangle {

    public Square(int length){
        super(length, length);
    }

    public Square (int px, int py, Color c){
        super(px, py, c);
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.length=heightBB;
        this.width=widthBB;
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
}
