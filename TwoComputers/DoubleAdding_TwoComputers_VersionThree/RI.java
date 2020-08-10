import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RI extends Remote {
    void DoubleAdding (String[] alpha, String[] beta) throws RemoteException;
    String printSum (String[] alpha, String[] beta) throws RemoteException;
}