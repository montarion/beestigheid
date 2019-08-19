package sneakysnake;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javafx.scene.shape.Rectangle;

public class client {

	public boolean Start() throws IOException {
		DatagramSocket s = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("192.168.178.13");
		byte[] snd = new byte[1024];
		byte[] rcv = new byte[1024];
		String sentence = "R";
		snd = sentence.getBytes();
		DatagramPacket sndP = new DatagramPacket(snd, snd.length, ip, 1777);
		s.send(sndP);
		DatagramPacket rcvP = new DatagramPacket(rcv, rcv.length);
		s.receive(rcvP);
		s.close();
		return true;
	}
	
	public void send(double oX, double oY) throws IOException {
		StringBuilder sb = new StringBuilder();
		DatagramSocket s = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("192.168.178.13");
		byte[] snd = new byte[1024];
		
		Double conv = new Double(oX);
		
		int X = conv.intValue();
		
		conv = new Double(oY);
		
		int Y = conv.intValue();
		
		sb.append(X);
		sb.append("-");
		sb.append(Y);
		sb.append(";");
		
		String Packet = sb.toString();
		//System.out.println(Packet);
		snd = Packet.getBytes();
		
		DatagramPacket sndP = new DatagramPacket(snd, snd.length, ip, 1777);
		s.send(sndP);
		s.close();
	}
	
	public String recieve() throws IOException {
		DatagramSocket s = new DatagramSocket();
		byte[] rcv = new byte[1024];
		InetAddress ip = InetAddress.getByName("192.168.178.13");
		byte[] snd = new byte[1024];
		
		snd = "G".getBytes();
		DatagramPacket sndP = new DatagramPacket(snd, snd.length, ip, 1777);
		s.send(sndP);
		
		DatagramPacket rcvP = new DatagramPacket(rcv, rcv.length);
		s.receive(rcvP);
		
		String returnS = new String(rcvP.getData());
		String[] returnS2 = returnS.split(";");
		s.close();
		
		return returnS2[0];
	}

}
