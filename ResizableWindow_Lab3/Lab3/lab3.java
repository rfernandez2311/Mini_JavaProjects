import javax.swing.*;
import java.awt.*;


public class lab3{
	public static void main (String [] args) {
		
		JFrame frame = new JFrame("Lab3.1");
		frame.setSize(new Dimension(400,200));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
		
        JLabel label = new JLabel("Type Your ZIP CODE");
        JTextField text = new JTextField(6);
        JButton button1 = new JButton("SUBMIT");
        
		
		
        frame.add(label);
        frame.add(text);
        frame.add(button1);
        frame.setVisible(true);
		
		
	}
	
}