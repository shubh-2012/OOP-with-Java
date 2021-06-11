package author_and_book;

public class Book {
	String name;
	Author author;
	double price;
	int qty;
	
	public Book(String name,Author author,double price,int qty) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	
	public String toString() {
		return "'"+name+"' by "+author.toString();
	}
}
