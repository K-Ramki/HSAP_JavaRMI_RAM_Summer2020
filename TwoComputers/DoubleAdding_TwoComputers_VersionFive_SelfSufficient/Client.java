import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    
    public static int clientConnect = 0;
    public static String[] numbers = {"1.0", "2.0"};
    public static RI stub;
    public static String sum;
    public static int size;

    public static void main(String[] args) {
        try {
            RAM.Connection();
            Registry registry = LocateRegistry.getRegistry(null);
            for (int i = 0; i < Client.numbers.length; i++) {
                stub = (RI) registry.lookup(numbers[i]);
            }
            FileInputThing.main(args);
            numbers = new String[FileInputThing.size];
            // System.out.println(FileInputThing.size);
            for (int i = 0; i < numbers.length; i++) {
                String num = Files.readAllLines(Paths.get("C:/Users/karth/HSAP/JavaRMI/ServerClientRAM_numbers.txt")).get(i);
                numbers[i] = num;
            }
            stub.DoubleAdding(numbers);
            sum = stub.printSum(numbers);
            System.out.println(sum);
            RAM.Disconnection();
        } catch (NumberFormatException e) {
            System.err.println("Your file has something other than a number at one point. Please check your file to make sure it has number(s).");
        } catch (Exception e) {
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}