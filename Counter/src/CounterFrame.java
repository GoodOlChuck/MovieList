import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;


public class CounterFrame extends JFrame implements ActionListener {

	private Counter counter;
	private JTextField counterField;
	
    public CounterFrame(){
        counter = new Counter(10);
        counterField = new JTextField("0");
        this.add(counterField, BorderLayout.CENTER);
        JButton incButton = new JButton("increment");
        this.add(incButton, BorderLayout.SOUTH); 
        incButton.addActionListener(this);
    }
    
    public static void main(String[] args) {
    	CounterFrame cf = new CounterFrame();
    	cf.setSize(200,400);
    	cf.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		counter.increment();
		counterField.setText(counter.getValue() + "");
	}

}
