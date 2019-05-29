package Crypted;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

import javafx.scene.control.TextField;

public class Decrypt implements Runnable{
		String Key = "";
		String OriginalMessage = "";
		String CryptedMessage = "";
		String BuildingOriginal = "";
		
		TextArea OriginalMessageField = new TextArea();
		TextField KeyField = new TextField();
		
		ArrayList<String>ProperKey = new ArrayList<String>();
		
		
		public Decrypt(TextField KeyField, TextArea MessageField) {
		this.OriginalMessageField = MessageField;
		this.KeyField = KeyField;
		
		CryptedMessage = OriginalMessageField.getText().trim();
		Key = KeyField.getText().trim();
		}		
		
	@Override
	public void run() {
		
		decrypt();
		SendUpdate();
	}
	
	public void decrypt() {
		
		char[] SplitMessage = StringToArray(CryptedMessage);
		char[] SplitKey = StringToArray(Key);

		int[] ProperKey = GetProperKey(SplitKey);
		int StepCounter = 0;
		for(int i = 0; CryptedMessage.length() > i; i++) {
			char OriginalChar = GetOriginalChar(StepCounter, SplitMessage, ProperKey);
			OriginalMessage = OriginalMessage + Character.toString(OriginalChar);
			StepCounter++;
		}
		System.out.println(OriginalMessage);
	}
	
	public char GetOriginalChar(int Location,char[] Message, int[] Key) {
		char Upperlimit = '~';
		char OriginalChar = ' ';
		
		int LargestGap = GetGap(Message[Location]);
		
		
		if(Key[Location] <= LargestGap) {
			System.out.println("Difference: " + (Key[Location] - LargestGap));
			OriginalChar = (char) (Message[Location] - Key[Location]);
		} else {
			System.out.println("Difference: " + (Key[Location] - LargestGap));
			OriginalChar = (char) (Upperlimit - (Key[Location] - LargestGap));
		}
		
		return OriginalChar;
	}
	
	public char[] StringToArray(String StringToSplit) {
		char[] NewArray = new char[StringToSplit.length()];
		
		NewArray = StringToSplit.toCharArray();

		return NewArray;
	}
	
	public int[] GetProperKey(char[] WrongKey) {
		int[] ProperKey = new int[WrongKey.length/2];
		int KeyBuilder = 0;
		
		for(int i = 0; WrongKey.length/2 > i; i++) {
			char FirstCharPart = WrongKey[KeyBuilder];
			char SecondCharPart = WrongKey[KeyBuilder + 1];
			
			int FirstPart = FirstCharPart - '0';
			int SecondPart = SecondCharPart - '0';
			
			
			ProperKey[i] = (FirstPart * 10) + SecondPart;
			KeyBuilder = KeyBuilder + 2;
		}
		
		return ProperKey;
	}
	
	public int GetGap(char CurrentChar) {
		int gap = 0;
		char MinimumChar = ' ';
		char MaxChar = '~';
		
		gap = MaxChar - CurrentChar;
		
		
		
		gap = 94 - gap;
		System.out.println("Gap between chars: " + gap);
		return gap;
	}
	
	public void SendUpdate() {
		OriginalMessageField.setText(OriginalMessage);
	}
}
