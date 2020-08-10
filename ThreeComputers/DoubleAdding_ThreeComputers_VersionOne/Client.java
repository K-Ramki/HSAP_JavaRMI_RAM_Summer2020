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
            RAM.main(args);
            if (!(RAM.errorMsg.equals("Cannot connect now; please try again later"))) {
                Registry registry = LocateRegistry.getRegistry("rareamber.ncat.edu");
                for (int i = 0; i < numbers.length; i++) {
                    stub = (RI) registry.lookup(numbers[i]);
                }
                System.out.println("Please enter five numbers: ");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.next();
                }
                stub.DoubleAdding(numbers);
                sum = stub.printMsg(numbers);
                System.out.println(sum);
                RAM.Disconnection();
            }
            else {
                System.out.println(RAM.errorMsg);
            }
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}