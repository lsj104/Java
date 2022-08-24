import javax.swing.JFrame;

public class Assignment10Frame extends JFrame {
	private String name;
	private String things;
	
	public Assignment10Frame(String name, String things) {
		this.name = name;
		this.things = things;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getThings() {
		return things;
	}
}

