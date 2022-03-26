package vv;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarScreen extends JPanel {

	


	private static JLabel label1;
	private NumberExampleChangeCommand sample;


	/**
	 * Create the panel.
	 */
	
	
	
	public CarScreen() {
		sample = new NumberExampleChangeCommand();
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sample.execute();
			}
		});
		btnNewButton.setBounds(52, 269, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(308, 269, 85, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(53, 80, 45, 13);
		label1 = lblNewLabel;
		add(lblNewLabel);

	}
	
	
	public static void SetLabelValue(int newValue) {
		String newText = Integer.toString(newValue);
		label1.setText(newText);
	}

}
