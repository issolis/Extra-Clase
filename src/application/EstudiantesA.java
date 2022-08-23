package application;

public class EstudiantesA extends Estudiantes {

	protected EstudiantesA(String Carne, String name, String second, String email, String phone, String KindStudent,
			String ExamsAverage, String QuizAverage, String AssigmentsAverage, String project1, String project2,
			String project3, String projectsAverage, String Average, String finalCal) {
		super(Carne, name, second, email, phone, KindStudent, ExamsAverage, QuizAverage, AssigmentsAverage, project1, project2,
				project3, projectsAverage, Average, finalCal);
		
	}
	public String Average (int Exam, int Quiz, int Assigment) {
		return  Integer.toString((Exam+Quiz+Assigment)/3) ;
	}

}
