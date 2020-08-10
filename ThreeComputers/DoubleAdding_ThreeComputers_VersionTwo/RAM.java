//First Come, First Serve algorithm

public class RAM {

    public static int[] serverStatuses = {Server.serverStatus};
    public static boolean connectStatus = false;
    public static int index = serverStatuses.length + 1;
    public static int zeroChecker = 0;
    public static String statusMsg = "hello";

    public static void main(String[] args) {
        System.out.println("Waiting to connect...");
        if (Client.clientConnect == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    Client.clientConnect = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    statusMsg = "Will be connected to server " + (index + 1);
                    break;
                }
                else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg = "Will not be able to connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg);
    }

    public static void Connection () {
        System.out.println("Waiting to connect...");
        if (Client.clientConnect == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    Client.clientConnect = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    statusMsg = "Connected to server " + (index + 1);
                    break;
                }
                else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg = "Cannot connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg);
    }

    public static void Disconnection () {
        if (Client.clientConnect == 1 && serverStatuses[index] == 0 && connectStatus == true) {
            Client.clientConnect = 0;
            connectStatus = false;
            Server.serverStatus = 1;
            index = serverStatuses.length + 1;
            System.out.println("Disconnected.");
        }
        else {
            System.out.println(Client.clientConnect);
            System.out.println(Server.serverStatus);
            System.out.println(connectStatus);
        }
    }
}