package task9;

public class Book {
	
	private String author;
	private String body;
	private String title;
	
	public Book(String author, String body, String title){
		
		this.author=author;
		this.body=body;
		this.title=title;
		}
	
	public String GetAuthor(){
		return author;
	}
	public String GetBody(){
		return body;
	}
	
	public String GetTitle(){
		return title;
	}

}
