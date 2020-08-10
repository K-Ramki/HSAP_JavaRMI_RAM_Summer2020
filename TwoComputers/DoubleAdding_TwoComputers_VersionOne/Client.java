import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static String[] numbers = {"1.0", "2.0", "3.0", "4.0"};
    public static RemoteInterface stub;
    public static String sum;
    public static Server server;

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.1.127");
            for (int i = 0; i < numbers.length; i++) {
                stub = (RemoteInterface) registry.lookup(numbers[i]);
            }
            stub.DoubleAdding(numbers);
            // Server.changeStatus();
            sum = stub.AddingDoubles(numbers);
            System.out.println(sum);
        } catch (Exception e) {
            System.err.println("Client Exception:" + e.toString());
            e.printStackTrace();
        }
    }
}