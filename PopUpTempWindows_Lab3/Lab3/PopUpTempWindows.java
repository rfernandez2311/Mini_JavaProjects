import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LABS{
public static void main(String[] args) {
JFrame frame = new JFrame("Lab3.2");
        frame.setSize(new Dimension(400,200));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container Pane = frame.getContentPane();

        JLabel label = new JLabel("TEMP CONVERTER",SwingConstants.CENTER);
        frame.add(label);
        label.setFont (label.getFont ().deriveFont (36.0f));
        frame.getContentPane ().add (label);
        
                     
        
        JButton button5 = new JButton("C..TO..F");
        button5.addActionListener(new ActionListener() {

        	public void actionPerformed(ActionEvent e) {

        		int X = -1;

        		while (X < 0) {

        			String input = JOptionPane.showInputDialog("Conversion From C to F");

        			if(input.length() > 0) {

        				X++;

        				double F;      	
                        double cel=Double.parseDouble(input);// para cambiar el input a un string

                        F=( 1.8*cel)+32;// para hacer el cambio de C a F

                      String Fah = new Double(F).toString(); // para convertir el resultado en string para mostrarlo en JoptionPane.ShowMessageDialog
                      JOptionPane.showMessageDialog( Pane, "Result in Fahrenheit: "+Fah);
                      continue;
                  }else
                           System.exit(0);
                      
                       }
                         }
                     });
   
        			JButton button6 = new JButton("F..TO..C");
        			button6.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				int X = -1;
        				
        				while (X < 0) {
        					String input = JOptionPane.showInputDialog("Conversion From F to C");
        					if(input.length() > 0) {
        						X++;
       
              
        						double C;
       
        						double Fahren=Double.parseDouble(input);
        						C=( Fahren-32)*5/9;
        						String Cel = new Double(C).toString();
       
       
        						JOptionPane.showMessageDialog( Pane, "Result in Celcius: "+Cel);
        						continue;
        					}else
        						JOptionPane.showMessageDialog(Pane, "¡Bye!");
        					System.exit(0);
        					
        				}
        			}
        });
        
        
        JPanel pan = new JPanel();
        pan.add(button5);
        pan.add(button6);

        Pane.add(label, BorderLayout.NORTH);
        Pane.add(pan, BorderLayout.CENTER);
     
        

        frame.setVisible(true);


    }
}