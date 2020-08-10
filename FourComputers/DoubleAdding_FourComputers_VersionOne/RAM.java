//First Come, First Serve algorithm

public class RAM {

    // This is an array that contains the statuses of both servers
    public static int[] serverStatuses = {ServerOne.serverOne_status, ServerTwo.serverTwo_status};

    // This denotes if a connection between the client and the server
    public static boolean connectStatus = false;

    // This is initializing the index of the array; it will be set in the code
    public static int index = serverStatuses.length + 1;

    // This is counting the number of servers that are not free
    public static int zeroChecker = 0;

    // This is what will be printed to the RAM computer's console and the client; it's right now a dummy message
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
        // RAM.Connection();
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
        // RAM.main(args);
    }

    public static void Disconnection () {
        if (Client.clientConnect == 1 && serverStatuses[index] == 0 && connectStatus == true) {
            Client.clientConnect = 0;
            connectStatus = false;
            serverStatuses[index] = 1;
            System.out.println("Disconnected. Server " + (index + 1) + " is now free.");
            index = serverStatuses.length + 1;
        }
        else {
            System.out.println(Client.clientConnect);
            System.out.println(serverStatuses[index]);
            System.out.println(connectStatus);
        }
    }
}