public class Book {
	private String title;
	private String author;
	private int price;
	private double sale; 
	private static int numberOfBook = 0;
	
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		numberOfBook++;
	}
			
	
	public static int getCount() {
		return numberOfBook;
	}

	public void discountBy(double i) {
		sale = price *i*0.01;
		price -= sale;
		
		
		
	}
	
	public void writeInfo() {
		System.out.println("제목:" + title + "," + " 저자:" + author + "," + " 가격:" + price + "원");
		
		
	}

		
		

}
