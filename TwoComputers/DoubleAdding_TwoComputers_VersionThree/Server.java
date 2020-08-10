import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Impl_RI {

    public static int serverStatus = 1;
    public static int printStatus = 0;

    public Server () {}

    public static void main(String[] args) {
        try {
            Impl_RI obj = new Impl_RI();
            // Impl_RI obj2 = new Impl_RI();
            RI stub = (RI) UnicastRemoteObject.exportObject(obj, 0);
            // RI stub2 = (RI) UnicastRemoteObject.exportObject(obj2, 0);
            Registry registry = LocateRegistry.getRegistry();
            // Registry registry2 = LocateRegistry.getRegistry();
            for (int i = 0; i < Client.numbersSetOne.length; i++) {
                registry.bind(Client.numbersSetOne[i], stub);
            }
            for (int i = 0; i < Client.numbersSetOne.length; i++) {
                registry.unbind(Client.numbersSetOne[i]);
            }
            for (int j = 0; j < Client.numbersSetTwo.length; j++) {
                registry.bind(Client.numbersSetTwo[j], stub);
            }
            printStatus = 1;
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.err.println("Server Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}