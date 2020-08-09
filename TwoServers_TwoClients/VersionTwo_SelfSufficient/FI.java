import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FI {

    public static Scanner forFile = new Scanner(System.in);
    public static String fileName;
    public static int size = 0;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("What is the filepath of your file? Please only put .txt files (and make sure to append .txt to the file name when typing)");
        fileName = forFile.next();
        File file = new File (fileName);
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