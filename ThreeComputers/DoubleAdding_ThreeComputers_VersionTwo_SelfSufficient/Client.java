import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    
    public static Scanner scan = new Scanner (System.in);
    public static int clientConnect = 0;
    public static String[] numbers = {"1.0", "2.0", "3.0", "4.0", "5.0"};
    public static RI stub;
    public static String sum;
    
    public static void main(String[] args) {
        try {
            RAM.Connection();
            if (!(RAM.statusMsg.equals("Cannot connect now"))) {
                Registry registry = LocateRegistry.getRegistry(null);
                for (int i = 0; i < numbers.length; i++) {
                    stub = (RI) registry.lookup(numbers[i]);
                }
                System.out.println("Please enter five numbers: ");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.next();
                }
                stub.DoubleAdding(numbers);
                sum = stub.printSum(numbers);
                System.out.println(sum);
                RAM.Disconnection();
            }
            else {
                System.out.println(RAM.statusMsg);
            }
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}