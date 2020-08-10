import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Impl_RemoteInterface {
    public Server () {}
    public static void main(String[] args) {
        try {
            Impl_RemoteInterface obj = new Impl_RemoteInterface();
            RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();

            for (int i = 0; i < Client.numbers.length; i++) {
                double d = Client.numbers[i];
                String s = Double.toString(d);
                registry.bind(s, stub);
            }
            System.out.println("Server Ready");
            // result = stub.DoubleAdding(Client.numbers);
            // System.out.println("The sum of your numbers are: " + result);
        } catch (Exception e) {
            System.err.println("Server Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}