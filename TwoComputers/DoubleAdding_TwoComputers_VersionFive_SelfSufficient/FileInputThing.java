import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputThing {

    public static int size = 0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("C:/Users/karth/HSAP/JavaRMI/ServerClientRAM_numbers.txt");
        Scanner scan = new Scanner (file);

        while (scan.hasNextLine()) {
            size++;
            scan.nextLine();
        }

        if (size == 0) {
            System.out.println("Your file has nothing.");
        } else if (size == 1) {
            System.out.println("Your file has one element.");
        } else {
            System.out.println ("Your file has " + size + " elements.");
        }
    }
}