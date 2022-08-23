package application;

public class EstudiantesB extends Estudiantes{

	protected EstudiantesB(String Carne, String name, String second, String email, String phone, String KindStudent,
			String ExamsAverage, String QuizAverage, String AssigmentsAverage, String project1, String project2,
			String project3, String projectsAverage, String Average, String finalCal) {
		super(Carne, name, second, email, phone, KindStudent, ExamsAverage, QuizAverage, AssigmentsAverage, project1, project2,
				project3, projectsAverage, Average, finalCal);
	}
	public String Average (String Project1, String Project2, String Project3) {
		return  Integer.toString((Integer.parseInt(Project1)+Integer.parseInt(Project2)+Integer.parseInt(Project3))/3) ;
	}

}
