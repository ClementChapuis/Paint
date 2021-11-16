import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.*;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {
    protected Color c;
    protected ArrayList<Figure> list;
    protected String nameFigure;
    protected int x;
    protected int y;

    public Drawing(){
        super();
        this.c = Color.black;
        this.nameFigure = "Rectangle";
        this.list = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        for(Figure f : list){
            f.draw(g);
        }
    }

    public void setColor(Color c) {this.c = c;}

    public void setNameFigure(String nameFigure) {this.nameFigure = nameFigure;}

    public void setList(ArrayList<Figure> l){
        this.list = l;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        switch(nameFigure) {
            case "Rectangle" : list.add(new MyRectangle(x, y, c));
                break;
            case "Ellipse" : list.add(new Ellipse(x, y, c));
                break;
            case "Carre" : list.add(new Square(x, y, c));
                break;
            case "Cercle" : list.add(new Circle(x, y, c));
                break;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        list.get(list.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        list.get(list.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e){}


    public void erase() {
        list.clear();
        super.paintComponent(this.getGraphics());
    }

    public ArrayList<Figure> getList() {
        return this.list;
    }

}
