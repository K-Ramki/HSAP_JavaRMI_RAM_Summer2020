import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

    public static Scanner scan = new Scanner(System.in);
    public static double[] numbers = {1.0, 2.0, 4.3, 2.5, 3.9};
    static RemoteInterface stub;

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            for (int i = 0; i < numbers.length; i++) {
                double d = numbers[i];
                String s = Double.toString(d);
                stub = (RemoteInterface) registry.lookup(s);
            }
            stub.DoubleAdding(numbers);
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}