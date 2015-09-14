package javaexp;
import java.io.IOException;
import java.net.*; 
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;



public class Main {
	
	public static void main(String[] argv) throws RemoteException, IOException {
		
		final MainServer mainserver = new MainServer();
		String bindLocation = "//192.168.0.142/NameServer";


		// start nameserver
		try 
		{
			LocateRegistry.createRegistry(22);
			Naming.bind(bindLocation, mainserver);
			System.out.println("Main Server is ready at:" + bindLocation);
			System.out.println("java RMI registry created.");
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch(AlreadyBoundException e)
		{
			System.out.println("java RMI registry already exists.");
		}
		
		mainserver.init();
	}
	
}
