package zkc;

import javax.swing.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class Sample extends Frame {
 
	private Image img = null;
	int by = 30;
	int yy=  50;
 
	public static void main(String[] args) {
		new Sample();
	}
 
	public Sample() {
		this.setSize(803, 603);
		this.setLocation(100,100);
		this.setTitle("ÒÆ¶¯Í¼Æ¬");
		img = Toolkit.getDefaultToolkit().createImage("../ZKC/src/gundam_00-168.jpg");
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				by=by+10;
				else if(e.getKeyCode() == KeyEvent.VK_LEFT)
				by = by-10;
				else if(e.getKeyCode()==KeyEvent.VK_DOWN)
				yy=yy+10;
				else if(e.getKeyCode()==KeyEvent.VK_UP){
				yy-=10;
				}
				repaint();
			}
		});
		this.setVisible(true);
	}
 
	public void paint(Graphics g) {
		g.drawImage(img, by,yy,300,300,this);
	}
}