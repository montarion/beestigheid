package memoryflooderV2;

import java.util.ArrayList;

public class flood implements Runnable{
	ArrayList<String> array = new ArrayList<String>();
	long floodID;
	String alotoftext = "fL00D3d!?";
	StringBuilder sb = new StringBuilder();
	flood(ArrayList array, long floodID){
		this.array = array;
		this.floodID = floodID;
	}
	
	public void run() {
		int hash = 0;
		boolean arrayfull = false;
		createNew(); 
		while(true) {
			if(!arrayfull) {
				try {
					hash = alotoftext.hashCode();
					sb.append(hash);
					array.add(sb.toString());
				} catch(OutOfMemoryError e) {
					System.out.println("Memory full for: " + floodID);
					arrayfull = true;
				} finally {
					System.out.println("Value added for ID: " + floodID);
					sb.delete(0, 1);	
				}
			} else {
				System.out.println("Memory full for: " + floodID);	
			}
		}
	}
	
	public void createNew() {
		flood flood = new flood(new ArrayList<String>(), floodID + 100000);
		Thread thread = new Thread(flood);
		thread.start();
	}
}
