package sneakysnake;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class sneksnek {

	public static void main(String[] args) throws IOException {
		DatagramSocket serverSocket = new DatagramSocket(1777);
		byte[] rcv = new byte[1024];
		byte[] snd = new byte[1024];
		InetAddress P1IP = null;
		InetAddress P2IP = null;
		int P2port = 0;
		int P1port = 0;
		
		while (true) {
			System.out.println("Waiting for 2 players");
			DatagramPacket receivePacket = new DatagramPacket(rcv, rcv.length);
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			if(sentence.contains("R")&& P1port == 0) {
				P1IP = receivePacket.getAddress();
				P1port = receivePacket.getPort();
			} else if(sentence.contains("R")&& P2port == 0) {
				P2IP = receivePacket.getAddress();
				P2port = receivePacket.getPort();
				System.out.println("got 2 players");
				startgame(P1IP, P2IP, P1port, P2port, serverSocket, snd, rcv);
			}
		}
		
	}
	
	public static void startgame(InetAddress P1IP, InetAddress P2IP, int P1P, int P2P, DatagramSocket s,byte[] snd, byte[] rcv) throws IOException {
		byte[] snd1 = new byte[1024];
		byte[] snd2 = new byte[1024];
		sendpacket(P1IP, P1P, "G", snd, s);
		sendpacket(P2IP, P2P, "G", snd, s);
		DatagramPacket sndP;
		while(true) {
			DatagramPacket rcvP = new DatagramPacket(rcv, rcv.length);
			s.receive(rcvP);
			String Data = new String(rcvP.getData());
			//System.out.println(Data);
			if(Data.contains("G")) {
				if(rcvP.getAddress().equals(P1IP)) {
					P1P = rcvP.getPort();
					//System.out.println(new String(snd1.toString()));
					sndP = new DatagramPacket(snd1, snd1.length, P1IP, P1P);
				} else {
					P2P = rcvP.getPort();
					sndP = new DatagramPacket(snd2, snd2.length, P2IP, P2P);
				}
				s.send(sndP);
			} else {
				snd = Data.getBytes();
				if(rcvP.getAddress().equals(P1IP)) {
					snd2 = snd;
				} else {
					snd1 = snd;
				}
			}
		}
	}
	
	public static void sendpacket(InetAddress adres, int port, String message, byte[] snd, DatagramSocket s) throws IOException {
		snd = message.getBytes();
		DatagramPacket packet = new DatagramPacket(snd, snd.length, adres, port);
		s.send(packet);
		
	}

}
