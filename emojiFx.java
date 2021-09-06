// PSEUDOCODE
/* 
 * This class will utilize JavaFX to create a program that shows an emoji face with glasses.
 */

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;



public class Program2 extends Application  {
	
	@Override
	public void start(Stage primaryStage) {
		
		int n = 50;
		
		//Create a grid pane and set the properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		//set margins around the grid
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		
		//horizontal and vertical gap
		pane.setHgap(10);
		pane.setVgap(10);
		
		//create and set properties for the circle
		Circle circle = new Circle(n);
		circle.setStyle("-fx-stroke: yellow; -fx-fill: yellow;");
		
		//Create a ellipse for eyes
		Ellipse lEllipse = new Ellipse(-n/3,-n/4,5,8);
		lEllipse.setStyle("-fx-stroke: brown; -fx-fill: brown;");
		
		//Create a ellipse for eyes
		Ellipse rEllipse = new Ellipse(n/3,-n/4,5,8);
		rEllipse.setStyle("-fx-stroke: brown; -fx-fill: brown;");
		
		//create an arch for a smile
		Arc arc = new Arc(0,0,n/3,n/2,-125,70);
		arc.setStyle("-fx-stroke: brown; -fx-stroke-width: 2; -fx-fill: transparent;");
		
		//create and set properties for the glasses
		Circle lCircle = new Circle(-n/2, -n/4, n/2.5);
		lCircle.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: transparent;");
		
		//create and set properties for the glasses
		Circle rCircle = new Circle(n/2, -n/4, n/2.5);
		rCircle.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: transparent;");
		
		//Create a horizontal line for glasses
		Line hLine = new Line(-n/11, -n/4 , n/11, -n/4);
		hLine.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: black;");
		hLine.setStrokeWidth(1);
		
		
		//Group the circles and line together to make glasses
		Group glasses = new Group(lCircle,rCircle,hLine);
		
		//Place nodes in the pane
		pane.add(new Group(circle,lEllipse,rEllipse,glasses,arc), 0, 0);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Emoji");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
