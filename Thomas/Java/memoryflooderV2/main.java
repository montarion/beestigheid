package memoryflooderV2;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		long i = 0;
		
		while(true) {
			createThread(i);
			i++;
		}
	}
	
	public static void createThread(long count) {
		flood flood = new flood(new ArrayList<String>(), count);
		Thread thread = new Thread(flood);
		thread.start();
	}
}
