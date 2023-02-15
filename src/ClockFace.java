import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class ClockFace extends JPanel {
    //attributes
    private int size;
    private int middle;
    final double angle= 2*Math.PI/12;
    private int cirkSize;
    private int dx,dy;


    //Contructor
    public ClockFace(int num){
        size = num;
        middle = size/2;
        this.setBackground(Color.pink);
        this.setPreferredSize(new Dimension(size,size));
    }

    //methods
    //paints the cicle
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        face(g);
        drawNum(g);

        drawSecond(g);
        repaint();
    }

    public void face(Graphics g){
        int x = (int) (size*0.1);
        int y= x;
        cirkSize= size-x*2;
        g.setColor(Color.green);
        g.fillOval(x,y,cirkSize,cirkSize);
    }

    public void drawNum(Graphics g){

        int dist= (int)((cirkSize*0.9)/2);

        for(int i= 1; i <= 12; i++) {
            double v= angle*i;
            dx = (int) (dist * Math.sin(v));
            dy= (int) (dist * Math.cos(v));
            g.setColor(Color.black);
            g.drawString(String.valueOf(i),middle+dx,middle-dy);
            //g.fillOval(middle+dx,middle+dy,10,10);
        }
    }

    public void drawSecond(Graphics g){

    }


    //get/Set

}
