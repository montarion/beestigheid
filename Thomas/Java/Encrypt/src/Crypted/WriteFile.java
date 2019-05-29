package Crypted;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;


import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WriteFile implements Runnable{

	String OriginalText;
	String OriginalKey;
	
	public WriteFile(String TextToFile, String KeyToFile) {
		this.OriginalText = TextToFile;
		this.OriginalKey = KeyToFile;
	}

	@Override
	public void run() {
		System.out.println(OriginalText);
		WriteToFile();
	}
	
	public void WriteToFile() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 JFileChooser ChooseFile = new JFileChooser();
		    ChooseFile.setCurrentDirectory(new File(""));
		    int retrival = ChooseFile.showSaveDialog(null);
		    if (retrival == JFileChooser.APPROVE_OPTION) {
		        try(FileWriter WriteFile = new FileWriter(ChooseFile.getSelectedFile()+".txt")) {
		            WriteFile.write(OriginalText);
		            
		            PrintWriter KeyWriter = new PrintWriter(ChooseFile.getSelectedFile()+".Key.txt");
		            KeyWriter.println(OriginalKey);
		            KeyWriter.close();
		            
		            WriteFile.flush();
		            WriteFile.close();
		            
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		
				 	
	

	}
}	