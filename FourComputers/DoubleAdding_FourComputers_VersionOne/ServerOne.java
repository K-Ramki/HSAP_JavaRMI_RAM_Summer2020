import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerOne extends Impl_RI {

    // Indication of server availability; 1 means the server is available; 0 means the server is busy
    public static int serverOne_status = 1;

    public ServerOne () {}

    public static void main(String[] args) {

        // It will try to do the thing in the try section; if it runs into an exception, it goes to the catch section
        try {

            // Checks the server availability and will perform the actions in the if section if the server is available
            if (serverOne_status == 1) {

                // Creates a new instance of the Impl_RI() class
                Impl_RI obj_1 = new Impl_RI();

                // Creates a new instance of the RI interface; this is a stub
                RI stub_1 = (RI) UnicastRemoteObject.exportObject(obj_1, 1);

                // Creates a new registry with port (IP address) of 1
                Registry registry_1 = LocateRegistry.getRegistry("rareamber.ncat.edu");

                // Loops through the elements of the Client's numbers
                for (int i = 0; i < Client.numbers_one.length; i++) {

                    // Binds the stub to each element of the Client's numbers
                    registry_1.bind(Client.numbers_one[i], stub_1);
                }

                // Prints this if the server is available (based on server status)
                System.out.println("Server 1 Ready");
            }

            // Checks the server availability and will perform the actions in the else section if the server is not available
            else {

                // Prints this if the server is not available (based on server status)
                System.out.println("Server 1 Occupied");
            }
        } catch (Exception e) {

            // Does this if there is an exception somewhere in the program
            System.err.println("Server 1 Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}