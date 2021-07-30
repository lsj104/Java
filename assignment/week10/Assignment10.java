/*안녕하세요 교수님 201884023 임수진 학생입니다. 다름이 아니라 제가 과제를 구현하면서
 * 다중선택 부분에 대한 코드를 어떻게 써야할지 모르겠어서 한개씩 다 수기로 입력을 하였는데
 * 혹시 다른 방법으로 다중선택부분 문제를 풀어야하는 문제였다면 피드백한번 주실수 있으실까요? 감사합니다! :)
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Assignment10 extends JFrame{
	private JTextField field;
	private JCheckBox btIT;
	private JCheckBox bt1;
	private JCheckBox bt2;
	private JButton goBtn;
	
	public Assignment10() {
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("관심 분야 등록");
		setLayout(new FlowLayout());

		
		JLabel title = new JLabel("이름과 관심분야를 등록하세요.");
		title.setFont(new Font("SansSerif", Font.BOLD,26));
		title.setForeground(Color.blue);
		add(title);
		add(new JLabel("이름"));
		field = new JTextField(30);
		add(field);
		add(new JLabel("관심분야:"));
		btIT = new JCheckBox("IT");
		bt1 = new JCheckBox("외국어");
		bt2 = new JCheckBox("여행");
		goBtn = new JButton("Go");
		add(btIT);
		add(bt1);
		add(bt2);
		goBtn.addActionListener(new BtnListener());
		add(goBtn);
		
	}
	
	private class BtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String selected = "";
			if (btIT.isSelected())
				selected =btIT.getText(); 
			if (bt1.isSelected())
				selected =bt1.getText();
			if (bt2.isSelected())
				selected =bt2.getText();
			if (btIT.isSelected() && bt1.isSelected()) // IT, 외국어 다중선택
				selected =btIT.getText() + " , " +bt1.getText(); 
			if (btIT.isSelected() && bt2.isSelected()) // IT, 여행 다중선택
				selected =btIT.getText() + " , " +bt2.getText();
			if (bt1.isSelected() && bt2.isSelected()) // 외국어, 여행 다중선택
				selected =bt1.getText() + " , " +bt2.getText();
			if (btIT.isSelected() && bt1.isSelected() && bt2.isSelected()) // IT, 외국어, 여행 다중선택
				selected =btIT.getText() + " , " +bt1.getText()+ " , " +bt2.getText();
				
			
			
			Assignment10Frame  assignment10Frame = new Assignment10Frame(field.getText().trim(),selected);
			(new Assignment10Result(assignment10Frame)).setVisible(true);
			dispose();
			
			
		}
	}
		public static void main(String[] args) {
			(new Assignment10()).setVisible(true);

		
	}
}