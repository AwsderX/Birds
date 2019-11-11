import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public Flock f;
    int a;
    public MyFrame(Flock f){
        this.f = f;
        setSize(1000,1000); //ТУТ МОЖНО THIS!!!!!!
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Окошко");
    }
   @Override
   public void paint(Graphics g){
        a++;
                if (a == 1) {
                    f.draw(g);
                }
        /*g.setColor(new Color(255,170,204));
        g.drawLine(50,50,100,100);
        g.fillOval(100,100,20,20);
        g.drawLine(50,170,100,120);
        g.drawLine(120,100,170,50);
        g.drawLine(170,170,120,120);

        g.drawLine(50,50,50,170);
        g.drawLine(170,50,170,170);
        g.drawLine(50,50,170,50);
        g.drawLine(50,170,170,170);*/
    }
}
