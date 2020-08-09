import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientOne {
    
    // The Scanner is made so user input can be taken
    public static Scanner scan = new Scanner (System.in);

    // This is for whether the client is connected to a server or not.
    public static int clientConnect_one = 0;

    // This is for the first server and will be where all the numbers are stored; right now, it's a dummy list
    public static String[] numbers_one = {"1.0", "2.0", "3.0", "4.0", "5.0"};

    // This is for the second server and will be where all the numbers are stored; right now, it's a dummy list
    public static String[] numbers_two = {"1.0", "2.0", "3.0", "4.0", "5.0"};

    // The stub
    public static RI stub;

    // The sum of the elements in either array
    public static String sum;
    
    public static void main(String[] args) {
        try {

            // It will first run the Connection() method defined in the RAM
            RAM.Connection_ClientOne();

            // This if will check if the message from Connection() matches the message defined in the parentheses
            if (!(RAM.statusMsg.equals("Cannot connect now"))) {

                // Same two code blocks, just depends on which server the client connects to
                if (RAM.index == 0) {
                    Registry registry_one = LocateRegistry.getRegistry(1);
                    for (int i = 0; i < numbers_one.length; i++) {
                        stub = (RI) registry_one.lookup(numbers_one[i]);
                    }
                    System.out.println("Please enter five numbers: ");
                    for (int i = 0; i < numbers_one.length; i++) {
                        numbers_one[i] = scan.next();
                    }
                    stub.DoubleAdding(numbers_one);
                    sum = stub.printMsg(numbers_one);
                    System.out.println(sum);
                    RAM.Disconnection_ClientOne();
                } else if (RAM.index == 1) {
                    Registry registry_two = LocateRegistry.getRegistry(2);
                    for (int i = 0; i < numbers_two.length; i++) {
                        stub = (RI) registry_two.lookup(numbers_two[i]);
                    }
                    System.out.println("Please enter five numbers: ");
                    for (int i = 0; i < numbers_two.length; i++) {
                        numbers_two[i] = scan.next();
                    }
                    stub.DoubleAdding(numbers_two);
                    sum = stub.printMsg(numbers_two);
                    System.out.println(sum);
                    RAM.Disconnection_ClientOne();
                }
                // Registry registry_one = LocateRegistry.getRegistry(null);
                //Registry registry_two = LocateRegistry.getRegistry(null);
                /* for (int i = 0; i < numbers.length; i++) {
                    stub = (RI) registry.lookup(numbers[i]);
                }
                System.out.println("Please enter five numbers: ");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.next();
                }
                stub.DoubleAdding(numbers);
                sum = stub.printSum(numbers);
                System.out.println(sum);
                RAM.Disconnection(); */
            }
            /* else {
                System.out.println(RAM.statusMsg);
            } */
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}