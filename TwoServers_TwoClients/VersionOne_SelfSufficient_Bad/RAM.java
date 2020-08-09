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
        System.out.println("Client One Waiting to connect...");
        if (ClientOne.clientConnect_one == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    ClientOne.clientConnect_one = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    statusMsg = "Client 1 is connected to server " + (index + 1);
                    break;
                }
                else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg = "Client 1 cannot connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg);
        // RAM.Connection();

        System.out.println("Client Two Waiting to connect...");
        if (ClientTwo.clientConnect_two == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    ClientTwo.clientConnect_two = 1;
                    serverStatuses[i] = 0;
                    index = i;
                    connectStatus = true;
                    statusMsg = "Client 2 is connected to server " + (index + 1);
                    break;
                }
                else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg = "Client 2 cannot connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg);
    }

    public static void Connection_ClientOne () {
        System.out.println("Waiting to connect...");
        if (ClientOne.clientConnect_one == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    ClientOne.clientConnect_one = 1;
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

    public static void Connection_ClientTwo () {
        System.out.println("Waiting to connect...");
        if (ClientTwo.clientConnect_two == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    ClientTwo.clientConnect_two = 1;
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

    public static void Disconnection_ClientOne () {
        if (ClientOne.clientConnect_one == 1 && serverStatuses[index] == 0 && connectStatus == true) {
            ClientOne.clientConnect_one = 0;
            connectStatus = false;
            serverStatuses[index] = 1;
            System.out.println("Disconnected. Server " + (index + 1) + " is now free.");
            index = serverStatuses.length + 1;
        } else {
            System.out.println(ClientOne.clientConnect_one);
            System.out.println(serverStatuses[index]);
            System.out.println(connectStatus);
        }
    }

    public static void Disconnection_ClientTwo () {
        if (ClientTwo.clientConnect_two == 1 && serverStatuses[index] == 0 && connectStatus == true) {
            ClientTwo.clientConnect_two = 0;
            connectStatus = false;
            serverStatuses[index] = 1;
            System.out.println("Disconnected. Server " + (index + 1) + " is now free.");
            index = serverStatuses.length + 1;
        } else {
            System.out.println(ClientTwo.clientConnect_two);
            System.out.println(serverStatuses[index]);
            System.out.println(connectStatus);
        }
    }
}