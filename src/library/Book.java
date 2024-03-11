package library;

import java.util.*;


public class Book {
	
	private String ISBN;
	private String Title;
	private int Edition;
	private int Released;
	private int pages;
	private publisher pub;
	private ArrayList<author> aut=new ArrayList<>();
	
	public Book(String ISBN, String Title) throws Exception{
		if(!ISBN_Ok(ISBN,Title)) throw new Exception ("Invalid ISBN/Title");
		this.ISBN=ISBN;
		this.Title=Title;
		
		this.Released=0;
		this.Edition=0;
		this.pages=0;
		
		
		//for(author a : aut )
			//this.aut.add(a);
		
	}
	
	
	/*
	 * public ArrayList<author> getAut(String id){ ArrayList<author> list=new
	 * ArrayList<>(); for(author a:aut) list.add(a); return list; }
	 */
	 
	
	
	
	public Book(String ISBN, String Title, int Released) throws Exception{
		this(ISBN,Title);
		if (Released==0) throw new Exception ("Released year unknown"); 
	
		
		this.Released=Released;
	}
	
	public Book(String ISBN, String Title, publisher pub) throws Exception{
		this(ISBN,Title);
		if (pub==null) System.out.println("Unknown publisher");
		this.setPub(pub);
	}
	
	public Book(String ISBN, String Title, int Released, int Edition, int pages, publisher pub, author ... aut) throws Exception{
		
		this(ISBN,Title);
		
		this.Released = Released;
		this.Edition=Edition;
		this.pages=pages;
		this.setPub(pub);
		this.aut=new ArrayList<>(Arrays.asList(aut));
		
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setTitle(String Title) throws Exception{
		if(Title==null) throw new Exception("Title must be declared");
		this.Title=Title;
	}
	
	public int getReleased() {
		return Released;
	}
	
	public void setRelesaed(int Released) throws Exception{
		
		 this.Released=Released;
	}
	
	public int getEdition() {
		return Edition;
	}
	
	public void setEdition(int Edition) throws Exception{
		if (Edition==0 ) throw new Exception ("Unknown Edition");
		
		this.Edition=Edition;
	}
	
	public int getPages() {
		return pages;	
	}
	
	public void setPages(int pages) throws Exception{
		if(pages==0) throw new Exception("Pages are unknown");
		this.pages=pages;
	}
	
	public publisher getPub() {
		return pub;
	}

	public void setPub(publisher pub) {
		this.pub = pub;
	}
	
	public ArrayList<author> getAut(){
		return aut;
	}
	
	public void setAut(ArrayList<author>aut) {
		this.aut=aut;
	}

	public String toString() {
		return ISBN + " " + Title;
	}
	

	
	public static boolean ISBN_Ok(String ISBN, String Title) {
		return ISBN!=null && Title !=null;
	}
	
	

}
