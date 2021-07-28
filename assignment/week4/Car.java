public class Car {
	private String Model;
	private int Speed ;
	
	public void setModel(String newName) {
		Model = newName;	
	}
	
	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}
	
	public int getSpeed() {
		return Speed;
	}
	
	public String getModel() {
		return Model;
	}

	public void speedUP(int i) {
		this.Speed = this.Speed +i;
	}
	
	public void speedDown(int i) {
		this.Speed = this.Speed -i;
	}
	
	


	


	
	
	
}
