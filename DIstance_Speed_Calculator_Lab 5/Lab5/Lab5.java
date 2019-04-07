import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import javax.swing.JComponent;


	public class Lab5 {
		
		
		public static void main(String[] args) {

	
		
        
        JPanel panel = new JPanel();
        panel.setBounds(12, 52, 247, 168);
       
        panel.setBorder(BorderFactory.createTitledBorder("The Surface"));
        panel.setLayout(null);
        
        JRadioButton Ice = new JRadioButton("Ice");
        Ice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Ice.setBounds(8, 38, 127, 25);
        panel.add(Ice);
        
        JRadioButton Snow = new JRadioButton("Snow");
        Snow.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Snow.setBounds(8, 68, 127, 25);
        panel.add(Snow);
        
        JRadioButton WetAsphalt = new JRadioButton("Wet Asphalt or Concrete");
        WetAsphalt.setFont(new Font("Tahoma", Font.PLAIN, 14));
        WetAsphalt.setBounds(8, 98, 210, 25);
        panel.add(WetAsphalt);
        
        JRadioButton DryAsphalt = new JRadioButton("Dry Asphalt or Concrete");
        DryAsphalt.setFont(new Font("Tahoma", Font.PLAIN, 14));
        DryAsphalt.setBounds(8, 128, 210, 25);
        panel.add(DryAsphalt);
        
        JLabel Speed = new JLabel("Speed");
        Speed.setFont(new Font("Tahoma", Font.BOLD, 15));
        Speed.setBounds(287, 52, 56, 16);
        
        JLabel ThinkingSpeed = new JLabel("Thinking Speed");
        ThinkingSpeed.setFont(new Font("Tahoma", Font.BOLD, 15));
        ThinkingSpeed.setBounds(383, 51, 114, 16);
        
        JLabel stpd = new JLabel();
        stpd.setFont(new Font("Tahoma", Font.BOLD, 15));
        stpd.setBounds(291, 188, 232, 25);
        
        JTextField speedField = new JTextField();
        speedField.setBounds(287, 70, 84, 22);
        speedField.setColumns(10);
        
       
        
        
        JTextField thinkField = new JTextField();
        thinkField.setColumns(10);
        thinkField.setBounds(383, 70, 114, 22);
              
        
            
        JButton calc = new JButton("Calculate Distance");
        
        calc.registerKeyboardAction(calc.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        calc.registerKeyboardAction(calc.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
        
         calc.setBounds(287, 104, 210, 55);
         calc.setFont(new Font("Tahoma", Font.BOLD, 17));
         calc.requestFocus();
		 
         
         
         Snow.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if (Snow.isSelected()) {
 					Ice.setSelected(false);
 					WetAsphalt.setSelected(false);
 					DryAsphalt.setSelected(false);
 				}
 			}
 		});
 		
         Ice.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if (Ice.isSelected()) {
 					Snow.setSelected(false);
 					WetAsphalt.setSelected(false);
 					DryAsphalt.setSelected(false);
 				}
 			}
 		});
         WetAsphalt.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if (WetAsphalt.isSelected()) {
 					Ice.setSelected(false);
 					Snow.setSelected(false);
 					DryAsphalt.setSelected(false);
 					
 					
 				}
 			}
 		});
         
         DryAsphalt.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if (DryAsphalt.isSelected()) {
 					Ice.setSelected(false);
 					Snow.setSelected(false);
 					WetAsphalt.setSelected(false);
 				}
 			}
 		});
         
         
         calc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	 
        		double ice = 0.1;
        		double snow = 0.3;
        		double wet = 0.5;
        		double dry = 0.7;
        		
        	    	

				if (Ice.isSelected()){
					double speed = Double.parseDouble(speedField.getText());  
                    double think = Double.parseDouble(thinkField.getText());
                    
                    
					double thinkS = (speed/3.6)*think;
					double brakingd = 0.50*(1/(ice*9.81))*Math.pow((speed /3.6),2);
					double distance = thinkS + brakingd;
					
					stpd.setText("Stoping Distance is: " + String.format("%.2f", distance) + "m");
				}
				
				if (Snow.isSelected()){
					double speed = Double.parseDouble(speedField.getText());  
                    double think = Double.parseDouble(thinkField.getText());
                    
                    
					double thinkS = (speed/3.6)*think;
					double brakingd = 0.50*(1/(snow*9.81))*Math.pow((speed /3.6),2);
					double distance = thinkS + brakingd;
					
					stpd.setText("Stoping Distance is: " + String.format("%.2f", distance) + "m");
				}
				
				if (WetAsphalt.isSelected()){
					double speed = Double.parseDouble(speedField.getText());  
                    double think = Double.parseDouble(thinkField.getText());
                    
                    
					double thinkS = (speed/3.6)*think;
					double brakingd = 0.50*(1/(wet*9.81))*Math.pow((speed /3.6),2);
					double distance = thinkS + brakingd;
					
					stpd.setText("Stoping Distance is: " + String.format("%.2f", distance) + "m");
				}
				
				if (DryAsphalt.isSelected()){
					double speed = Double.parseDouble(speedField.getText());  
                    double think = Double.parseDouble(thinkField.getText());
                    
                    
					double thinkS = (speed/3.6)*think;
					double brakingd = 0.50*(1/(dry*9.81))*Math.pow((speed /3.6),2);
					double distance = thinkS + brakingd;
					
					stpd.setText("Stoping Distance is: " + String.format("%.2f", distance) + "m");
				}
        	}
        	
        });
         
         
       
              
        
        
       
        
        JFrame frame = new JFrame("Lab");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
        frame.setSize(new Dimension(600,300));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(panel);
        frame.getContentPane().add(Speed);
        frame.getContentPane().add(ThinkingSpeed);
        frame.getContentPane().add(thinkField);
        frame.getContentPane().add(speedField);
        frame.getContentPane().add(calc);
        frame.getContentPane().add(stpd);
        frame.getRootPane().setDefaultButton(calc);
        
 				}
 			}
       