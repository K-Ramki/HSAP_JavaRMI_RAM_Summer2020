import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientTwo {

    public static Scanner scan = new Scanner (System.in);
    public static int Two_ConnectStatus = 0;
    public static String[] numbers = {"1.0", "2.0", "3.0", "4.0", "5.0"};
    public static RI stub;
    public static String sum;

    public static void main(String[] args) {
        try {
            RAM.Connection_ClientTwo();
            if (!(RAM.statusMsg_ClientTwo.equals("Cannot connect now"))) {
                if (RAM.statusMsg_ClientTwo.equals("Client Two is connected to the Alpha Server")) {
                    Registry registry_one = LocateRegistry.getRegistry(2);
                    for (int i = 0; i < numbers.length; i++) {
                        stub = (RI) registry_one.lookup(numbers[i]);
                    }
                    System.out.println("Please enter five numbers: ");
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scan.next();
                    }
                    stub.DoubleAdding(numbers);
                    sum = stub.printSum(numbers);
                    System.out.println(sum);
                    RAM.Disconnection_ClientTwo();
                }
                else if (RAM.statusMsg_ClientTwo.equals("Client Two is connected to the Beta Server")) {
                    Registry registry_one = LocateRegistry.getRegistry(4);
                    for (int i = 0; i < numbers.length; i++) {
                        stub = (RI) registry_one.lookup(numbers[i]);
                    }
                    System.out.println("Please enter five numbers: ");
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scan.next();
                    }
                    stub.DoubleAdding(numbers);
                    sum = stub.printSum(numbers);
                    System.out.println("Your sum is " + sum);
                    RAM.Disconnection_ClientTwo();
                }
            }
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}