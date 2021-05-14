package cal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondFrame {
	private JFrame f = new JFrame();
	private JPanel eventPanel = new JPanel();
	private JTextField eventName = new JTextField("Event Name", 30);
	private JTextField dayOf = new JTextField("Enter date", 18);
	private JTextField startTime = new JTextField("Enter start time", 15);
	private JTextField endTime = new JTextField("Enter end time", 15);
	private JButton save = new JButton("Save");


	public SecondFrame() {
		f.setTitle("Create An Event");
		f.setSize(400,200);
		f.setResizable(false);
		eventPanel.add(eventName);
		eventPanel.add(dayOf);
		eventPanel.add(startTime);
		eventPanel.add(endTime);
		eventPanel.add(save);
		f.add(eventPanel);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
