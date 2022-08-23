package application;

import javafx.beans.property.SimpleStringProperty;


public class Estudiantes {

		private final SimpleStringProperty Carne; 
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

		public String getCarne() {
			return Carne.get();
		}
		public void setCarne(String x) {
			Carne.set(x);
		}
		public String getName() {
			return name.get();
		}
		public void setName(String x) {
			name.set(x);
		}
		public String getSecond() {
			return second.get();
		}
		public void setSecond(String x) {
			second.set(x);
		}
		public String getEmail() {
			return email.get();
		}
		public void setEmail(String x) {
			email.set(x);
		}
		public String getPhone() {
			return phone.get();
		}
		public void setPhone(String x) {
			phone.set(x);
		}
		public String getKindStudent() {
			return KindStudent.get();
		}
		public void setKindStudent(String x) {
			KindStudent.set(x);
		}
		public String getExamsAverage() {
			return ExamsAverage.get();
		}
		public void setExamsAverage(String x) {
			ExamsAverage.set(x);
		}
		public String getQuizAverage() {
			return QuizAverage.get();
		}
		public void setQuizAverage(String x) {
			QuizAverage.set(x);
		}
		public String getAssigmentsAverage() {
			return AssigmentsAverage.get();
		}
		public void setAssigmentsAverage(String x) {
			AssigmentsAverage.set(x);
		}
		public String getProject1() {
			return project1.get();
		}
		public void setProject1(String x) {
			project1.set(x);
		}
		public String getProject2() {
			return project2.get();
		}
		public void setProject2(String x) {
			project2.set(x);

		}
		public String getProject3() {
			return project3.get();
		}
		public void setProject3(String x) {
			project3.set(x);
		}
		public String getProjectsAverage() {
			return projectsAverage.get();
		}
		public void setProjectsAverage(String x) {
			projectsAverage.set(x);
		}
		public String getAverage() {
			return Average.get();
		}
		public void setAverage(String x) {
			Average.set(x);
		}
		public String getFinalCal() {
			return finalCal.get();
		}
		public void setFinalCal(String x) {
			finalCal.set(x);
		}
		public String Average(int parseInt, int parseInt2, int parseInt3) {
			
			return null;
		}
		public String Average(String str, String str2, String str3) {
			
			return null;
		}
}
