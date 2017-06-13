package task9;

public class Shelf {

	
	private String id;
	private Book [] books;
	
public Shelf (String id, Book [] books){
		
		this.id=id;
		this.books=books;
		}

public String GetId(){
	return id;
}
public Book [] GetBooks(){
	return books;
}

}
