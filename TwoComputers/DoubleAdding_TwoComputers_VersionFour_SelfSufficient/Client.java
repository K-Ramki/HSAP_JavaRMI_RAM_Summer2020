import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    
    public static Scanner scan = new Scanner (System.in);
    public static int clientConnect = 0;
    public static int arraySize;
    public static String[] numbers = {"1.0", "2.0"};
    public static RI stub;
    public static String sum;

    public static void main(String[] args) {
        try {
            RAM.Connection();
            Registry registry = LocateRegistry.getRegistry(null);
            for (int i = 0; i < numbers.length; i++) {
                stub = (RI) registry.lookup(numbers[i]);
            }
            System.out.println("How many numbers do you want to add up?");
            arraySize = scan.nextInt();
            numbers = new String[arraySize];
            if (arraySize == 1) {
                System.out.println("Please enter your number: ");
            } else {
                System.out.println("Please enter " + arraySize + " numbers: ");
            }
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scan.next();
            }
            stub.DoubleAdding(numbers);
            sum = stub.printSum(numbers);
            System.out.println(sum);
            RAM.Disconnection();
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}