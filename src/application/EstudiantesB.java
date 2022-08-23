package application;
/**
 * Esta es una clase hija de la clase estudiante, difiere en comportamiento por el tipo de estudiante
 * @author isaac
 *
 */
public class EstudiantesB extends Estudiantes{
	/**
	 * Constructor de la clase
	 * @param Carne - Identificador de un estudiante
	 * @param name - Nombre del estudiante
	 * @param second - Apellido del Estudiante
	 * @param email - Correo del estudiante
	 * @param phone - N�mero de t�lefono del estudiante
	 * @param KindStudent - Tipo de Estudiante
	 * @param ExamsAverage - Promedio de Examenes
	 * @param QuizAverage - Promedio de Quices
	 * @param AssigmentsAverage - Promedio de Taras
	 * @param project1 -Nota proyecto 1
	 * @param project2 -Nota proyecto 2
	 * @param project3 -Nota proyecto 2
	 * @param projectsAverage -Promedio de proyectos
	 * @param Average -Promedio de tareas, quices y ex�menes. 
	 * @param finalCal -Nota promedio final 
	 */
	protected EstudiantesB(String Carne, String name, String second, String email, String phone, String KindStudent,
			String ExamsAverage, String QuizAverage, String AssigmentsAverage, String project1, String project2,
			String project3, String projectsAverage, String Average, String finalCal) {
		super(Carne, name, second, email, phone, KindStudent, ExamsAverage, QuizAverage, AssigmentsAverage, project1, project2,
				project3, projectsAverage, Average, finalCal);
	}
	/**
	 * Calcula el promedio de proyectos 
	 * @param str -Nota promedio proyecto 1
	 * @param str2 -Nota promedio proyecto2
	 * @param str3 -Nota promedio proyecto 2
	 * @return nota promedio de proyectos
	 */
	public String Average (String Project1, String Project2, String Project3) {//N�tese que este m�todo, existe tambi�n en la clase padre
																			   //difiere en la utilidad, puesto que el m�todo que pertence 
																			   //a la s�per clase (Estudiantes) no d�vuelve nada, en este se
                                                                               //hizo un cambio al m�todo original, para darle utilidad, es a esto a lo 
                                                                               //se le conoce como sobreescritura.
		return  Integer.toString((Integer.parseInt(Project1)+Integer.parseInt(Project2)+Integer.parseInt(Project3))/3) ;
	}

}
