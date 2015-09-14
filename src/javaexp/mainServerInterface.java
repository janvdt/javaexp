package javaexp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface mainServerInterface extends Remote {
	
	public void init() throws RemoteException;
	
	public void connectionSuccess() throws RemoteException;

}
