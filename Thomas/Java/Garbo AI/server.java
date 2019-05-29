package talktome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import talktome.ServerThread;

public class server {
	public static void main(String args[]) throws IOException{
	    Socket socket=null;
	    ServerSocket serverport=new ServerSocket(1777);
	    System.out.println("Server Listening..");
	   
	    while(true){
	        try{
	            socket= serverport.accept();
	            System.out.println("Got Connection");
	            ServerThread serverhandle=new ServerThread(socket);
	            serverhandle.start();
	        } catch(Exception e){
	        e.printStackTrace();
	    	}
	    }
	}
}

class ServerThread extends Thread{  
		main getresponse = new main();
	    String input=null;
	    BufferedReader readInput = null;
	    PrintWriter WriteResponse=null;
	    Socket socket=null;

	    public ServerThread(Socket socket){
	        this.socket=socket;
	    }

	    public void run() {
	    try{
	        readInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        WriteResponse=new PrintWriter(socket.getOutputStream());
	    }catch(IOException e){
	        System.out.println("IO error");
	    }

	    try {
	        input=readInput.readLine();
	        WriteResponse.println(getresponse.respond(input));
	        WriteResponse.flush();
	        System.out.println("Client request: " + input);
	        System.out.println("Response to Client  :  "+getresponse.respond(input));
	            
	          
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    catch(NullPointerException e){
	        e.printStackTrace();
	    }
	    finally{    
	    	try{
		        System.out.println("Connection Closing..");
		        if (readInput!=null){
		            readInput.close(); 
		        }
		        if(WriteResponse!=null){
		            WriteResponse.close();
		        }
		        if (socket!=null){
		        socket.close();
		        }

	        } catch(IOException ie){
	        	System.out.println("Socket Close");
	    	}
	   }
	}	
}
