package talktome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
	
	String Memory = "";
	
	public String GetResponse(String Question, String Answer) {
		FileWriter NewQuestion;
		Question = Question.replaceAll("[^\\p{L}^\\d]", "");
		Question = Question.toLowerCase();
		File PossibleResponse = new File("responses", Question + ".txt");

		try {
			NewQuestion = new FileWriter(PossibleResponse, true);
			BufferedWriter BFWriter = new BufferedWriter(NewQuestion);
			BFWriter.write(Answer);
			BFWriter.newLine();
			BFWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Thanks";
	}
	
	public String DoorVraag(String Question, String Answer, String Doorvraag) {
		FileWriter NewQuestion;
		Question = Question.replaceAll("[^\\p{L}^\\d]", "");
		Question = Question.toLowerCase();
		Doorvraag = Doorvraag.replaceAll("[^\\p{L}^\\d]", "");
		Doorvraag = Doorvraag.toLowerCase();
		File PossibleResponse = new File("responses", Question + "." + Doorvraag + ".txt");

		try {
			NewQuestion = new FileWriter(PossibleResponse, true);
			BufferedWriter BFWriter = new BufferedWriter(NewQuestion);
			BFWriter.write(Answer);
			BFWriter.newLine();
			BFWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Thanks";
	}
	
	public String respond(String Question) {
		String Answer = " ";
		String InputLine = " ";
		ArrayList<String> AnswerList = new ArrayList<String>();
		Question = Question.replaceAll("[^\\p{L}^\\d]", "");
		Question = Question.toLowerCase();
	    File PossibleResponse = new File("responses", Memory + "." + Question + ".txt");
		System.out.println(PossibleResponse.exists());
	    
	    if(!PossibleResponse.exists()) {
	    	PossibleResponse = new File("responses", Question + ".txt");
	    } 
	    
	    if(PossibleResponse.exists()){
			FileReader NewQuestion;
			try {
				NewQuestion = new FileReader(PossibleResponse);
				BufferedReader BFReader = new BufferedReader(NewQuestion);
				InputLine = BFReader.readLine();
			
				while(InputLine != null) {
					AnswerList.add(InputLine);
					InputLine = BFReader.readLine();
				}
				
				BFReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			int randomrange = AnswerList.size();
		    int ResponseCount = (int) (Math.random() * randomrange);
		    System.out.println(ResponseCount);
		    Answer = AnswerList.get(ResponseCount);
			Memory = Question;
		} else {
			Answer = "NANI I dont know that sentence";
		}
	    
		return Answer; 
	}
}
