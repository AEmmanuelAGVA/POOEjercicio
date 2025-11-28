public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//Constructor para la clase Person, se tienen que llamar igual el constructor y la clase
	
	public Student(String firstName, String lastName) {
		this (firstName,lastName,0,1,1999);
	}
	
	public Student(String lastName, int grade, int year) {
		this ("Generico",lastName,1,grade,year);
	}
	
	public String toString() {
		return "Estudiante {Nombre =" + firstName + " Apellido=" + lastName + " Registro=" + registration + 
				"Grado=" + grade + " Año= " + year + " }";
	}
	
    public void printFullName(){
        System.out.println(firstName + " " + lastName );
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
    		 System.out.println("Not pass :(");
    		 return year;
    	 }

     }
}
