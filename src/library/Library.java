package library;



public class Library {
	
	 private static void test1(){
	try {
	

	Book book = create("978-1-59059-855-9", "Man in fire", 2022, 1, 300, new publisher("101", "Projapoti publisher"),  
			                              new author[]  {new author("Kaji Anwar", "Hosen"), new author("Audri","Udash")});
	
	Book book1 = create("978-1-59059-855-313", " Amar Sharata Din ", 2022, 0, 0, new publisher(" 0 ", " 0"),  
                                          new author[]  {new author("AB", "Ryan"), new author("Audri","Udash")} );
	
	print(book);
	print(book1);
	
	}

	catch(Exception e) {
		System.out.println(e.getMessage());
	}}
	

	private static Book create(String ISBN, String Title, int Released, int Edition, int pages, publisher pub, author...aut) throws Exception{
		Book book=new Book(ISBN,Title,Released, Edition, pages, pub, aut);
		
		return book;
		}
		
	
	
	private static void print(Book book) {
		System.out.println("ISBN:"+book.getISBN());
		System.out.println("Title:"+book.getTitle());
		System.out.println("Publisher year:"+book.getReleased());
		if(book.getEdition()==0) {
			System.out.println("Edition Unknown");
		}else {
		System.out.println("Edition:"+book.getEdition());}
		if(book.getPages()==0) {
			System.out.println("Unknown Pages");
		}
		else {
		System.out.println("Page:"+book.getPages());}
		System.out.println("Publisher:"+book.getPub());
		System.out.println("Author:"+book.getAut());
		
		
	}

	public static void main(String[] args) {
		
		test1();
		//test2();
	

	}



	/*
	 * private static void test1() { try { publisher publisher1=new
	 * publisher("112233","chodu modu kodu");
	 * System.out.println(publisher1.getId());
	 * System.out.println(publisher1.getName());
	 * publisher1.setName("Sir valo hoye jan:"); System.out.println(publisher1); }
	 * 
	 * catch(Exception ex) { System.out.println(ex.getMessage()); } }
	 */
	/*
	 * private static void test2() { try { author a1=new author("Hans","Zimmer");
	 * author a2=new author("Audio","Slave"); System.out.println(a1.toString());
	 * System.out.println(a2.toString());
	 * 
	 * 
	 * a1.setFirstname("AB"); a1.setLastname("Ryan"); a2.setFirstname("Audri");
	 * a2.setLastname("Udas");
	 * 
	 * print(a1); print(a2);
	 * 
	 * } catch(Exception E) { System.out.println(E.getMessage()); }
	 * 
	 * }
	 */
	
	/*
	 * private static void print(author a) { System.out.println(a);
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * }
	 */

}

