import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Assignment5 extends JFrame {
	public static void main(String[] args) {
		
	}

	public Assignment5() {
		
		String name = JOptionPane.showInputDialog("이름을 입력하시오.");
		setSize(500,300);
		setTitle("Assignment5");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cPane = getContentPane();
		cPane.setBackground(Color.YELLOW);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel(name + "님 안녕하세요");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setForeground(Color.blue);
		cPane.add(label);
		

		
				

	}
}