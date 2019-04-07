import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


	public class Lab4 {
	
		public static void main(String[] args) {

	
		     
        
        JLabel lbl = new JLabel("Convert From:");
        lbl.setFont(new Font("Tahoma", Font.BOLD, 19));
        lbl.setBounds(12, 13, 137, 16);
        
        
        JLabel lblNewLabel = new JLabel("Enter Numeric Temp:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setToolTipText(" ");
        lblNewLabel.setBounds(12, 72, 205, 16);
        
        
        JLabel lblConvertTo = new JLabel("Convert to:");
        lblConvertTo.setFont(new Font("Tahoma", Font.BOLD, 19));
        lblConvertTo.setBounds(12, 129, 137, 16);
        
        
        JLabel lblTemperature = new JLabel("Temperature is:");
        lblTemperature.setToolTipText(" ");
        lblTemperature.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTemperature.setBounds(12, 188, 169, 16);
        
        
        
        JRadioButton rdbtn1 = new JRadioButton("Fahrenheit");
        rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rdbtn1.setBounds(12, 38, 121, 25);
      

        
        JRadioButton rdbtn2 = new JRadioButton("Celcius");
        rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rdbtn2.setBounds(133, 38, 108, 25);
       
        
        JRadioButton rdbtn3 = new JRadioButton("Kelvin");
        rdbtn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rdbtn3.setBounds(245, 38, 108, 25);
        
        JRadioButton radiof = new JRadioButton("Fahrenheit");
        radiof.setFont(new Font("Tahoma", Font.PLAIN, 18));
        radiof.setBounds(12, 160, 127, 25);
        
        
        JRadioButton radiok = new JRadioButton("Kelvin");
        radiok.setFont(new Font("Tahoma", Font.PLAIN, 18));
        radiok.setBounds(245, 160, 108, 25);
       
        
        JRadioButton radioc = new JRadioButton("Celcius");
        radioc.setFont(new Font("Tahoma", Font.PLAIN, 18));
        radioc.setBounds(133, 160, 108, 25);
        
        
        JTextField textF = new JTextField();
        textF.setBounds(12, 207, 358, 33);
        textF.setColumns(10);
        
        JTextField textF1 = new JTextField();
        textF1.setBounds(12, 91, 358, 25);
        textF1.setColumns(10);
        
              
                    
        radiof.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if (radiof.isSelected()) {
        			radioc.setSelected(false);
        			radiok.setSelected(false);
				}
        		
        		
				if (rdbtn1.isSelected() && radiof.isSelected()){
					double temp = Double.parseDouble(textF.getText());  //from F TO F
					String result = Double.toString(temp);
					textF1.setText(result);
				}
				
				
				if (rdbtn2.isSelected() && radiof.isSelected()){
					double C = Double.parseDouble(textF.getText());
					double F = 1.8 * C + 32;                                    //from C TO F
					String result = Double.toString(F);
					textF1.setText(result);
				}
				
				
				if (rdbtn3.isSelected() && radiof.isSelected()){
					double K = Double.parseDouble(textF.getText());            //from K to F
					Double F = 1.8 * (K - 273) + 32;
					String result = Double.toString(F);
					textF1.setText(result);
				}
			}
		});
        
        
        
        
        
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtn1);
        group.add(rdbtn2);
        group.add(rdbtn3);
        
        ButtonGroup grou = new ButtonGroup();
        grou.add(radiof);
        grou.add(radiok);
        grou.add(radioc);

        //Register a listener for the radio buttons.
        rdbtn1.addActionListener(null);
        rdbtn2.addActionListener(null);
        rdbtn3.addActionListener(null);
        radiof.addActionListener(null);
        radiok.addActionListener(null);
        radioc.addActionListener(null);
        
        
        
        
        
        
        JFrame frame = new JFrame("Lab");
        frame.setSize(new Dimension(400,300));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);        
        //frame builder
        frame.getContentPane().add(lbl);
        frame.getContentPane().add(lblNewLabel);
        frame.getContentPane().add(lblConvertTo);
        frame.getContentPane().add(lblTemperature);
        frame.getContentPane().add(rdbtn1);
        frame.getContentPane().add(rdbtn2);
        frame.getContentPane().add(rdbtn3);
        frame.getContentPane().add(radioc);
        frame.getContentPane().add(radiof);
        frame.getContentPane().add(radiok);
        frame.getContentPane().add(textF1);
        frame.getContentPane().add(textF);
        
             
        
        
        
       
        
		

	}
}
