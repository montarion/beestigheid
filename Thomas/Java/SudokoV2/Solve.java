package yeet;

import java.util.ArrayList;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class Solve extends Interface{
	
	public void solve(ArrayList<TextArea> currentValues) {
		int[][] newValues = new int[9][9];
		int[][] oldValues = new int[9][9];
		int row = 0;
		int newValue = 1;
		int column = 0;

		for(int i = 0; currentValues.size() > i; i++) {
			if(i % 9 == 0 && i != 0) {
				column++;
				row = 0;
			}
			
			if(currentValues.get(i).getText().equals("")) {
				newValues[row][column] = 0;
				oldValues[row][column] = 0;
			} else {
				System.out.println("column: " + row + " row: " + row);
				newValues[row][column] = Integer.parseInt(currentValues.get(i).getText());
				oldValues[row][column] = Integer.parseInt(currentValues.get(i).getText());
			}
			row++;
		}
		
		row = 0;
		column = 0;
		
		for(int i = 0; currentValues.size() > i; i++) {
			if(i % 9 == 0 && i != 0) {
				column++;
				row = 0;
			}
			newValue = checkValue(oldValues, newValues, row, column, 1);
			//System.out.println(i);
			sendUpdate(newValue, currentValues.get(i));
			
			row++;
		}
	}
	
	public int checkValue(int[][] oldValues, int[][] newValues, int row, int column, int returnValue) {
		System.out.println("row: " + row + " column: " + column);
		
		boolean setCellZero = false;
		
		for(int cell = 0; cell < 9; cell++) {
		//	System.out.prcellntln("array: " + newValues[cell][column] + " return: " + returnValue);
		//	System.out.prcellntln("row: "+ row + "\n");
			System.out.println("cell cells: " + cell);
			if(newValues[cell][column] == returnValue) {
				returnValue++;
				setCellZero = true;
			}
			
			if(newValues[row][cell] == returnValue) {
				returnValue++;
				setCellZero = true;
			}
			
			if(setCellZero) {
				cell = -1;
				setCellZero = false;
			}
		}
		
		newValues[row][column] = returnValue;
	//	System.out.println("filled in on place: " + row + "\n" );

		
		return returnValue;
	}
}
