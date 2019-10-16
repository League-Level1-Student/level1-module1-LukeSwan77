package _07_binary_converter;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
JFrame frame = new JFrame("Enter a number to convert into binary");
JPanel panel = new JPanel();
JTextField text = new JTextField();
JButton button = new JButton("Convert");
JLabel label = new JLabel();

 void setup() {
	 frame.add(panel);
	 panel.add(text);
	 panel.add(button);
	 panel.add(label);
	 button.addActionListener(this);
	 frame.setPreferredSize(new Dimension(400,80));
	 panel.setPreferredSize(new Dimension(600,80));
	 text.setPreferredSize(new Dimension(100,50));
	 button.setPreferredSize(new Dimension(80,50));
	 //label.setPreferredSize(new Dimension(100,50));
	 frame.setVisible(true);
	 frame.pack();
	 
 }
 String convert(String input) {
     if(input.length() != 8){
          JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
          return "-";
     }
     String binary = "[0-1]+";    //must contain numbers in the given range
     if (!input.matches(binary)) {
          JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
          return "-";
     }
     try {
          int asciiValue = Integer.parseInt(input, 2);
          char theLetter = (char) asciiValue;
          return "" + theLetter;
     } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
          return "-";
     }
}
@Override
public void actionPerformed(ActionEvent e) {
	label.setText(convert(text.getText()));
	frame.pack();
}

}
