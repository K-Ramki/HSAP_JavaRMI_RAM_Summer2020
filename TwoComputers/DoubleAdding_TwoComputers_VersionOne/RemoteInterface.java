import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    void DoubleAdding (String[] nums) throws RemoteException;
    String AddingDoubles (String[] nums) throws RemoteException;
}