
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student emmanuel = new Student("Emmanuel","Aguilar",2024,100,1995);
	    Student diego = new Student("Diego","Tavera",2020,70,1995);
	    Student karla = new Student("Karla", "Martinez",2023,50,1997);
	    
	    Courses Java = new Courses("Java","JC",2025);
	    Courses Javascript = new Courses("Javascript","Fernando",2024);
	    Courses Mentoria = new Courses("Mentoria","Nancy",2023);
        
        emmanuel.printFullName();
        diego.printFullName();
        karla.printFullName();
        
        System.out.println("¿Emmanuel aprobó? " + emmanuel.isApproved());
        System.out.println("¿Diego aprobó? " + diego.isApproved());
        System.out.println("¿Karla aprobó? " + karla.isApproved());
        
        emmanuel.changeYearIfApproved();
        diego.changeYearIfApproved();
        karla.changeYearIfApproved();
	
        Java.enroll(emmanuel);
        Java.enroll(diego);
        
        Javascript.enroll(karla);
        
        Mentoria.enroll(emmanuel);
        Mentoria.enroll(diego);
        Mentoria.enroll(karla);
        
        System.out.println("El total de estudiantes en Java es: "+ Java.countStudents());
        System.out.println("El total de estudiantes en Javascript es: "+ Javascript.countStudents());
        System.out.println("El total de estudiantes en Mentoria es: "+ Mentoria.countStudents());
        
        System.out.println("La mejor calificación de Mentoria es: "+ Mentoria.bestGrade());
	
        Student[] nuevosEstudiantesOverload = {emmanuel,diego,karla};
        
        Java.enroll(nuevosEstudiantesOverload);
        
        System.out.println("El total de estudiantes en Java es: "+Java.countStudents());
 	}//Main
}//Class
