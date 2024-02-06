import javax.swing.*;
import java.awt.*;

class FirstFrame{
    public static void main(String args[]){
        JFrame frame = new JFrame("Notepad");
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.MAGENTA);

        // BUTTONS 
        JButton b1 = new JButton("Submit");
        frame.add(b1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)
        frame.setVisible(true);
    }
}