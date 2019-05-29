package yeet;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Interface extends Application{
	
	@Override
	public void start(Stage arg0) throws Exception {
		//making the basic layout using a flow pane and a static width, after this ill put the flow pane in a borderpane for easy layout;
		FlowPane grid = new FlowPane();
		grid.setMaxWidth(630);
		grid.setMinWidth(630);
		grid.setMaxHeight(630);
		grid.setMinHeight(630);
		BorderPane layout = new BorderPane();
		//making the button that will send an array to the background running on a separate thread so the interface wont lock up;
		Button startSolve = new Button("Solve!");
		//after that the vbox that will hold a label and ,maybe a progress bar;
		VBox infoHolder = new VBox();
		//after this ill need to fill the grid width areas to fill in, ill use textarea's for this however ill need to find a way to limit the input for these areas;
		ArrayList<TextArea> fields = new ArrayList<TextArea>();
		//to fill the grid ill use a array with 9*9=81 spaces;
		//to put all the fields in ill use a for loop;
		for(int i = 0; 81 > i; i++) {
			fields.add(new TextArea());
			grid.getChildren().add(fields.get(i));
			fields.get(i).setText("");
			//if all went well i can now set the properties for every area later i will do this in the css but for now ill do it here;
			fields.get(i).setMaxWidth(70);
			fields.get(i).setMaxHeight(70);
			fields.get(i).setMinWidth(70);
			fields.get(i).setMinHeight(70);
			fields.get(i).setFont(Font.font("Verdana", FontWeight.BOLD, 35));
			limitText(fields.get(i));
			//checking if cells are full;
		}
		
		infoHolder.getChildren().addAll(startSolve);
		infoHolder.setAlignment(Pos.CENTER);
		
		layout.setCenter(grid);
		layout.setBottom(infoHolder);
		
		//making basic stage and scene
		Stage primaryStage = new Stage();
		primaryStage.setScene(new Scene(layout, grid.getMaxWidth(), grid.getMaxHeight() + 40));
		primaryStage.setResizable(false);
		primaryStage.show();
		
		//here is the button listener that will wait for a press, this will send a signal to the background Thread;
		startSolve.setOnAction(e ->{
			new Thread() {
				public void run() {
					Solve getAnswer = new Solve();
					getAnswer.solve(fields);
				}
			}.start();
		});
	}

	//method that checks max limit on all the cells in the grid and also only allows input that area
	public static void limitText(final TextArea area) {
		area.textProperty().addListener(new ChangeListener<String>() {
			public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
				if(area.getText().length() > 1) {
	                String originalText = area.getText().substring(0, 1);
	                area.setText(originalText);
	            }
				
				switch(area.getText()) {
					case("1"):
						break;
					case("2"):
						break;
					case("3"):
						break;
					case("4"):
						break;
					case("5"):
						break;
					case("6"):
						break;
					case("7"):
						break;
					case("8"):
						break;
					case("9"):
						break;
					default:
						area.setText("");
						break;
				}
			}
		});
	}
	
	public void sendUpdate(int newValue, TextArea location) {
		StringBuilder sb = new StringBuilder();
		sb.append(newValue);
		location.setText(sb.toString());
		//sb.delete(0, 1);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
