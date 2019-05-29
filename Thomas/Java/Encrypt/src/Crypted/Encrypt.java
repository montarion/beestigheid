package Crypted;

import java.util.Random;

import javafx.scene.control.TextArea;

import javafx.scene.control.TextField;

public class Encrypt implements Runnable{
	Random Random = new Random();
	StringBuilder BuildKey = new StringBuilder();
	String Key = "";
	String OriginalMessage = "Empty, For now >:O";
	String CryptedMessage = "Got Ya Message";
	String BuildingCrypt = "";
	
	TextArea OriginalMessageField = new TextArea();
	TextField KeyField = new TextField();
	
	public Encrypt(TextField KeyField, TextArea MessageField) {
	this.OriginalMessageField = MessageField;
	this.KeyField = KeyField;
	}

	@Override
	public void run() {
		OriginalMessage = OriginalMessageField.getText().trim();
		CryptedMessage = encrypt(SplitMessageToChar(OriginalMessage));
		System.out.println("The Original: " + OriginalMessage);
		System.out.println("Complete New Message: " + CryptedMessage);
		System.out.println("COMPLETE SENDING UPDATE NOW!!!");
		SendUpdate();

	}
		
	public char[] SplitMessageToChar(String Message) {
		String CryptedMessage = Message;
		char[] SplitCryptedMessage = CryptedMessage.toCharArray();
		
		return SplitCryptedMessage;
	}
	
	public String encrypt(char[] Original) {
		String Cryptedmessage = "Empty";
		for(int i = 0; i < Original.length;i++) {
			System.out.println("Original Character: " + Original[i]);
			Cryptedmessage = CreateString(GetNewSymbol(Original[i]));
		}
		
		return Cryptedmessage;
	}
	
	public char GetNewSymbol(char OldSymbol) {
		char UpperLimit = '~';
		char LowerLimit = ' ';
		char NewSymbol = 'X';
		int Multiplier = Random.nextInt(93) + 1;
		char NewChar = (char) (OldSymbol + Multiplier);
		System.out.println("Amount of shifts: " + Multiplier);
		
		if(NewChar > UpperLimit) {
			int Difference = UpperLimit - OldSymbol;
			int ExtraMultiplier = Multiplier - Difference;
			NewChar = (char) (LowerLimit + ExtraMultiplier);
		}
		 
		NewSymbol = NewChar;
		
		SaveKey(Multiplier);
		
		System.out.println("New Character: " + NewSymbol);
		return NewSymbol;
	}
	
	public void SaveKey(int shifts) {
		if(shifts < 10) {
			BuildKey.append("0");
		}
		
		BuildKey.append(shifts);
		Key = Key + BuildKey.toString();
		BuildKey.delete(0, 2);
		System.out.println("The Key for now is: " + Key);
	}
	
	public String CreateString(char NewEntry) {
		
		BuildingCrypt = BuildingCrypt + NewEntry;
		
		return BuildingCrypt;
	}
	
	public void SendUpdate() {
		OriginalMessageField.setText(CryptedMessage);
		KeyField.setText(Key);
	}
	
}
