import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Drawing extends JFrame {
    protected Color c;
    protected ArrayList<Figure> list;
    protected String nameFigure;
    protected int x;
    protected int y;

    public Drawing(Color c, String nameFigure){
        this.setBackground(Color.white);
        this.c = Color.black;
        this.nameFigure = Rectangle;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }


}
