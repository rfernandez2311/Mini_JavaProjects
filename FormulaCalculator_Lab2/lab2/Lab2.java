package lab2;

import java.awt.event.*;
import javax.swing.*;


class Lab2 extends JFrame implements ActionListener {
	 
	 public static void main( String[] args ) {
		 
	 Lab2 triangulo=new Lab2();
	 triangulo.setLocationRelativeTo(null);
	 triangulo.setVisible(true);
	
	 }
	 private static final long serialVersionUID = 1L;
	 JLabel label2, label3,Label4;
	 JLabel label1;
	 JButton boton1,boton2;
	 JTextField TxtFieldX,TxtFieldY,TxtFieldResult;
	 
	    
	 public Lab2() {
		 
		 
		  setLayout(null);
	
	  label1= new JLabel();
	  label1.setText("Formula: 2x^2-(X+Y)+ Y/4");
	  label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
	  label1.setBounds(80, 10, 300, 40);
	  
	   
	  label2 = new JLabel("Enter X:");
	  label2.setBounds(10, 50, 80, 25);
	  
	  TxtFieldX=new JTextField(20);
	  TxtFieldX.setBounds(90, 50, 80, 25);
	  
	  label3 = new JLabel("Enter Y:");
	  label3.setBounds(220, 50, 80, 25);
	  TxtFieldY=new JTextField(20);
	  TxtFieldY.setBounds(300, 50, 80, 25); 
	  
	  boton1 = new JButton();
	  boton1.setBounds(90, 95, 90, 25);
	  boton1.setText("Calcular");
	  
	  boton1.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent arg0){

	    	  double X, Y;
	    	  X=Double.parseDouble(TxtFieldX.getText());
	    	  Y=Double.parseDouble(TxtFieldY.getText());
	    	  double res1 = (2 * Math.pow(X, 2)) - (X+Y) +(Y/4);
	    	  String result = Double.toString(res1);
	    	  TxtFieldResult.setText(result);
	    	 
	    	  }
		  
	  });
	  
	  boton2 = new JButton();
	  boton2.setBounds(90, 145, 90, 25);
	  boton2.setText("Borrar");
	  boton2.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			  
			  TxtFieldX.setText(null);
			  TxtFieldY.setText(null);
			  TxtFieldResult.setText(null);
			  TxtFieldX.requestFocus();
			  
		  }
	  });
	  
	  
	 
	  Label4 = new JLabel("Results:");
	  Label4.setBounds(227, 95,90, 25);
	  TxtFieldResult=new JTextField(20);
	  TxtFieldResult.setBounds(300, 95, 80, 25);
	  
	     
	  add(label1);
	  add(label2);
	  add(label3);
	  add(Label4);
	  add(TxtFieldX);
	  add(TxtFieldY);
	  add(boton1);
	  add(boton2);
	 
	 
	  
	  add(TxtFieldResult);
	   
	  setTitle("lab 2");
	  setSize(410, 230); 
	 }

	
	public void actionPerformed(ActionEvent e) {
			
	}
	 
}