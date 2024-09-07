package com.Assiment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CelsiusConverter implements ActionListener {
	  JFrame converterFrame;
	  JPanel converterPanel;
	  JTextField tempCelsius;
	  JLabel celsiusLabel, fahrenheitLabel;
	  JButton convertTemp;
	  public CelsiusConverter() {
	    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
	    converterPanel = new JPanel();
	    converterPanel.setLayout(new GridLayout(2, 2));
	    addWidgets();
	    converterFrame.getContentPane().add(converterPanel,
	      BorderLayout.CENTER);
	    converterFrame.setDefaultCloseOperation(
	      JFrame.EXIT_ON_CLOSE);
	    converterFrame.pack();
	    converterFrame.setVisible(true);
	  }

	  private void addWidgets() {
		    tempCelsius = new JTextField(2);
		    celsiusLabel = new JLabel("Celsius",
		      SwingConstants.LEFT);
		    convertTemp = new JButton("Convert...");
		    fahrenheitLabel = new JLabel("Fahrenheit",
		      SwingConstants.LEFT);
		    convertTemp.addActionListener(this);
		    converterPanel.add(tempCelsius);
		    converterPanel.add(celsiusLabel);
		    converterPanel.add(convertTemp);
		    converterPanel.add(fahrenheitLabel);
		  }
	  public void actionPerformed(ActionEvent event) {
		    int tempFahr = (int)((Double.parseDouble(
		      tempCelsius.getText())) * 1.8 + 32);
		    fahrenheitLabel.setText(tempFahr + " Fahrenheit");
		  }

		  public static void main(String[] args) {
		    try {
		      UIManager.setLookAndFeel(
		        UIManager.getCrossPlatformLookAndFeelClassName());
		    } catch(Exception e) {}

		    CelsiusConverter converter = new CelsiusConverter();
		  }
		} // end CelciusConverter class
