package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


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
		
		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
			}
		}); 
		enter.setCursor(Cursor.HAND);
		enter.setFont(new Font(15));
		root.getChildren().addAll( enter, file); 
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
}