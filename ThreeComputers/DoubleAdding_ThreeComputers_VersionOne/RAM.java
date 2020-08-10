//First Come, First Serve algorithm

public class RAM {

    public static int[] serverStatuses = {Server.serverStatus};
    public static boolean connectStatus = false;
    public static int index = serverStatuses.length + 1;
    public static int zeroChecker = 0;
    public static String errorMsg = "hello";

    /* public static void Connection () {
        if (Client.clientConnect == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    Client.clientConnect = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    break;
                }
                else {
                    // System.out.println(zeroChecker);
                    zeroChecker++;
                }
            }
        }
        // System.out.println(zeroChecker);
        if (zeroChecker == serverStatuses.length) {
            errorMsg = "Cannot connect now; please try again later";
            // System.out.println(errorMsg);
        }
    } */

    public static void main(String[] args) {
        if (Client.clientConnect == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    Client.clientConnect = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    break;
                }
                else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        errorMsg = "Cannot connect now; please try again later";
                    }
                }
            }
        }
        // if (zeroChecker == serverStatuses.length) {
        //     errorMsg = "Cannot connect now; please try again later";
        // }
    }

    public static void Disconnection () {
        if (Client.clientConnect == 1 && serverStatuses[index] == 0 && connectStatus == true) {
            Client.clientConnect = 0;
            connectStatus = false;
            Server.serverStatus = 1;
            index = serverStatuses.length + 1;
        }
        else {
            System.out.println(Client.clientConnect);
            System.out.println(Server.serverStatus);
            System.out.println(connectStatus);
        }
    }
}