package task9;

public class LibraryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shelf shelf1 = new Shelf("Shelf1",
				new Book[]{
				new Book("Babel","Odessa Tales","babelode"),
				new Book("Joyce","Ulisses","joyceuli")
				});
				Shelf shelf2 = new Shelf("Shelf2",
				new Book[]{
				new Book("Mann","Dr Faustus","mannfau"),
				new Book("Babel","Red Cavalry","babelred")
				});
				Library lib = new Library(
				new Shelf[]{shelf1,shelf2});
				
				System.out.println("# of books by this author: " +
						lib.countAuthor("Babel"));
				

	}

}
