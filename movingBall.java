// PSEUDOCODE
/* 
 * This class class will have 4 buttons each a different direction.
 * It will also have a circle shape that will respond to the button presses 
 * by going in that specific direction.
*/

package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		//Hold buttons in a Hbox
		HBox hBox = new HBox();
		hBox.setSpacing(5);
		hBox.setAlignment(Pos.CENTER);
	
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");
		
		hBox.getChildren().add(left);
		hBox.getChildren().add(right);
		hBox.getChildren().add(up);
		hBox.getChildren().add(down);
		
		//Set pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		//create and set properties for the ball
		Circle ball = new Circle(50,50,25);
		ball.setStyle("-fx-stroke: black; -fx-fill: transparent;");
		pane.getChildren().add(ball);

		
		//Create and register handlers for each button using lambda expression
		left.setOnAction((ActionEvent e) -> {
			if(ball.getBoundsInLocal().getMinX() >= 0 ) {
				ball.setCenterX(ball.getCenterX()-20);
			}
		});
		
		right.setOnAction((ActionEvent e) -> {
			if(ball.getBoundsInLocal().getMaxX() <= 350) {
				ball.setCenterX(ball.getCenterX()+20);
			}
		});
		
		up.setOnAction((ActionEvent e) -> {
			if(ball.getBoundsInLocal().getMaxY() >= 50) {
				ball.setCenterY(ball.getCenterY()-20);
			}
		});
		
		down.setOnAction((ActionEvent e) -> {
			if(ball.getBoundsInLocal().getMinY() <= 150) {
				ball.setCenterY(ball.getCenterY()+20);
			}
		});
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 350,200);
		primaryStage.setTitle("Shapes in Grid");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
