import javax.swing.*;
import java.awt.* ;

public class Window extends JFrame{
    public Window(String Title,int x, int y) {
        super(Title);
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        JMenuBar m = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem neww = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        menu1.add(neww);
        menu1.add(open);
        menu1.add(save);
        menu1.add(quit);
        m.add(menu1);
        JMenu menu2 = new JMenu("A propos");
        m.add(menu2);
        contentPanel.add(m,"North");

        JPanel DownLeftPanel=new JPanel();
        JButton BlackButton = new JButton("Noir");
        BlackButton.setBackground(Color.black);
        BlackButton.setForeground(Color.white);
        DownLeftPanel.add(BlackButton);
        JButton RedButton = new JButton("Rouge");
        RedButton.setBackground(Color.red);
        DownLeftPanel.add(RedButton);
        JButton GreenButton = new JButton("Vert");
        GreenButton.setBackground(Color.green);
        DownLeftPanel.add(GreenButton);
        JButton BlueButton = new JButton("Bleu");
        BlueButton.setBackground(Color.blue);
        BlueButton.setForeground(Color.white);
        DownLeftPanel.add(BlueButton);
        JButton YellowButton = new JButton("Jaune");
        YellowButton.setBackground(Color.yellow);
        DownLeftPanel.add(YellowButton);
        JButton PinkButton = new JButton("Rose");
        PinkButton.setBackground(Color.pink);
        DownLeftPanel.add(PinkButton);
        JButton MagentaButton = new JButton("Magenta");
        MagentaButton.setBackground(Color.magenta);
        DownLeftPanel.add(MagentaButton);
        JButton OrangeButton = new JButton("Orange");
        OrangeButton.setBackground(Color.orange);
        DownLeftPanel.add(OrangeButton);
        DownLeftPanel.setLayout(new GridLayout(2,3));

        JPanel DownRightPanel=new JPanel();
        JButton EllipseButton = new JButton("paintPackage.Ellipse");
        EllipseButton.setBackground(Color.lightGray);
        DownRightPanel.add(EllipseButton);
        JButton CircleButton = new JButton("paintPackage.Cercle");
        CircleButton.setBackground(Color.lightGray);
        DownRightPanel.add(CircleButton);
        JButton RectangleButton = new JButton("paintPackage.Rectangle");
        RectangleButton.setBackground(Color.lightGray);
        DownRightPanel.add(RectangleButton);
        JButton SquareButton = new JButton("paintPackage.Carre");
        SquareButton.setBackground(Color.lightGray);
        DownRightPanel.add(SquareButton);
        DownRightPanel.setLayout(new GridLayout(2,2));

        JPanel DownPanel=new JPanel();
        DownPanel.setLayout(new GridLayout(1,2));
        DownPanel.add(DownLeftPanel);
        DownPanel.add(DownRightPanel);

        contentPanel.add(DownPanel,"South");
        contentPanel.setBackground(Color.white);

        this.setVisible(true);
    }

    public static void main(String args[]){
        Window win=new Window("Paint it black",800,600);
    }
}
