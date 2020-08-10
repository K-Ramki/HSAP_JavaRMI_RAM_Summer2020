import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Impl_RI {

    public static int serverStatus = 1;

    public Server () {}

    public static void main(String[] args) {
        try {
            Impl_RI obj = new Impl_RI();
            RI stub = (RI) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            for (int i = 0; i < Client.numbers.length; i++) {
                registry.bind(Client.numbers[i], stub); 
            }
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.err.println("Server Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}