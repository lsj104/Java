import javax.swing.JOptionPane;

public class Exchange {
	public static void main(String[] args) {
		String moneyString = 
				JOptionPane.showInputDialog("달러 액수:");
		int money = Integer.parseInt(moneyString);
		String exchangeString=
				JOptionPane.showInputDialog("환율:");
		int exchange = Integer.parseInt(exchangeString);
		int result = money * exchange;
		JOptionPane.showMessageDialog(null,
				"$" + money + "는" + result + "원입니다.");
				
		
		

	}

}
