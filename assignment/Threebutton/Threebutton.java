import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Threebutton extends JFrame{
	private JLabel label;
	private JButton btnRed;
	private JButton btnBlue;
	private JButton btnGreen;

		public class ButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == btnRed) {
					(getContentPane()).setBackground(Color.red);
					label.setText("빨간색 배경입니다.");
				}
				else if (e.getSource() == btnBlue){
					(getContentPane()).setBackground(Color.blue);
					label.setText("파란색 배경입니다.");
				}
				else if (e.getSource() == btnGreen) {
					(getContentPane()).setBackground(Color.GREEN);
					label.setText("초록색 배경입니다.");
				}
				
				
			}
		}
		public Threebutton() {
			setSize(400,250);
			setTitle("Three Button Example");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container cPane = getContentPane();
			cPane.setLayout(new FlowLayout());
			label = new JLabel("");
			label.setForeground(Color.yellow);
			label.setFont(new Font("Serif", Font.BOLD, 25));
			btnRed = new JButton("RED");
			btnGreen = new JButton("GREEN");
			btnBlue = new JButton("BLUE");
			ButtonListener listener = new ButtonListener();
			btnRed.addActionListener(listener);
			btnGreen.addActionListener(listener);
			btnBlue.addActionListener(listener);
			
			
			cPane.add(btnRed);
			cPane.add(btnGreen);
			cPane.add(btnBlue);
			cPane.add(label);
			
		}

	public static void main(String[] args) {
		(new Threebutton()).setVisible(true);
	}
	}


