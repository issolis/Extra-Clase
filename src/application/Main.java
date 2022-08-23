package application;


import java.io.File;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.collections.ObservableList;


public class Main extends Application{
	@Override 
	public void init() {

	}

	@Override 
	public void start(Stage mainWindow) {

		VBox root= new VBox(); 

		Label file= new Label("Table: "); 
		file.setFont(new Font(15)); 
		Button enter= new Button("Search file");

		TableView<Estudiantes> estudiantes= new TableView(); 
		estudiantes.setMinSize(500, 500); 
		Estudiantes e1= new Estudiantes(null, null, null, null, null, null, null, null, null, null, null, null); 

		Estudiantes todos[]= new Estudiantes[1]; 
		todos [0]=e1;

		final ObservableList<Estudiantes> info= FXCollections.observableArrayList( todos
				);






		TableColumn Students= new TableColumn ("Students");



		TableColumn<Estudiantes, String> Carne= new TableColumn<>("Carne"); 
		Carne.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("Carne"));
		Carne.setMinWidth( estudiantes.getMinWidth()/2);

		TableColumn<Estudiantes, String> name= new TableColumn<>("Name"); 
		name.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("name"));
		name.setMinWidth( estudiantes.getMinWidth()/2);



		estudiantes.setItems(info); 
		Students.getColumns().addAll(Carne, name); 
		estudiantes.getColumns().add(Students);










		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				FileChooser fc= new FileChooser(); 
				File file= fc.showOpenDialog(mainWindow); 
				System.out.print(file);

			}
		}); 
		enter.setCursor(Cursor.HAND);
		enter.setFont(new Font(15));
		root.getChildren().addAll( enter, file, estudiantes); 

		VBox.setMargin(file, new Insets(10, 10 , 10, 10));
		VBox.setMargin(enter, new Insets(10, 10 , 0, 10));
		Scene scene= new Scene(root, 400, 400 );
		mainWindow.setTitle("Notas de Estudiantes");
		mainWindow.setScene(scene);
		mainWindow.show(); 



	}
	@Override 
	public void stop() {

	}
	public static void main (String args[]) {
		launch(args); 

	}
	public static class Estudiantes{
		private final SimpleStringProperty Carne; 
		private final SimpleStringProperty name; 
		private final SimpleStringProperty lastname;
		private final SimpleStringProperty email; 
		private final SimpleStringProperty phone; 
		private final SimpleStringProperty KindStudent; 
		private final SimpleStringProperty ExamsAverage; 
		private final SimpleStringProperty QuizAverage; 
		private final SimpleStringProperty AssigmentsAverage;
		private final SimpleStringProperty project1; 
		private final SimpleStringProperty project2; 
		private final SimpleStringProperty project3;

		private Estudiantes (String Carne, String name, String lastname, String email, String phone, 
				String KindStudent, String ExamsAverage, String QuizAverage, String AssigmentsAverage, String project1, String project2, String project3) {
			this.Carne= new SimpleStringProperty(Carne); 
			this.name= new SimpleStringProperty(name);
			this.lastname= new SimpleStringProperty(lastname);
			this.email= new SimpleStringProperty(email);
			this.phone= new SimpleStringProperty(phone);
			this.KindStudent= new SimpleStringProperty(KindStudent);
			this.ExamsAverage= new SimpleStringProperty(ExamsAverage);
			this.QuizAverage= new SimpleStringProperty(QuizAverage);
			this.AssigmentsAverage= new SimpleStringProperty(AssigmentsAverage);
			this.project1= new SimpleStringProperty(project1);
			this.project3= new SimpleStringProperty(project3);
			this.project2= new SimpleStringProperty(project2);

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
		public String getLastName() {
			return lastname.get();
		}
		public void setLastname(String x) {
			lastname.set(x);
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
		public String getproject1() {
			return project1.get();
		}
		public void setproject1(String x) {
			project1.set(x);
		}
		public String getproject2() {
			return project2.get();
		}
		public void setproject2(String x) {
			project2.set(x);

		}
		public String getproject3() {
			return project3.get();
		}
		public void setproject3(String x) {
			project3.set(x);
		}
	}
}

