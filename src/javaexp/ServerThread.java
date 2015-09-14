package javaexp;
import java.io.*;
import java.net.*;

public class ServerThread implements Runnable {
	
	protected Socket socket = null;
	
	public ServerThread(Socket socket)
	{
		this.socket = socket;
	}
	
	
	public void run() 
	{
		System.out.println("Server is online and running");
	}

}
