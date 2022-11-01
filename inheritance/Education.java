package inheritance;

public class Education {
	
	private int id;
	private String educationName;
	
	public Education()
	{
		
	}
	public Education(int id,String educationName)
	{
		this();
		this.id=id;
		this.educationName=educationName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	

	

}
