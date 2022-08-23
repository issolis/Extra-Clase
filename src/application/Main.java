package application;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
	private String eachVariable[]; 
	private  String infor[];
	private ObservableList<Estudiantes> infom; 
	private TableView<Estudiantes> estudiantes= new TableView();
	private TableColumn<Estudiantes, String> finalC; 
	private TableColumn<Estudiantes, String> Average; 
	private TableColumn<Estudiantes, String> projectAverage; 
	private TableColumn Students; 
	private Scene scene; 


	public void separetion(String info[]) {
		eachVariable= new String[15]; 
		int x=0; int y=0; int z=0; 
		Estudiantes todos[]=new Estudiantes[info.length];
		for (int i=0; i<info.length; i++)
		{
			for (int j=0; j<info[i].length(); j++) {

				if (info[i].charAt(y)==';'){

					eachVariable[z]=info[i].substring(x, j); 
					x=j+1; 
					z++;
				}
				if (j==info[i].length()-1) {
					eachVariable[z]=info[i].substring(x); 
				}
				y++; 
			}
			if( eachVariable[5].equals("A")){
				todos[i]= new EstudiantesA(eachVariable[0], eachVariable[1], eachVariable[2], eachVariable[3], eachVariable[4], 
						eachVariable[5], eachVariable[6], eachVariable[7], eachVariable[8], eachVariable[9], eachVariable[10], 
						eachVariable[11], "", "", "");
				todos[i].setAverage(todos[i].Average(Integer.parseInt(eachVariable[6]), Integer.parseInt(eachVariable[7]), Integer.parseInt(eachVariable[8])));
				todos[i].setFinalCal(Integer.toString((Integer.parseInt(todos[i].getAverage())+(Integer.parseInt(eachVariable[9])+
						Integer.parseInt(eachVariable[10])+Integer.parseInt(eachVariable[11]))/3)/2));
			}
			else if(eachVariable[5].equals("B")) {
				todos[i]= new EstudiantesB(eachVariable[0], eachVariable[1], eachVariable[2], eachVariable[3], eachVariable[4], 
						eachVariable[5], eachVariable[6], eachVariable[7], eachVariable[8], eachVariable[9], eachVariable[10], 
						eachVariable[11], "", "", "");
				todos[i].setProjectsAverage(todos[i].Average(eachVariable[9], eachVariable[10], eachVariable[11]));
				todos[i].setFinalCal(Integer.toString((Integer.parseInt(todos[i].getProjectsAverage())+(Integer.parseInt(eachVariable[6])+ Integer.parseInt(eachVariable[7])+
						Integer.parseInt(eachVariable[8]))/3)/2 ));
			}x=0; z=0; y=0;
		}
		Students.getColumns().addAll(projectAverage, Average, finalC); 
		infom=FXCollections.observableArrayList(todos); 
		estudiantes.setItems(infom);
	
	}
	public void Filereader(String name)
	{

		try {
			String line;
			BufferedReader reader1 = new BufferedReader(new FileReader(name));
			int x=-1; String line1="";
			while(line1!=null) {
				x++; 
				line1=reader1.readLine();
			}
			reader1.close();
			BufferedReader reader = new BufferedReader(new FileReader(name));
			infor= new String[x-1]; x=0;
			line= reader.readLine(); line= reader.readLine();
			while(line!=null) {

				infor[x]=line; x++;
				line=reader.readLine();
			}
			reader.close(); 
			line=null; 

		}catch(Exception error){

		}
		separetion(infor); 
	}
	@Override 
	public void start(Stage mainWindow) {

		VBox root= new VBox(); 

		Label file= new Label("Table: "); 
		file.setFont(new Font(15)); 
		Button enter= new Button("Search file");

		estudiantes.setMinSize(1450, 600); 

		Students= new TableColumn ("Students");

		TableColumn<Estudiantes, String> Carne= new TableColumn<>("Carne"); 
		Carne.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("Carne"));
		Carne.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> name= new TableColumn<>("Name"); 
		name.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("name"));
		name.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> lastname= new TableColumn<>("Lastname"); 
		lastname.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("second"));
		lastname.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> email= new TableColumn<>("Email"); 
		email.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("email"));
		email.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> phone= new TableColumn<>("Phone"); 
		phone.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("phone"));
		phone.setMinWidth( estudiantes.getMinWidth()/15);


		TableColumn<Estudiantes, String> kind= new TableColumn<>("Type"); 
		kind.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("KindStudent"));
		kind.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> exams= new TableColumn<>("Exam Average"); 
		exams.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("ExamsAverage"));
		exams.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> quiz= new TableColumn<>("Quiz Average"); 
		quiz.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("QuizAverage"));
		quiz.setMinWidth( estudiantes.getMinWidth()/12);

		TableColumn<Estudiantes, String> assigment= new TableColumn<>("Assigment Average"); 
		assigment.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("AssigmentsAverage"));
		assigment.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> project1= new TableColumn<>("Project #1"); 
		project1.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("project1"));
		project1.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> project2= new TableColumn<>("Project #2"); 
		project2.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("project2"));
		project2.setMinWidth( estudiantes.getMinWidth()/15);

		TableColumn<Estudiantes, String> project3= new TableColumn<>("Project #3"); 
		project3.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("project3"));
		project3.setMinWidth( estudiantes.getMinWidth()/15);

		projectAverage= new TableColumn<>("Project Average"); 
		projectAverage.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("projectsAverage"));
		projectAverage.setMinWidth( estudiantes.getMinWidth()/15);

		Average= new TableColumn<>("Average (E,Q,A"); 
		Average.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("Average"));
		Average.setMinWidth( estudiantes.getMinWidth()/15);

		finalC= new TableColumn<>("Final Calification"); 
		finalC.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("finalCal"));
		finalC.setMinWidth( estudiantes.getMinWidth()/15);

		estudiantes.setItems(infom); 

		Students.getColumns().addAll(Carne, name, lastname, email, phone, kind, exams, quiz, assigment, project1, project2, project3); 
		estudiantes.getColumns().add(Students);


		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				FileChooser fc= new FileChooser(); 
				File file= fc.showOpenDialog(mainWindow); 
				Filereader(file.toString()); 

			}
		}); 
		enter.setCursor(Cursor.HAND);
		enter.setFont(new Font(15));
		root.getChildren().addAll( enter, file, estudiantes); 

		VBox.setMargin(file, new Insets(10, 10 , 10, 10));
		VBox.setMargin(enter, new Insets(10, 10 , 0, 10));
		scene= new Scene(root,  1470, 600 );
		mainWindow.setTitle("Assigment");
		mainWindow.setScene(scene);
		mainWindow.show(); 
	}
	public static void main (String args[]) {
		launch(args); 

	}

}


