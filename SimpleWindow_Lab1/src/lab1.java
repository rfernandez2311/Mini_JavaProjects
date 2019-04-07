
import java.awt.*;
import javax.swing.*;

public class lab1 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab1");
        frame.setSize(new Dimension(400,200));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Container contentPane = frame.getContentPane();
        Container Pane = frame.getContentPane();

        JLabel label = new JLabel("Welcome",SwingConstants.CENTER);
        
        frame.add(label);
        label.setFont (label.getFont ().deriveFont (36.0f));
        frame.getContentPane ().add (label);
        
        

        JButton button1 = new JButton("ONE");
        JButton button2 = new JButton("TWO");
        JButton button3 = new JButton("TREE");
        JButton button4 = new JButton("FOUR");
        
        
        JButton button5 = new JButton("OK");
        JButton button6 = new JButton("CANCEL");
        
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        
        JPanel pan = new JPanel();
        pan.add(button5);
        pan.add(button6);

        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        Pane.add(pan, BorderLayout.PAGE_END);
     
        

        frame.setVisible(true);


    }
}