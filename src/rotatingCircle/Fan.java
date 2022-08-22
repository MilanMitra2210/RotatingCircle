package rotatingCircle;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Fan extends JFrame implements ActionListener {

	JButton b1 , b2;
	int width=500;
    int height=500;
    MyPanel panel;
	
	Fan(){
		
		
		setSize(800,700);
		setLocation(300,100);
		setLayout(null);
		
		panel = new MyPanel(200 , 10);
		panel.setBackground(Color.WHITE);
		panel.setSize(750,550);
		panel.setLocation(15, 20);
		add(panel);
		
		b1 = new JButton("Rotate Clockwise");
		b1.setBounds(150, 600, 200, 30);
		b1.setFont(new Font("Tahoma", Font.BOLD,16));
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Rotate Counter Clockwise");
		b2.setBounds(360, 600, 250, 30);
		b2.setFont(new Font("Tahoma", Font.BOLD,16));
		b2.addActionListener(this);
		add(b2);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			panel.angle1 = (panel.angle1 + 30)%360;
			panel.repaint();
		}else if(e.getSource() == b2) {
			panel.angle1 = (panel.angle1 - 30)%360;
			panel.repaint();
		}
	}
	public static void main(String[] args) {
		new Fan().setVisible(true);
	}
	
}
