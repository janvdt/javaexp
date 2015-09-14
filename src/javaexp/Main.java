package javaexp;
import java.io.IOException;
import java.net.*; 

public class Main {
	
	public static void main (String [] args ) throws IOException 
	{
		//Make a serverSocket
		ServerSocket serverSocket = new ServerSocket(8500);
		//Keep the server alive
		while(true)
		{
			Socket socket = serverSocket.accept();
			
			new Thread(new ServerThread
					(socket)
			).start();
		}
	} 

}
