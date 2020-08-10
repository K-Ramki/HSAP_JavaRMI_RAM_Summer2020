import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RI extends Remote {

    // These two methods will be called by the client.
    void DoubleAdding (String[] userArray) throws RemoteException;
    String printMsg (String [] userArray) throws RemoteException;
}