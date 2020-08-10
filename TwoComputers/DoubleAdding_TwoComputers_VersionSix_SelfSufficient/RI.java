import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RI extends Remote {
    void DoubleAdding (String[] userArray) throws RemoteException;
    String printSum (String[] userArray) throws RemoteException;
}