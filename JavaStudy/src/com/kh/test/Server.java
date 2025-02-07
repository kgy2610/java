package com.kh.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void client() {
		int port = 3000;
		String serverIP = "192.168.20.34";
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(serverIP, port);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void server() {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
