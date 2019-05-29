package Crypted;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Interface extends Application{

	String OriginalMessage;
	String CryptedMessage;
	
	public void start(Stage LaunchStage) throws Exception {
	SetupStage();
	}
		
	public void SetupStage() {
		
		Stage LaunchStage = new Stage();
		
		int MaxWidth = 700;
		int MaxHeight = 300;
		//onlaunch -> choose encrypt/decrypt
		//this part setups the stage where this happens
		
		//this is the main pane of the interface for the launch stage
		StackPane ChoosePane = new StackPane();
		
		//here is the label with the instructions for what to do
		Label ChooseLabel = new Label("Welcome, please choose to encrypt or decrypt a message");
		ChooseLabel.getStyleClass().add("label");
		
		//here are the 2 buttons which will be set in a HBox this HBox is also created here
		Button ChooseEncrypt = new Button("Encrypt");
		Button ChooseDecrypt = new Button("Decrypt");
		HBox ChooseButtons = new HBox(100);
		ChooseButtons.getChildren().addAll(ChooseEncrypt, ChooseDecrypt);
		ChooseButtons.setAlignment(Pos.CENTER);
		
		//this is where the HBox with the buttons and the label get put in a VBox then after they get centralised in the pane
		VBox ChooseInfo = new VBox(15);
		ChooseInfo.getChildren().addAll(ChooseLabel, ChooseButtons);
		ChooseInfo.setAlignment(Pos.CENTER);
		ChoosePane.getChildren().add(ChooseInfo);
		ChoosePane.setAlignment(Pos.CENTER);
	
		//here the scene is created
		LaunchStage.setTitle("CryptYoMessage");
		LaunchStage.setScene(new Scene(ChoosePane, MaxWidth, MaxHeight));
		LaunchStage.getScene().getStylesheets().add(getClass().getResource("ChooseMenu.css").toExternalForm());
		LaunchStage.setMaxWidth(MaxWidth);
		LaunchStage.setMinWidth(MaxWidth);
		LaunchStage.setMaxHeight(MaxHeight);
		LaunchStage.setMinHeight(MaxHeight);
		LaunchStage.show();
		
		ChooseEncrypt.setOnAction(e ->{
			LaunchStage.close();
			CryptStage(true);
		});
		
		ChooseDecrypt.setOnAction(e ->{
			LaunchStage.close();
			CryptStage(false);
			
		});
	}

	public void CryptStage(boolean EncryptOr) {
		boolean EnableOriginal = false;
		
		//this stage setups the encrypt window and uses the encrypt class to get the message encrypted
		String WhatStage = "If you see this something went wrong";
		String ButtonTag = WhatStage;
		String ButtonTag2 = WhatStage;
		String ButtonTag3 = "";
		String KeyBox = WhatStage;
		
		int Width = 700;
		int Height = 400;
		
		//section so that code can be recycled
		if(EncryptOr) {
			WhatStage = "encrypt  ";
			ButtonTag = "Encrypt";
			ButtonTag2 = "Original";
			ButtonTag3 = "Write to";
			KeyBox = "The generated key will go here";
		} else {
			WhatStage = "decrypt";
			ButtonTag = "Decrypt";
			ButtonTag2 = "Crypted";
			ButtonTag3 = "Read from";
			KeyBox = "";
		}
		
		//basic setup
		Stage Cryptstage = new Stage();
		//pane
		StackPane CryptPane = new StackPane();
		
		//label holding text
		Label CryptLabel = new Label("Insert text below to " + WhatStage);
		
		//button to write or read
		Button File = new Button(ButtonTag3 + " file");
		
		if(EncryptOr) {
			File.setVisible(false);
		};
		
		//textarea for textinput
		TextArea CryptInput = new TextArea();
		CryptInput.setMinHeight(260);
		CryptInput.setMaxHeight(260);
		CryptInput.setWrapText(true);
		CryptInput.getStyleClass().add("textfields");
		
		//button that starts the process
		Button CryptButton = new Button(ButtonTag);
		
		Button GetOriginal = new Button(ButtonTag2);
		GetOriginal.setVisible(false);
		
		//return to main screen
		Button Back = new Button("Back");
		
		//fake label so that layout can look correct
		Label Layout = new Label();
		
		//hbox to make the layout look correct
		HBox BackLayout = new HBox(10);
		BackLayout.getChildren().addAll(Layout,Back);
		
		//real top box
		HBox TopStuff = new HBox(100);
		TopStuff.getChildren().addAll(BackLayout,CryptLabel, File);
		TopStuff.setAlignment(Pos.CENTER_LEFT);
		
		//field where the key goes
		TextField KeyField = new TextField(KeyBox);
		KeyField.setEditable(false);
		KeyField.setMaxWidth(215);
		KeyField.setMinWidth(215);
		KeyField.getStyleClass().add("textfields");
		
		//key message if you want to decrypt
		Label KeyLabel = new Label("Key:");
		KeyLabel.getStyleClass().remove("label");
		KeyLabel.getStyleClass().add("KeyLabel");
		
		//decision making
		if(KeyBox == "") {
			KeyField.setEditable(true);
		}
		
		//cheat layout box
		HBox LowerStyleBox = new HBox(5);
		LowerStyleBox.setAlignment(Pos.CENTER);
		LowerStyleBox.getChildren().addAll(KeyLabel, KeyField);
		
		HBox DualButtonBottom = new HBox(15);
		DualButtonBottom.setAlignment(Pos.CENTER);
		DualButtonBottom.getChildren().addAll(CryptButton, GetOriginal);
		
		//bottom box
		HBox CryptRow = new HBox(200);
		CryptRow.getChildren().addAll(DualButtonBottom,LowerStyleBox);
		CryptRow.setAlignment(Pos.CENTER);
		VBox CryptBox = new VBox(15);
		CryptBox.getChildren().addAll(TopStuff, CryptInput, CryptRow);
		CryptButton.getStyleClass().add("button");
		
		CryptBox.setAlignment(Pos.CENTER);
		
		CryptPane.getChildren().add(CryptBox);
		
		//setup for the stage
		Cryptstage.setTitle("CryptYoMessage");
		Cryptstage.setScene(new Scene(CryptPane, Width, Height));
		Cryptstage.getScene().getStylesheets().add(getClass().getResource("CryptMenu.css").toExternalForm());
		//Cryptstage.getScene().getStylesheets().add(Interface.class.getResource("CryptStyle.css").toExternalForm());
		Cryptstage.setMaxHeight(Height);
		Cryptstage.setMinHeight(Height);
		Cryptstage.setMaxWidth(Width);
		Cryptstage.setMinWidth(Width);
		Cryptstage.show();
		
		//back button handeler
		Back.setOnAction(e ->{
			OriginalMessage = "";
			CryptedMessage = "";
			SetupStage();
			Cryptstage.close();
			
		});
		
		//button that starts the process
		CryptInput.setOnKeyPressed(e ->{
			if(e.getCode() == KeyCode.ENTER && SendIsPossible(CryptInput, GetOriginal, File)) {
				SendCryptManager(EncryptOr, CryptInput, KeyField);
			}
		});
		
		CryptButton.setOnAction(e ->{
			if(SendIsPossible(CryptInput, GetOriginal, File)) {
				SendCryptManager(EncryptOr, CryptInput, KeyField);
			}
		});
		
		File.setOnAction(e ->{
			if(EncryptOr) {
				WriteFile ToFile = new WriteFile(CryptInput.getText().trim().toString(), KeyField.getText().trim().toString());
				Thread FileRunner = new Thread(ToFile);
				FileRunner.start();
			} else if(!EncryptOr) {
				ReadFile FromFile = new ReadFile(CryptInput, KeyField);
				Thread FileRunner = new Thread(FromFile);
				FileRunner.start();
			}
			
		});
		
		GetOriginal.setOnAction(e ->{
			if(GetOriginal.getText() == "Original") {
				CryptedMessage = CryptInput.getText().trim().toString();
				CryptInput.setText(OriginalMessage);
				GetOriginal.setText("Crypted");
			} else if(GetOriginal.getText() == "Crypted") {
				OriginalMessage = CryptInput.getText().trim().toString();
				CryptInput.setText(CryptedMessage);
				GetOriginal.setText("Original");
			}
		});
	}
	
	public boolean SendIsPossible(TextArea CryptInput, Button Enable, Button Enable2) {
		boolean ispossible = false;
		if(CryptInput.getText().trim().length() != 0) {
			ispossible = true;
			Enable.setVisible(true);
			Enable2.setVisible(true);
			if(Enable.getText() == "Original") {
				OriginalMessage = CryptInput.getText().trim().toString();
			} else if(Enable.getText() == "Crypted") {
				CryptedMessage = CryptInput.getText().trim().toString();
			}
		} else {
			CryptInput.setText("ERROR: Field empty");
			Enable.setVisible(false);
		}
		
		return ispossible;
	}
	
	private void SendCryptManager(boolean ToEncrypt, TextArea TexttoCrypt, TextField CryptedKey) {
		if(ToEncrypt) {
			Encrypt EncryptMessage = new Encrypt(CryptedKey, TexttoCrypt);
			Thread CryptRunner = new Thread(EncryptMessage);
			CryptRunner.start();
		} else {
			Decrypt DecryptMessage = new Decrypt(CryptedKey, TexttoCrypt);
			Thread CryptRunner = new Thread(DecryptMessage);
			CryptRunner.start();
		}
	}
	public static void main(String[] args) {
	launch(args);
	}
}
