import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// Pretty much the same thing as ServerOne
public class ServerTwo extends Impl_RI {

    public static int serverTwo_status = 1;

    public ServerTwo () {}

    public static void main(String[] args) {
        try {
            if (serverTwo_status == 1) {
                Impl_RI obj_2 = new Impl_RI();
                RI stub_2 = (RI) UnicastRemoteObject.exportObject(obj_2, 2);
                Registry registry_2 = LocateRegistry.getRegistry("192.168.1.153");
                ;
                for (int i = 0; i < Client.numbers_two.length; i++) {
                    registry_2.bind(Client.numbers_two[i], stub_2);
                }
                System.out.println("Server 2 Ready");
            }
            else {
                System.out.println("Server 2 Occupied");
            }
        } catch (Exception e) {
            System.err.println("Server 2 Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}