import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerOne extends Impl_RI{

    public static int serverOne_status = 1;

    public ServerOne() {}

    public static void main(String[] args) {
        System.out.println("Server 1 waiting");
        System.out.println(ClientOne.clientConnect_one);
        System.out.println(ClientTwo.clientConnect_two);
        try {
            if (serverOne_status == 1 && ClientOne.clientConnect_one == 1) {
                Impl_RI obj_1 = new Impl_RI();
                RI stub_1 = (RI) UnicastRemoteObject.exportObject(obj_1, 1);
                Registry registry_1 = LocateRegistry.createRegistry(1);
                for (int i = 0; i < ClientOne.numbers_one.length; i++) {
                    registry_1.bind(ClientOne.numbers_one[i], stub_1);
                }
                System.out.println("Server 1 Ready");
            }
            else if (serverOne_status == 1 && ClientTwo.clientConnect_two == 1) {
                Impl_RI obj_1 = new Impl_RI();
                RI stub_1 = (RI) UnicastRemoteObject.exportObject(obj_1, 1);
                Registry registry_1 = LocateRegistry.createRegistry(1);
                for (int i = 0; i < ClientTwo.numbers_one.length; i++) {
                    registry_1.bind(ClientTwo.numbers_one[i], stub_1);
                }
                System.out.println("Server 1 Ready");
            }
            else {
                System.out.println("Server 1 Occupied");
            }
        } catch (Exception e) {
            System.err.println("Server 1 Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}