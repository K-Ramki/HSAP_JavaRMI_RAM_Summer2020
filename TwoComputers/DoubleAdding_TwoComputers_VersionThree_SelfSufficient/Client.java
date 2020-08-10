import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

    public static Scanner scan = new Scanner (System.in);
    public static int clientConnect = 0;
    public static String[] numbersSetOne = {"1.0", "2.0", "3.0", "4.0", "5.0"};
    public static String[] numbersSetTwo = {"5.0", "4.0", "3.0", "2.0", "1.0"};
    public static RI stub;
    public static String sum;

    public static void main(String[] args) {
        try {
            RAM.Connection();
            Registry registry = LocateRegistry.getRegistry(null);
            for (int i = 0; i < numbersSetOne.length; i++) {
                stub = (RI) registry.lookup(numbersSetOne[i]);
            }
            System.out.println("Please enter five numbers: ");
            for (int j = 0; j < numbersSetOne.length; j++) {
                numbersSetOne[j] = scan.next();
            }

            for (int i = 0; i < numbersSetTwo.length; i++) {
                stub = (RI) registry.lookup(numbersSetTwo[i]);
            }
            System.out.println("Please enter five more numbers: ");
            for (int j = 0; j < numbersSetTwo.length; j++) {
                numbersSetTwo[j] = scan.next();
            }
            stub.DoubleAdding(numbersSetOne, numbersSetTwo);
            if (Server.printStatus != 1) {
                sum = stub.printSum(numbersSetOne, numbersSetTwo);
                System.out.println(sum);
            }
            RAM.Disconnection();
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}