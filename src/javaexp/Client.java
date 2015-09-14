package javaexp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.nio.channels.IllegalBlockingModeException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Client extends UnicastRemoteObject implements clientInterface {
	
	private static mainServerInterface ms = null;

	public Client() throws RemoteException, IOException {
		super();

		try {
			// set up connection with nameserver
			String mainserver = "//192.168.0.142/MainServer";
			ms = (mainServerInterface) Naming.lookup(mainserver);
			System.out.println("connected with mainserver");
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] argv) throws RemoteException, IOException 
	{
		System.out.println("test");
		
		ms.connectionSuccess();
		
	}
		
	
	
}