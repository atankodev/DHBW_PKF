import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.function.*;
import java.util.*;

public class TestClass extends JFrame {
	
	Container c;
	JButton button;
	
	private int count = 0;
	
	public TestClass() {
		
		c = getContentPane();
		c.setLayout(new FlowLayout());	
		
		Function<Integer, String> its = i -> "" + i;
		
		ActionListener al = e -> button.setText(its.apply(++count));
		
		button = new JButton("" + count);
		button.addActionListener(al);
		
		c.add(button);
		
		List<Integer> liste = Arrays.asList(2, 5, 2, 6, 9, 9, 34, 2, 63, 7 , 5, 1);
		liste.sort((a, b) -> a.compareTo(b));
		liste.forEach(s -> System.out.print(s + ", "));
		
	}

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.setSize(300, 200);
		tc.setTitle("Test Class");
		tc.setVisible(true);
		tc.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
