import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerBeta extends Impl_RI {

    public static int BetaStatus = 1;

    public ServerBeta () {}

    public static void main(String[] args) {
        try {
            System.out.println("Beta Server waiting");
            // System.out.println(ClientOne.One_ConnectStatus);
            // System.out.println(ClientTwo.Two_ConnectStatus);
            if (BetaStatus == 1) {
                // System.out.println(RAM.isRun);
                // if (RAM.isRun == true) {
                    // if (ClientOne.One_ConnectStatus == 1) {
                        Impl_RI obj_1 = new Impl_RI();
                        RI stub_1 = (RI) UnicastRemoteObject.exportObject(obj_1, 3);
                        Registry registry_1 = LocateRegistry.createRegistry(3);
                        for(int i = 0; i < ClientOne.numbers.length; i++) {
                            registry_1.bind(ClientOne.numbers[i], stub_1);
                        }
                        // System.out.println("Alpha Server Connected");
                        // System.out.println("Status: " + AlphaStatus);
                        // }
                        // else if (ClientTwo.Two_ConnectStatus == 1) {
                        Impl_RI obj_2 = new Impl_RI();
                        RI stub_2 = (RI) UnicastRemoteObject.exportObject(obj_2, 4);
                        Registry registry_2 = LocateRegistry.createRegistry(4);
                        for (int i = 0; i < ClientTwo.numbers.length; i++) {
                            registry_2.bind(ClientTwo.numbers[i], stub_2);
                        }
                        System.out.println("Beta Server Connected");
                        // System.out.println("Status: " + AlphaStatus);
                    // }
                // }
                // else {
                //    System.out.println(RAM.isRun);
                // }
            }
            else {
                System.out.println ("Beta Server Busy");
            }
        } catch (Exception e) {
            System.err.println("Beta Server Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}