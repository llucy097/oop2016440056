import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeCalculator extends JFrame implements ActionListener {
	
	JButton btn[];
	JTextField tf;
	JPanel btnPanel, ctrPanel, masterPanel;
	String[] labels = {"7", "8", "9", "+", "4", "5", "6", "@", "1", "2", "3", "@", "0", "C", "=", "@"}; 
	
	PracticeCalculator(){
		
		setBackground(Color.WHITE);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator : Adder");
		
		
		
		tf = new JTextField(15);
		
		btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(0, 4, 4, 4));
		btn = new JButton[16];
		int index = 0; 
		for (int rows = 0; rows < 4; rows++) {
			for (int cols = 0; cols <4; cols++) {
				btn[index] = new JButton(labels[index]);
				btn[index].addActionListener(this);
			
			if (cols >= 3) 
               btn[index].setForeground(Color.black); 
            else 
               btn[index].setForeground(Color.black); 
 
            btn[index].setBackground(Color.white); 
            btnPanel.add(btn[index]); 
            index++; 
			}
			add(tf, BorderLayout.NORTH);
			add(btnPanel, BorderLayout.CENTER);
			
			setVisible(true);
			pack();
		}
		
	}
	
    protected void calculateInit() { 
        tempName = ""; 
        tempString = ""; 
        tempNum1 = 0; 
        tempNum2 = ""; 
        is_ready = false; 
        who = ""; 
    } 
 
    private String tempName; 
    private String tempString; 
    private int tempNum1 = 0; 
    private String tempNum2 = ""; 
    private boolean is_ready = false; 
    private String who = "";  
	
    public void actionPerformed(ActionEvent e) { 
        try { 
            tempName = e.getActionCommand(); 
            if (tempName.equals("C")) { 
 
                tf.setText(""); 
                return; 
            } 
            tempString = tf.getText();
 
            if (tempString.equals("0")) 
                tempString = ""; 
 
            if ((tempName.equals("+")) && !is_ready) { 
                tempNum1 = Integer.parseInt(tempString); 
                is_ready = true; 
 
 
                who = tempName; 
          
 
                tf.setText(tempString + tempName);  
            } else if (tempName.equals("=") && is_ready && !tempNum2.equals("")) { 
                int temp = Integer.parseInt(tempNum2); 
                tf.setText(Integer.toString(Calculate(tempNum1, temp, who)));  
                calculateInit(); 
            } 
            else if(tempName.equals("=") && (!is_ready || tempNum2.equals(""))) { 
            } 
            else { 
                tf.setText(tempString + tempName); 
            } 
 
            if(is_ready && isNumeric(tempName)) {  
                tempNum2 += tempName; 
            } 
        } 
        catch (Exception ex) { 
            tf.setText(""); 
            calculateInit(); 
        } 
 
    } 
    private boolean isNumeric(String str) {
    	try         { 
            double d = Double.parseDouble(str); 
        } 
        catch(NumberFormatException nfe) { 
            return false; 
        }
        return true;
	}
    

	protected int Calculate(int a, int b, String s) {
        switch(s) {
            case "+": 
                return a+b; 
            default: 
                return -1; 
        } 
    }
	
	

}

		
		
	




