import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName; 
	String professorName; 
	int year;

    List<Student> estudiantes = new ArrayList<>(  );
	public Courses(String courseName,String professorName,int year){
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
		
	}

	public void enroll(Student estudiante){
		estudiantes.add(estudiante);   
		//TODO add the student to the collection
	   }
	
	public void unEnroll(Student estudiante){
		estudiantes.remove(estudiante);
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	   }
			
	public int countStudents(){
	       int totalregistrados = estudiantes.size();
	       return totalregistrados;
	   }
			   
	public int bestGrade(){
	       return 0;
	   }	
}