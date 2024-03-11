package library;

public class publisher {
	
	private String name;
	private String Id;
	
	public publisher(String Id, String name) throws Exception{
		
		if (!publisherOk(Id,name))
			throw new Exception("Invalid charecters:");
		this.name=name;
		this.Id=Id;
	}
	
	public String getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception{
		if (!publisherOk(Id,name))
			throw new Exception("Must have a name:");
		this.name=name;
	}
	
	public String toString() {
		return "[" + Id + "]"+name;
	}
	
	public static boolean publisherOk(String Id, String name) {
		return Id!=null && Id.length()>0 && name!=null && name.length()>0;
	}

}
