package inheritance;

import java.util.Iterator;

import org.w3c.dom.css.CSSStyleDeclaration;

public class Main {

	public static void main(String[] args) 
	{
		Education education1 = new Education();
		education1.setId(0);
		education1.setEducationName("Java");
		Education education2 = new Education();
		education2.setId(1);
		education2.setEducationName("Java-React");
		Education education3 = new Education();
		education3.setId(2);
		education3.setEducationName(".Net");
		Education education4 = new Education();
		education4.setId(3);
		education4.setEducationName("C#-Angular");
		Education education5 = new Education();
		education5.setId(4);
		education5.setEducationName("Javascript");
		
		Education[] educations = {education1,education2,education3,education4,education5};
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(0);
		instructor1.setName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setProfession("Java,Java-React,.Net,C#-Angular,Javascript");
		instructor1.setEmailAddress("engindemirog@gmail.com");
		
		Student student1 = new Student();
		student1.setId(0);
		student1.setName("Batuhan");
		student1.setLastName("Kaynarcalidan");
		student1.setAdress("Edirne");
		student1.setIdentityNumber("1231231123");
		student1.setEmailAddress("kaynarcalidanbatu@gmail.com");
				
		Student student2 = new Student();
		student2.setId(1);
		student2.setName("Mehmet");
		student2.setLastName("Kuyumcu");
		student2.setAdress("Ankara");
		student2.setIdentityNumber("566436463353");
		student2.setEmailAddress("mehmetkuyumcu@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.loginButton(student1);
		for (Education education : educations) 
		{
			System.out.println(education.getEducationName());
		}
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.createdCourse(instructor1);
		System.out.println(student1.getName()+" "+ student1.getLastName() +" "+ education1.getEducationName() + " Dersini Secti");
		StudentManager studentManager = new StudentManager();
		studentManager.attendClass(student1);
		
		
		
		
	}

}
