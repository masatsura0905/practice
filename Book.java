public class Book extends TangibleAsset{
	private String isbn;
	public Book(String isbn,String name,int price,String color){
		super(name,price,color)
			this.isbn=isbn;
	}
	public String getIsbn(){return this.isbn;} 
