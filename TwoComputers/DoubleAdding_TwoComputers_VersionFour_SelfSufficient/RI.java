import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RI extends Remote {
    void DoubleAdding (String[] alpha) throws RemoteException;
    String printSum (String[] omega) throws RemoteException;
}