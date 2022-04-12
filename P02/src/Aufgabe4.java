import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Aufgabe4 extends JFrame{
	
	Container container;
	JButton[] buttons = new JButton[3];
	
	public Aufgabe4() {
		
		container = getContentPane();
		container.setLayout(new GridLayout(1, 3));
		
		ActionListener al = e -> {
			JButton btn = (JButton) e.getSource();
			int i = Integer.parseInt(btn.getText());
			btn.setText(++i+"");
		};
		
		buttons[0] = new JButton("0");
		buttons[1] = new JButton("0");
		buttons[2] = new JButton("0");
		
		buttons[0].addActionListener(al);
		buttons[1].addActionListener(al);
		buttons[2].addActionListener(al);
		
		container.add(buttons[0]);
		container.add(buttons[1]);
		container.add(buttons[2]);
		
		Runnable thread = () -> {
			
			int[] maxVal = {0, 0, 0};
			int max = 1000;
			while(maxVal[0] < max && maxVal[1] < max && maxVal[2] < max) {	
				int rnd = (int) (Math.random() * 3);
				buttons[rnd].setText(++maxVal[rnd]+"");
				try {
					Thread.sleep(5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		};
		
		new Thread(thread).start();
		
	}

	public static void main(String[] args) {
		
		Aufgabe4 a4 = new Aufgabe4();
		a4.setSize(300, 100);
		a4.setTitle("Aufgabe 4");
		a4.setVisible(true);
		a4.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
