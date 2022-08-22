package rotatingCircle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	int x, y;
	int height = 500;
	int width = 500;
	int centerX , centerY;
	int angle1 = 0;
	
	MyPanel(int w , int h){
		this.centerX = w/2;
		this.centerY = h/2;
		this.x = centerX ;
		this.y = centerY;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawOval(centerX, centerY, width, height);
		g.setColor(Color.BLUE);
		g.fillArc(x, y, width, height, angle1, 30);
		g.fillArc(x, y, width, height, (angle1 + 90), 30);
		g.fillArc(x, y, width, height, (angle1 + 180), 30);
		g.fillArc(x, y, width, height, (angle1 + 270), 30);
		
		repaint();
	}
}
