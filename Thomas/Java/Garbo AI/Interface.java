package talktome;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Interface extends Application{

	int counter = 1;
	int TimesAsked = 0;
	boolean canSend = true;
	boolean First = true;
	boolean LearningMode = false;
	String KeyWord = "";
	String DVKeyWord = "";
	String serverresponse;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
		client response = new client();
		
		ScrollPane chatroomholder = new ScrollPane();
		Pane Chatroom = new Pane();
		BorderPane Layout = new BorderPane();
		TextArea UserInput = new TextArea();
		//VBox UserSide = new VBox(48);
		//VBox BotSide = new VBox(48);
		
		ArrayList<TextArea> Messages = new ArrayList<TextArea>();
		
		UserInput.setMinHeight(37);
		UserInput.setMaxHeight(37);
		UserInput.setMaxWidth(500);
		UserInput.setWrapText(true);
		
		
		//Chatroom.getChildren().addAll(BotSide, UserSide);
		Chatroom.setBackground(Background.EMPTY);
		chatroomholder.setBackground(Background.EMPTY);
		//UserSide.setBackground(Background.EMPTY);
		//BotSide.setBackground(Background.EMPTY);
		chatroomholder.setContent(Chatroom);
		chatroomholder.setBackground(Background.EMPTY);
		chatroomholder.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		chatroomholder.setHbarPolicy(ScrollBarPolicy.NEVER);
		chatroomholder.vvalueProperty().bind(Chatroom.heightProperty());
		//UserSide.setLayoutX(5);
		//UserSide.setLayoutY(5);
	//	BotSide.setLayoutY(48);
	//	BotSide.setLayoutX(83);
		
		Layout.setCenter(chatroomholder);
		//Layout.setRight(BotSide);
		Layout.setBottom(UserInput);
	
		Stage DefaultStage = new Stage();
		DefaultStage.getIcons().add(new Image(Interface.class.getResourceAsStream("icon.png")));
		Scene DefaultScene = new Scene(Layout, 500, 700);
		DefaultScene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
		DefaultStage.setResizable(false);
		DefaultStage.setTitle("Mrs. Johniffer Backson");
		
		DefaultStage.setScene(DefaultScene);
		DefaultStage.show();
		
		Messages.add(new TextArea(null));
		Messages.get(0).setMaxHeight(0);
		
		if(!LearningMode) {
			UserInput.setOnKeyPressed(e ->{
				
				
				
				
				if(e.getCode() == KeyCode.ENTER && canSend) {
					Messages.add(new TextArea(UserInput.getText().toLowerCase().trim()));
					Messages.get(counter).setMaxWidth(400);
					Messages.get(counter).setPrefWidth(UserInput.getText().toLowerCase().trim().length() * 13 + 35);
					Messages.get(counter).setMinHeight(((UserInput.getText().toLowerCase().trim().length()/42) * 30) + 37);
					Messages.get(counter).setMaxHeight(((UserInput.getText().toLowerCase().trim().length()/42) * 30) + 37);
					Messages.get(counter).setEditable(false);
					Messages.get(counter).setWrapText(true);
					
					
					
					String Input = UserInput.getText().trim();
					UserInput.setText("");
					Messages.get(counter).setLayoutX(5);
					Chatroom.getChildren().addAll(Messages.get(counter));
					System.out.println("Height: " + Messages.get(counter).getMaxHeight());
					Messages.get(counter).setLayoutY(Messages.get(counter-1).getLayoutY() + Messages.get(counter - 1).getMaxHeight() + 10);
					UserInput.setEditable(false);
					UserInput.setMinHeight(37);
					UserInput.setMaxHeight(37);
					UserInput.setText("Processing");
					canSend = false;
					new Thread() {
						public void run() {
							try {
								serverresponse = response.SendServer(Input);
							} catch (Exception e) {
								serverresponse = "Failed to get response from server";
							}
							
							Platform.runLater(new Runnable() {	
								 public void run() {
									counter++;
									Messages.add(new TextArea(serverresponse.toLowerCase()));
									Messages.get(counter).setLayoutX(150);
									Messages.get(counter).setMaxWidth(400);
									Messages.get(counter).setMaxWidth(serverresponse.toLowerCase().length() * 9);
									Messages.get(counter).setMinHeight(((serverresponse.toLowerCase().length()/73) * 37) + 37);
									Messages.get(counter).setMaxHeight(((serverresponse.toLowerCase().length()/73) * 37) + 37);
									Messages.get(counter).setWrapText(true);
									Messages.get(counter).setEditable(false);
									Chatroom.getChildren().addAll(Messages.get(counter));
									Messages.get(counter).setLayoutY(Messages.get(counter-1).getLayoutY() + Messages.get(counter - 1).getMaxHeight() + 10);
									
									if(Messages.get(counter).getMaxWidth() > 400) {
										Messages.get(counter).setMaxWidth(400);
									} else if(Messages.get(counter).getMaxWidth() < 60) {
										Messages.get(counter).setMaxWidth(60);
									}
									
									
									Messages.get(counter).setLayoutX((500 - Messages.get(counter).getMaxWidth()) - 30);
									System.out.println("width: " + Messages.get(counter).getMaxWidth() + " X: " + Messages.get(counter).getLayoutX());
									
									//BotSide.getChildren().add(Messages.get(counter));
									UserInput.setEditable(true);
									UserInput.setText("");
									canSend = true;
									counter++;
								 }
							});
						}
					}.start();
					//System.out.println(BotSide.getHeight());
					//if(BotSide.getHeight() > 500) {
				//		BotSide.setLayoutY(BotSide.getLayoutY() - 86);
				//		UserSide.setLayoutY(UserSide.getLayoutY() - 86);
				//	}
				}
			});
			
		}else if(LearningMode) {
			UserInput.setOnKeyPressed(e ->{
				if(e.getCode() == KeyCode.ENTER && canSend) {
					Messages.add(new TextArea(UserInput.getText()));
					String Input = UserInput.getText().trim();
					UserInput.setText("");
					Messages.get(counter).setLayoutY(270);
					//UserSide.getChildren().add(Messages.get(counter));
					counter++;
					switch(TimesAsked) {
						case(0):
							Messages.add(new TextArea("Wat Zou jij antwoorden?"));
							KeyWord = Input;
							break;
						case(1):
							if(First) {
								//response.GetResponse(KeyWord, Input);
								First = false;
							} else {
								//response.DoorVraag(KeyWord, Input, DVKeyWord);
								KeyWord = DVKeyWord;
							}
							Messages.add(new TextArea("Wil je doorvragen? (ja/nee)"));
							break;
						case(2):
							if(Input.equals("ja")) {
								Messages.add(new TextArea("Ok vraag maar door"));
							} else {
								Messages.add(new TextArea("Thanks"));
								TimesAsked = -1;
								First = true;
							}
							break;
						case(3):
							DVKeyWord = Input;
							Messages.add(new TextArea("wat zou jij antwoorden?"));
							TimesAsked = 0;
					}
						TimesAsked++;
						
					//BotSide.getChildren().add(Messages.get(counter));
					counter++;
					
				//	if(counter > 6) {
				//		BotSide.setLayoutY(BotSide.getLayoutY() - 27);
				//		UserSide.setLayoutY(UserSide.getLayoutY() - 27);
				//	}
				}
			});
		}
	}
}
