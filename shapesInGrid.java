// PSEUDOCODE
/* 
 * This class will utilize JavaFX to create a program that shows a square, circle, and cross.
 */


package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;


public class Program1 extends Application  {
	
	@Override
	public void start(Stage primaryStage) {
		
		//Create a grid pane and set the properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_LEFT);
		
		//set margins around the grid
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		
		//horizontal and vertical gap
		pane.setHgap(10);
		pane.setVgap(10);
		
		//create and set properties for the circle
		Circle circle = new Circle(25);
		circle.setStyle("-fx-stroke: red; -fx-fill: red;");

		
		//Create a square
		Rectangle square = new Rectangle(0,0,50,50);
		square.setStyle("-fx-stroke: blue; -fx-fill: blue;");
		
		//Create a horizontal line
		Line hLine = new Line(-50/3,-50/4,50/3,-50/4);
		hLine.setStyle("-fx-stroke: green; -fx-fill: green;");
		hLine.setStrokeWidth(5);
		
		//Create a vertical line
		Line vLine = new Line(0,-25,0,25);
		vLine.setStyle("-fx-stroke: green; -fx-fill: green;");
		vLine.setStrokeWidth(5);
		
		//Place nodes in the pane
		pane.add(circle,1,1);
		pane.add(square, 0, 0);
		pane.add(new Group(hLine,vLine), 2, 2);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Shapes in Grid");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	

}



