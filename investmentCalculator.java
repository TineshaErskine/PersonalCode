//Tinesha Erskine SPC ID#2430820
// PSEUDOCODE
/* 
 * This class 
 */

package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	
	//Declare fields and buttons
	TextField tfInvestmentAmount = new TextField();
	TextField tfNumberOfYears = new TextField();
	TextField tfAnnualInterestRate = new TextField();
	TextField tfFutureValue = new TextField();
	Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) {
		
		//Create a grid pane
		GridPane gridPane = new GridPane();
		
		//Set horizontal and vertical gap
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		//Add labels and fields to the grid
		gridPane.add(new Label("Investment Amount:"), 0, 0);
		gridPane.add(tfInvestmentAmount, 1, 0);
		gridPane.add(new Label("Number of Years:"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
		gridPane.add(tfAnnualInterestRate, 1, 2);
		gridPane.add(new Label("Future value:"), 0, 3);
		gridPane.add(tfFutureValue, 1, 3);
		gridPane.add(btCalculate, 1, 5);

		//Set properties
		gridPane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		//Create a handler to process events
		//btCalculate.setOnAction(e -> calculateFutureValue());	
		btCalculate.setOnAction((ActionEvent e) -> {
			calculateFutureValue();
		});
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(gridPane,300,200);
		primaryStage.setTitle("Exercise15_05");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void calculateFutureValue() {
		
		double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
		double interestRate = Double.parseDouble(tfAnnualInterestRate.getText());
		int years = Integer.parseInt(tfNumberOfYears.getText());
	
		//Calculate future value
		double futureValue = investmentAmount * Math.pow((1 + interestRate/100),(years));
		
		//Display future value
		tfFutureValue.setText(String.format("$%.2f",futureValue));
		System.out.println(investmentAmount);
		System.out.println(years);
		System.out.println(interestRate);
		System.out.println(futureValue);
	}
		
		
