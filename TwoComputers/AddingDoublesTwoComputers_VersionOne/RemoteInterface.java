import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    double DoubleAdding (double[] nums) throws RemoteException;
}