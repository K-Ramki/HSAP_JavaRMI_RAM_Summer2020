import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerTwo extends Impl_RI{

    public static int serverTwo_status = 1;

    public ServerTwo() {}

    public static void main(String[] args) {
        System.out.println("Server 2 waiting");
        System.out.println(ClientOne.clientConnect_one);
        System.out.println(ClientTwo.clientConnect_two);
        try {
            if (serverTwo_status == 1 && ClientOne.clientConnect_one == 1) {
                Impl_RI obj_2 = new Impl_RI();
                RI stub_2 = (RI) UnicastRemoteObject.exportObject(obj_2, 2);
                Registry registry_2 = LocateRegistry.createRegistry(2);
                for (int i = 0; i < ClientOne.numbers_one.length; i++) {
                    registry_2.bind(ClientOne.numbers_one[i], stub_2);
                }
                System.out.println("Server 1 Ready");
            }
            else if (serverTwo_status == 1 && ClientTwo.clientConnect_two == 1) {
                Impl_RI obj_2 = new Impl_RI();
                RI stub_2 = (RI) UnicastRemoteObject.exportObject(obj_2, 2);
                Registry registry_2 = LocateRegistry.createRegistry(2);
                for (int i = 0; i < ClientTwo.numbers_one.length; i++) {
                    registry_2.bind(ClientTwo.numbers_one[i], stub_2);
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