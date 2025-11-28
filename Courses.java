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
		
	}//Course

	public void enroll(Student estudiante){
		estudiantes.add(estudiante);   
	   }//enRoll
	
	public void unEnroll(Student estudiante){
		estudiantes.remove(estudiante);
	   }//unEnroll
			
	public int countStudents(){
	       int totalregistrados = estudiantes.size();
	       return totalregistrados;
	   }//CountStudent
			   
	public int bestGrade(){
		int gradoMax = 0;
		for (Student student : estudiantes) {
			if(gradoMax < student.grade) {
				gradoMax = student.grade;
			}//IF
		}//For
	       return gradoMax;
	   }//BestGrade
	
	public void enroll(Student[] students){
	    for (Student student : students) {
	    	enroll(student);
		}
	   }//Overload
}//Class