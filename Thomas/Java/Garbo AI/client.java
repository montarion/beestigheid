package talktome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client {

	public String SendServer(String Input) throws Exception{
		//client setup;
		Socket socket = null;
		String response = "Server connection error!";
		BufferedReader ReadOutput = null;
		PrintWriter WriteOuput = null;
				
		try {
			
			socket = new Socket();
			socket.connect(new InetSocketAddress("IP ADRESS VAN SERVER", 1777), 4000);
			ReadOutput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			WriteOuput = new PrintWriter(socket.getOutputStream());
			System.out.println("Starting connection to server");
		} catch(IOException e) {
			System.out.println("Connection error server down?");
		}

		try {
			WriteOuput.println(Input);
			WriteOuput.flush();
            response=ReadOutput.readLine();
		} catch(Exception e) {
	        	System.out.println("tried to read from server, no connection?");
	    } finally {
	    	try {
	    		WriteOuput.close();
	    		ReadOutput.close();
	    		socket.close();
	            System.out.println("Connection Closed");
	    	}catch(Exception e) {
	    		System.out.println("Connection couldnt be terminated, was I ever connected?");
	    	}

	    }
		return response;
	}

}
