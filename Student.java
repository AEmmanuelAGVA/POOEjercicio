import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    List<Courses> registrados = new ArrayList<>(  );
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//Constructor para la clase Person, se tienen que llamar igual el constructor y la clase
	
    Student emmanuel = new Student("Emmanuel","Aguilar",2024,100,1995);
    Student diego = new Student("Diego","Tavera",2020,70,1995);
    Student karla = new Student("Karla", "Martinez",2023,50,1997);

	public Student(String firstName, String lastName) {
		this (firstName,lastName,0,1,1999);
	}
	
	public String toString() {
		return "Estudiante {Nombre =" + lastName + " Apellido=" + lastName + " Registro=" + registration + 
				"Grado=" + grade + " Año= " + year + " }";
	}
	
    public void printFullName(){
        System.out.println(firstName + lastName );
     }

     public boolean isApproved(){
         if(grade >= 60) {
        	 return true;
         }else {
        	 return false; 
         }
    	 //TODO implement: should return true if grade >= 60
     }

     public int changeYearIfApproved(){
    	 if(isApproved() == true) {
    		 year = year + 1;
    		 System.out.println("Congratulations");
    		 return year;
    	 }else {
    		 return year;
    	 }

     }
 	public void enroll(Courses course){
		registrados.add(course);   
		//TODO add the student to the collection
	   }
	
	public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	   }
	
	public int countStudents(){
	       //TODO implement
	       return 0;
	   }
	   
	public int bestGrade(){
	       //TODO implement
	       return 0;
	   }
}
