import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Impl_RI {
    
    // public static int status = 0;

    public Server () {}

    /* public static void changeStatus () {
        if (status == 0) {
            status = 1;
        }
        else {
            status = 0;
        }
    } */

    public static void main(String[] args) {
        try {
            Impl_RI obj = new Impl_RI();
            RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            for (int i = 0; i < Client.numbers.length; i++) {
                registry.bind(Client.numbers[i], stub);
            }
            // changeStatus();
            System.out.println("Server Ready");
            // System.out.println(status);
        } catch (Exception e) {
            System.err.println("Server Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}