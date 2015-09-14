package javaexp;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MainServer extends UnicastRemoteObject implements mainServerInterface 
{ 
	public MainServer() throws RemoteException, IOException 
	{
		super();	
	}

	public void init() 
	{
		System.out.println("Succes");
	}
	
	public void connectionSuccess()
	{
		System.out.println("connectie succesvol");
	}
	
}
