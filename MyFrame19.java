import javax.swing.*;
import java.awt.*;

class MyFrame19
{
static public void main(String... rk)
    {
        JFrame f = new JFrame("KE019");
        f.setSize(500, 800);
        f.getContentPane().setBackground(new Color(0, 0, 255, 20));
        f.setLocationRelativeTo(null);
        //f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel msg = new JLabel("Copyright Reserver @ Ravi Kant Sahu");
        f.add(msg, BorderLayout.SOUTH);

        JTextField value = new JTextField(20);
        f.add(value, BorderLayout.NORTH);

        //Creating a JPanel for holding the Buttons

        GridLayout gl = new GridLayout(4, 4);
        JPanel p = new JPanel(gl);
        for(int i=0; i<= 15; i++)
        p.add(new JButton(""+i));

        f.add(p);
        f.setVisible(true);
    }
}