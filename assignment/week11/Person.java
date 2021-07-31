public class Person implements Comparable {
	private  String name;
	private double height;
	private double  weight;
	private double  bmi;
	private double mheight;

		
	
	public Person(String name, double height, double  weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.mheight = this.height * 0.01;
        this.bmi = Math.round(this.weight / (this.mheight * this.mheight)*100)/100.0;
		
		
	}
	

	public String toString() {
		return "이름=" + name + ", 키=" + Math.round(height) + "cm"+", 몸무게=" + weight + ", bmi=" + bmi;
	}
	
	
	
	
	public int compareTo(Object obj) {
		if (obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			
			if (bmi > p.bmi)
				return 1;
			else if  (bmi < p.bmi)
				return -1;
			else
				return 0;
			
		}
			return 0;
	}


	

}

