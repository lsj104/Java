import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Assignment10Result extends JFrame {
	public Assignment10Result(Assignment10Frame  assignment10Frame) {
		setSize(500,200);
		setTitle("관심분야 등록 결과");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JLabel title = new JLabel("관심분야를 등록해 주셔서 감사합니다.");
		title.setFont(new Font("SansSerif", Font.BOLD,26));
		title.setForeground(Color.blue);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(500,30));
		
		JLabel label = new JLabel("이름:" + assignment10Frame.getName());
		label.setFont(new Font("SansSerif", Font.PLAIN,20));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500,80));
		JLabel label1 = new JLabel("관심분야:" + assignment10Frame.getThings());
		label1.setFont(new Font("SansSerif", Font.PLAIN,20));
		add(title);
		add(panel1);
		panel1.add(label);
		add(panel2);
		panel2.add(label1);
		
		
	}

}

