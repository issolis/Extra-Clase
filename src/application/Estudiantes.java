package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * Esta es la clase en donde se permite la instanciación de los objetos de tipo estudiante, corresponde a una abstracción de lo que 
 * implica en términos generales, los datos que debería poseer un estudainte, como nombre, correo, promedios, etc; 
 * @author Isaac Solís 
 */
public class Estudiantes { //En este punto se crea una abstracción, que es una forma homóloga para referirse a una clase, que en términos 
	                       //generales corresponde a la manera en la que se aprecia algún objeto de estudio, para el presente, estudiantes, los cuales
	                       //gozan de una serie de características, o atributas, que corresponden en realidad a las distintas variables que se definen en 
	                       //el método constructor

		private final SimpleStringProperty Carne; //Esto es un claro ejemplo de una característica de un estudiante, el carné, que corresponde
		                                          //en términos de programación a un atributo. 
		private final SimpleStringProperty name; 
		private final SimpleStringProperty email; 
		private final SimpleStringProperty phone; 
		private final SimpleStringProperty KindStudent; 
		private final SimpleStringProperty ExamsAverage; 
		private final SimpleStringProperty QuizAverage; 
		private final SimpleStringProperty AssigmentsAverage;
		private final SimpleStringProperty project1; 
		private final SimpleStringProperty project2; 
		private final SimpleStringProperty project3;
		private final SimpleStringProperty second; 
		private final SimpleStringProperty projectsAverage; 
		private final SimpleStringProperty Average; 
		private final SimpleStringProperty finalCal; 
		/**
		 * Constructor de la clase
		 * @param Carne - Identificador de un estudiante
		 * @param name - Nombre del estudiante
		 * @param second - Apellido del Estudiante
		 * @param email - Correo del estudiante
		 * @param phone - Número de télefono del estudiante
		 * @param KindStudent - Tipo de Estudiante
		 * @param ExamsAverage - Promedio de Examenes
		 * @param QuizAverage - Promedio de Quices
		 * @param AssigmentsAverage - Promedio de Taras
		 * @param project1 -Nota proyecto 1
		 * @param project2 -Nota proyecto 2
		 * @param project3 -Nota proyecto 2
		 * @param projectsAverage -Promedio de proyectos
		 * @param Average -Promedio de tareas, quices y exámenes. 
		 * @param finalCal -Nota promedio final 
		 */
		protected Estudiantes (String Carne, String name, String second, String email, String phone, 
				String KindStudent, String ExamsAverage, String QuizAverage, String AssigmentsAverage, String project1, String project2, String project3,
				String projectsAverage, String Average, String finalCal) {
			this.Carne= new SimpleStringProperty(Carne); 
			this.name= new SimpleStringProperty(name);
			this.second= new SimpleStringProperty(second);
			this.email= new SimpleStringProperty(email);
			this.phone= new SimpleStringProperty(phone);
			this.KindStudent= new SimpleStringProperty(KindStudent);
			this.ExamsAverage= new SimpleStringProperty(ExamsAverage);
			this.QuizAverage= new SimpleStringProperty(QuizAverage);
			this.AssigmentsAverage= new SimpleStringProperty(AssigmentsAverage);
			this.project1= new SimpleStringProperty(project1);
			this.project3= new SimpleStringProperty(project3);
			this.project2= new SimpleStringProperty(project2);
			this.projectsAverage= new SimpleStringProperty(projectsAverage); 
			this.Average= new SimpleStringProperty(Average); 
			this.finalCal= new SimpleStringProperty(finalCal); 

		}
		/**
		 * Obtiende el valor asignado al parámetro "Carne"
		 * @return - Devuélve el valor asignado al parámetro "Carne"
		 */
		public String getCarne() { //Sencillamente para ejemplificar el concepto sobre entendido de lo que es un método, aquí se tiene uno,
			                       //es un apartado de código que goza de alguna función en específica, éste sencillamente accede al valor del atributo
			                       //carne, y además, puede también poseer variables locales, que sólo funcionan dentro de sí. 
			return Carne.get();
		}
		/**
		 * Envía un valor a la variable "Carne"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setCarne(String x) {
			Carne.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "name"
		 * @return - Devuélve el valor asignado al parámetro "name"
		 */
		public String getName() {
			return name.get();
		}
		/**
		 * Envía un valor a la variable "name"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setName(String x) {
			name.set(x);
		}
		/**
		 * Obtiende un valor asignado al parámetro "Second"
		 * @return - Devuélve el valor asignado al parámetro "Second"
		 */
		public String getSecond() {
			return second.get();
		}
		/**
		 * Envía un valor a la variable "Second"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setSecond(String x) {
			second.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "email"
		 * @return - Devuélve el valor asignado al parámetro "email"
		 */
		public String getEmail() {
			return email.get();
		}
		/**
		 * Envía un valor a la variable "email"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setEmail(String x) {
			email.set(x);
		}
		/**
		 * Obtiende un valor asignado al parámetro "phone"
		 * @return - Devuélve el valor asignado al parámetro "phone"
		 */
		public String getPhone() {
			return phone.get();
		}
		/**
		 * Envía un valor a la variable "phone"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setPhone(String x) {
			phone.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "KindStudent"
		 * @return - Devuélve el valor asignado al parámetro "KindStudent"
		 */
		public String getKindStudent() {
			return KindStudent.get();
		}
		/**
		 * Envía un valor a la variable "KindStudent"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setKindStudent(String x) {
			KindStudent.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "ExamsAverage"
		 * @return - Devuélve el valor asignado al parámetro "ExamsAverage"
		 */
		public String getExamsAverage() {
			return ExamsAverage.get();
		}
		/**
		 * Envía un valor a la variable "ExamAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setExamsAverage(String x) {
			ExamsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "QuizAverage"
		 * @return - Devuélve el valor asignado al parámetro "QuizAverage"
		 */
		public String getQuizAverage() {
			return QuizAverage.get();
		}
		/**
		 * Envía un valor a la variable "QuizAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setQuizAverage(String x) {
			QuizAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "AssigmentsAverage"
		 * @return - Devuélve el valor asignado al parámetro "AssigmentsAverage"
		 */
		public String getAssigmentsAverage() {
			return AssigmentsAverage.get();
		}
		/**
		 * Envía un valor a la variable "AssigmentsAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setAssigmentsAverage(String x) {
			AssigmentsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "project1"
		 * @return - Devuélve el valor asignado al parámetro "Project1"
		 */
		public String getProject1() {
			return project1.get();
		}
		/**
		 * Envía un valor a la variable "project1"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject1(String x) {
			project1.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "project2"
		 * @return - Devuélve el valor asignado al parámetro "Project2"
		 */
		public String getProject2() {
			return project2.get();
		}
		/**
		 * Envía un valor a la variable "project2"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject2(String x) {
			project2.set(x);

		}
		/**
		 * Obtiende el valor asignado al parámetro "project3"
		 * @return - Devuélve el valor asignado al parámetro "Project3"
		 */
		public String getProject3() {
			return project3.get();
		}
		/**
		 * Envía un valor a la variable "project3"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject3(String x) {
			project3.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "projectsAverage"
		 * @return - Devuélve el valor asignado al parámetro "ProjectAverage"
		 */
		public String getProjectsAverage() {
			return projectsAverage.get();
		}
		/**
		 * Envía un valor a la variable "projectsAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProjectsAverage(String x) {
			projectsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "Average"
		 * @return - Devuélve el valor asignado al parámetro "Average"
		 */
		public String getAverage() {
			return Average.get();
		}
		/**
		 * Envía un valor a la variable "Average"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setAverage(String x) {
			Average.set(x);
		}
		/**
		 * Obtiende el valor asignado al parámetro "finalCal"
		 * @return - Devuélve el valor asignado al parámetro "finalCal"
		 */
		public String getFinalCal() {
			return finalCal.get();
		}
		/**
		 * Envía un valor a la variable"finalCal"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setFinalCal(String x) {
			finalCal.set(x);
		}
		/**
		 * Calcula el promedio de tareas,quices y exámenes para estudiantes de tipo A
		 * @param parseInt -Nota promedio Exámenes
		 * @param parseInt2-Nota promedio Tareas
		 * @param parseInt3-Nota promedio Quices
		 * @return null
		 */
		public String Average(int parseInt, int parseInt2, int parseInt3) {
			return null;
		}
		/**
		 * Calcula el promedio de proyectos para estudiantes de tipo B
		 * @param str -Nota promedio proyecto 1
		 * @param str2 -Nota promedio proyecto2
		 * @param str3 -Nota promedio proyecto 2
		 * @return null
		 */
		public String Average(String str, String str2, String str3) {//Nótese que en la línea 289 se define un método que se llama exactamente
			                                                         //igual que a este, de la línea 293, lo único que difiere entre uno y otro,
			                                                         // es el tipo de dato, a esto es lo que se le conoce como sobreescritura, 
			                                                         // dos métodos dentro de una misma clase, diferenciados por sus parámetros. 

			
			return null;
		}
}
