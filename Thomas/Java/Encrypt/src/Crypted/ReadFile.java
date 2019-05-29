package Crypted;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadFile implements Runnable{
	
	TextArea MessageField = new TextArea();
	TextField KeyField = new TextField();
	boolean Message;
	
	public ReadFile(TextArea MessageField, TextField KeyField) {
		this.MessageField = MessageField;
		this.KeyField = KeyField;
		
	}
	
	@Override
	public void run() {
		ReadFromFile();
	}

	public void ReadFromFile() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFrame Choose = new JFrame("CryptYoMessage");
		
	    Choose.setLayout(null);
	    JButton MessageFile = new JButton("Select Message");
	    JButton KeyFile = new JButton("Select Key");
	    JButton Done = new JButton("Done");
	    MessageFile.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent ae) {
	    		PerformAction(Message = true);
	    	}
	    });
	    	
	    KeyFile.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent ae) {
	    		PerformAction(Message = false);
	    	}
	    });
	    
	    Done.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent ae) {
	    		Choose.dispose();
	    	}
	    });
	    
	    Choose.add(MessageFile);
	    Choose.add(KeyFile);
	    Choose.add(Done);
	   
	    Choose.setSize(350, 160);
	    Choose.setResizable(false);
	    
	    
	    //styling the button because #fashion
	    MessageFile.setBounds(15, 10, Choose.getWidth()/2 - 20 , 50);
	    KeyFile.setBounds(MessageFile.getWidth() + 20, 10, Choose.getWidth()/2 - 20, 50);
	    Done.setBounds(15, KeyFile.getHeight() + 20, Choose.getWidth() - 35, 50);
	    
	    Style(Done);
	    Style(KeyFile);
	    Style(MessageFile);
	    
			
	    Choose.getContentPane().setBackground(Color.black);
	    Choose.setLocationRelativeTo(null);
	    Choose.setVisible(true);
	}
	
	public void PerformAction(boolean Message) {
		FileNameExtensionFilter FileFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(FileFilter);
		int returnValue = fileChooser.showOpenDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
      
			try {
				BufferedReader ReadFromFile  = new BufferedReader(new FileReader(selectedFile));
				
				if(!Message) {
					KeyField.setText("");
				} else if(Message) {
					MessageField.setText("");
				}
				
				String NewText = ReadFromFile.readLine();
				
				while (NewText != null) {
					if(!Message) {
						KeyField.setText(KeyField.getText() + NewText);
					} else {
						MessageField.setText(MessageField.getText() + NewText + "\n");
					}
					NewText = ReadFromFile.readLine();
				}
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void Style(JButton Change) {
		Change.setFocusPainted(false);
	    Change.setBackground(Color.WHITE);
	    Change.setForeground(Color.black);
	    Change.setFont(new Font("Arial Black", Font.BOLD, 12));
	    Change.setOpaque(false);
	}
	
}
