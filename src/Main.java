import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static public void start(){
        //variables
        int size= 250;
        //basic frame setup
        JFrame myFrame= new JFrame("A clock");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(new Dimension(size,size));
        myFrame.setResizable(false);

        // add the clock face to the frame
        myFrame.add(new ClockFace(size));

        //Package the frame
        myFrame.pack();
        myFrame.setVisible(true);
    }
}