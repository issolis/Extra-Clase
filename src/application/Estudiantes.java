package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * Esta es la clase en donde se permite la instanciaci�n de los objetos de tipo estudiante, corresponde a una abstracci�n de lo que 
 * implica en t�rminos generales, los datos que deber�a poseer un estudainte, como nombre, correo, promedios, etc; 
 * @author Isaac Sol�s 
 */
public class Estudiantes { //En este punto se crea una abstracci�n, que es una forma hom�loga para referirse a una clase, que en t�rminos 
	                       //generales corresponde a la manera en la que se aprecia alg�n objeto de estudio, para el presente, estudiantes, los cuales
	                       //gozan de una serie de caracter�sticas, o atributas, que corresponden en realidad a las distintas variables que se definen en 
	                       //el m�todo constructor

		private final SimpleStringProperty Carne; //Esto es un claro ejemplo de una caracter�stica de un estudiante, el carn�, que corresponde
		                                          //en t�rminos de programaci�n a un atributo. 
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
		 * Obtiende el valor asignado al par�metro "Carne"
		 * @return - Devu�lve el valor asignado al par�metro "Carne"
		 */
		public String getCarne() { //Sencillamente para ejemplificar el concepto sobre entendido de lo que es un m�todo, aqu� se tiene uno,
			                       //es un apartado de c�digo que goza de alguna funci�n en espec�fica, �ste sencillamente accede al valor del atributo
			                       //carne, y adem�s, puede tambi�n poseer variables locales, que s�lo funcionan dentro de s�. 
			return Carne.get();
		}
		/**
		 * Env�a un valor a la variable "Carne"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setCarne(String x) {
			Carne.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "name"
		 * @return - Devu�lve el valor asignado al par�metro "name"
		 */
		public String getName() {
			return name.get();
		}
		/**
		 * Env�a un valor a la variable "name"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setName(String x) {
			name.set(x);
		}
		/**
		 * Obtiende un valor asignado al par�metro "Second"
		 * @return - Devu�lve el valor asignado al par�metro "Second"
		 */
		public String getSecond() {
			return second.get();
		}
		/**
		 * Env�a un valor a la variable "Second"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setSecond(String x) {
			second.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "email"
		 * @return - Devu�lve el valor asignado al par�metro "email"
		 */
		public String getEmail() {
			return email.get();
		}
		/**
		 * Env�a un valor a la variable "email"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setEmail(String x) {
			email.set(x);
		}
		/**
		 * Obtiende un valor asignado al par�metro "phone"
		 * @return - Devu�lve el valor asignado al par�metro "phone"
		 */
		public String getPhone() {
			return phone.get();
		}
		/**
		 * Env�a un valor a la variable "phone"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setPhone(String x) {
			phone.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "KindStudent"
		 * @return - Devu�lve el valor asignado al par�metro "KindStudent"
		 */
		public String getKindStudent() {
			return KindStudent.get();
		}
		/**
		 * Env�a un valor a la variable "KindStudent"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setKindStudent(String x) {
			KindStudent.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "ExamsAverage"
		 * @return - Devu�lve el valor asignado al par�metro "ExamsAverage"
		 */
		public String getExamsAverage() {
			return ExamsAverage.get();
		}
		/**
		 * Env�a un valor a la variable "ExamAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setExamsAverage(String x) {
			ExamsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "QuizAverage"
		 * @return - Devu�lve el valor asignado al par�metro "QuizAverage"
		 */
		public String getQuizAverage() {
			return QuizAverage.get();
		}
		/**
		 * Env�a un valor a la variable "QuizAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setQuizAverage(String x) {
			QuizAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "AssigmentsAverage"
		 * @return - Devu�lve el valor asignado al par�metro "AssigmentsAverage"
		 */
		public String getAssigmentsAverage() {
			return AssigmentsAverage.get();
		}
		/**
		 * Env�a un valor a la variable "AssigmentsAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setAssigmentsAverage(String x) {
			AssigmentsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "project1"
		 * @return - Devu�lve el valor asignado al par�metro "Project1"
		 */
		public String getProject1() {
			return project1.get();
		}
		/**
		 * Env�a un valor a la variable "project1"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject1(String x) {
			project1.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "project2"
		 * @return - Devu�lve el valor asignado al par�metro "Project2"
		 */
		public String getProject2() {
			return project2.get();
		}
		/**
		 * Env�a un valor a la variable "project2"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject2(String x) {
			project2.set(x);

		}
		/**
		 * Obtiende el valor asignado al par�metro "project3"
		 * @return - Devu�lve el valor asignado al par�metro "Project3"
		 */
		public String getProject3() {
			return project3.get();
		}
		/**
		 * Env�a un valor a la variable "project3"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProject3(String x) {
			project3.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "projectsAverage"
		 * @return - Devu�lve el valor asignado al par�metro "ProjectAverage"
		 */
		public String getProjectsAverage() {
			return projectsAverage.get();
		}
		/**
		 * Env�a un valor a la variable "projectsAverage"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setProjectsAverage(String x) {
			projectsAverage.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "Average"
		 * @return - Devu�lve el valor asignado al par�metro "Average"
		 */
		public String getAverage() {
			return Average.get();
		}
		/**
		 * Env�a un valor a la variable "Average"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setAverage(String x) {
			Average.set(x);
		}
		/**
		 * Obtiende el valor asignado al par�metro "finalCal"
		 * @return - Devu�lve el valor asignado al par�metro "finalCal"
		 */
		public String getFinalCal() {
			return finalCal.get();
		}
		/**
		 * Env�a un valor a la variable"finalCal"
		 * @param x - variable asignada a acceder y cambiar una variable privada
		 */
		public void setFinalCal(String x) {
			finalCal.set(x);
		}
		/**
		 * Calcula el promedio de tareas,quices y ex�menes para estudiantes de tipo A
		 * @param parseInt -Nota promedio Ex�menes
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
		public String Average(String str, String str2, String str3) {//N�tese que en la l�nea 289 se define un m�todo que se llama exactamente
			                                                         //igual que a este, de la l�nea 293, lo �nico que difiere entre uno y otro,
			                                                         // es el tipo de dato, a esto es lo que se le conoce como sobreescritura, 
			                                                         // dos m�todos dentro de una misma clase, diferenciados por sus par�metros. 

			
			return null;
		}
}
