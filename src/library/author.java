package library;

public class author {
	
	private int id;
	private String firstname;
	private String lastname;
	private static int number=0;
	private int count=0;
	
	public author(String firstname,String lastname) throws Exception{
		
		if(!authorOk(firstname,lastname)) throw new Exception("Invalid name");
		this.firstname=firstname;
		this.lastname=lastname;
		id=++number;

	}
	
	static {
		number=1000;
	}
	
	public int getId() {
		return id;
	}
	
	public int getCount() {
		return count++;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) throws Exception {
		 if(!authorOk(firstname,lastname)) throw new Exception("Invalid firstname");
		 this.firstname=firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) throws Exception {
		 if(!authorOk(firstname,lastname)) throw new Exception("Invalid lastname");
		 this.lastname=lastname;
	}
	
	public String toString() {
		return "["+id+"]"+" "+firstname +" "+ lastname;
	}
	
	
	
	public boolean authorOk(String firstname,String lastname) {
		
		return firstname!=null || firstname.isBlank() && lastname!=null && !lastname.isBlank();
		
	}

}
