public class RAM {

    //  static int serverAlpha = ServerAlpha.AlphaStatus;
    // public static int serverBeta = ServerBeta.BetaStatus;
    public static int[] serverStatuses = {ServerAlpha.AlphaStatus, ServerBeta.BetaStatus};
    public static boolean isConnected = false;
    public static int index = serverStatuses.length + 1;
    // public static int indexBeta = serverStatuses.length + 1;
    public static int zeroChecker = 0;
    public static boolean isRun = false;
    /* public static Boolean clientOneconnectorAlpha = false;
    public static Boolean clientOneconnectorBeta = false;
    public static Boolean clientTwoconnectorAlpha = false;
    public static Boolean clientTwoconnectorBeta = false; */
    public static String statusMsg_ClientOne = "hello";
    public static String statusMsg_ClientTwo = "hello";

    public static void main(String[] args) {
        isRun = true;
        System.out.println("Waiting to connect...");
        if (ClientOne.One_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientOne.One_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientOne = "Client One is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientOne = "Client One is connected to the Beta Server";
                    }
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg_ClientOne = "Client One cannot connect to a server now";
                    }
                }
            }
        }
        System.out.println(statusMsg_ClientOne);
        zeroChecker = 0;

        if (ClientTwo.Two_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientTwo.Two_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientTwo = "Client Two is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientTwo = "Client Two is connected to the Beta Server";
                    }
                    // System.out.println(isRun);
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        // statusMsg_ClientOne = "Cannot connect now";
                        statusMsg_ClientTwo = "Client Two cannot connect to a server now";
                    }
                }
            }
        }
        // System.out.println(statusMsg_ClientOne);
        System.out.println(statusMsg_ClientTwo);
        zeroChecker = 0;
    }

    /*
     * public static void Connection_ClientOne() {
     * System.out.println("Waiting to connect..."); if (ClientOne.One_ConnectStatus
     * == 0) { for (int i = 0; i < serverStatuses.length; i++) { if
     * (serverStatuses[i] == 1) { serverStatuses[i] = 0;
     * System.out.println(serverStatuses[i]); ClientOne.One_ConnectStatus = 1; index
     * = i; isConnected = true; if (index == 0) { // ServerAlpha.AlphaStatus = 0;
     * statusMsg = "You are connected to the Alpha Server"; } else if (index == 1) {
     * // ServerBeta.BetaStatus = 0; statusMsg =
     * "You are connected to the Beta Server"; } // index = 1; break; } else {
     * zeroChecker++; if (zeroChecker == serverStatuses.length) { statusMsg =
     * "Cannot connect now"; } } } } System.out.println(statusMsg); }
     * 
     * public static void Connection_ClientTwo() { // System.out.println(index);
     * System.out.println("Waiting to connect...");
     * System.out.println(serverStatuses[0]); System.out.println(serverStatuses[1]);
     * if (ClientTwo.Two_ConnectStatus == 0) { for (int i = 0; i <
     * serverStatuses.length; i++) { if (serverStatuses[i] == 1) { serverStatuses[i]
     * = 0; ClientTwo.Two_ConnectStatus = 1; index = i; isConnected = true;
     * System.out.println(index); // System.out.println(clientOneconnectorAlpha); //
     * System.out.println(clientOneconnectorBeta); if (index == 0) { statusMsg =
     * "You are connected to the Alpha Server"; } else if (index == 1) { statusMsg =
     * "You are connected to the Beta Server"; } index = 1; break; } else {
     * zeroChecker++; if (zeroChecker == serverStatuses.length) { statusMsg =
     * "Cannot connect now"; } } } } System.out.println(statusMsg); }
     */

    public static void Connection_ClientOne () {
        // serverStatuses = server;
        // System.out.println(serverAlpha);
        // System.out.println(serverBeta);
        /*
         * System.out.println(serverStatuses[0]); System.out.println(serverStatuses[1]);
         * System.out.println(index); System.out.println("Waiting to connect"); for (int
         * i = 0; i < serverStatuses.length; i++) { if (serverStatuses[i] == 1) {
         * serverStatuses[i] = 0; index = i; System.out.println(index); isConnected =
         * true; if (index == 0) { statusMsg = "You are connected to the Alpha Server";
         * // serverAlpha = 0; System.out.println(serverStatuses[index]); } else if
         * (index == 1) { statusMsg = "You are connected to the Beta Server"; //
         * serverStatuses[index] = 0; } break; } else { zeroChecker++; if (zeroChecker
         * == serverStatuses.length) { statusMsg = "Cannot connect now"; } } }
         * System.out.println(serverStatuses[0]); System.out.println(serverStatuses[1]);
         * System.out.println(statusMsg);
         */
        isRun = true;
        System.out.println("Waiting to connect...");
        if (ClientOne.One_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientOne.One_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientOne = "Client One is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientOne = "Client One is connected to the Beta Server";
                    }
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg_ClientOne = "Cannot connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg_ClientOne);
        zeroChecker = 0;

        if (ClientTwo.Two_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientTwo.Two_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientTwo = "Client Two is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientTwo = "Client Two is connected to the Beta Server";
                    }
                    // System.out.println(isRun);
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg_ClientTwo = "Cannot connect now";
                    }
                }
            }
        }
        // System.out.println(statusMsg_ClientTwo);
        zeroChecker = 0;
    }

    public static void Connection_ClientTwo () {
        // serverStatuses = server;
        // System.out.println(serverAlpha);
        // System.out.println(serverBeta);
        /*
         * System.out.println(serverStatuses[0]); System.out.println(serverStatuses[1]);
         * System.out.println(index); System.out.println("Waiting to connect"); for (int
         * i = 0; i < serverStatuses.length; i++) { if (serverStatuses[i] == 1) {
         * serverStatuses[i] = 0; index = i; System.out.println(index); isConnected =
         * true; if (index == 0) { statusMsg = "You are connected to the Alpha Server";
         * // serverAlpha = 0; System.out.println(serverStatuses[index]); } else if
         * (index == 1) { statusMsg = "You are connected to the Beta Server"; //
         * serverStatuses[index] = 0; } break; } else { zeroChecker++; if (zeroChecker
         * == serverStatuses.length) { statusMsg = "Cannot connect now"; } } }
         * System.out.println(serverStatuses[0]); System.out.println(serverStatuses[1]);
         * System.out.println(statusMsg);
         */
        isRun = true;
        System.out.println("Waiting to connect...");
        if (ClientOne.One_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientOne.One_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientOne = "Client One is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientOne = "Client One is connected to the Beta Server";
                    }
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg_ClientOne = "Cannot connect now";
                    }
                }
            }
        }
        // System.out.println(statusMsg_ClientOne);
        zeroChecker = 0;

        if (ClientTwo.Two_ConnectStatus == 0) {
            for (int i = 0; i < serverStatuses.length; i++) {
                if (serverStatuses[i] == 1) {
                    serverStatuses[i] = 0;
                    ClientTwo.Two_ConnectStatus = 1;
                    index = i;
                    isConnected = true;
                    if (index == 0) {
                        statusMsg_ClientTwo = "Client Two is connected to the Alpha Server";
                    } else if (index == 1) {
                        statusMsg_ClientTwo = "Client Two is connected to the Beta Server";
                    }
                    // System.out.println(isRun);
                    break;
                } else {
                    zeroChecker++;
                    if (zeroChecker == serverStatuses.length) {
                        statusMsg_ClientTwo = "Cannot connect now";
                    }
                }
            }
        }
        System.out.println(statusMsg_ClientTwo);
        zeroChecker = 0;
    }

    public static void Disconnection_ClientOne() {
        if (serverStatuses[index] == 0 && isConnected == true) {
            ClientOne.One_ConnectStatus = 0;
            isConnected = false;
            serverStatuses[index] = 1;
            if (statusMsg_ClientOne.equals("Client One is connected to the Alpha Server")) {
                System.out.println(statusMsg_ClientOne = "Disconnected. Alpha Server is now free.");
                // index = 0;
            } else if (statusMsg_ClientOne.equals("Client One is connected to the Beta Server")) {
                System.out.println("Disconnected. Beta Server is now free.");
                // index = 1;
            }
            index = serverStatuses.length + 1;
            // return statusMsg;
        } else {
            System.out.println(ClientOne.One_ConnectStatus);
            System.out.println(serverStatuses[index]);
            System.out.println(index);
            System.out.println(isConnected);
            // return null;
        }
    }

    public static void Disconnection_ClientTwo() {
        if (serverStatuses[index] == 0 && isConnected == true) {
            ClientTwo.Two_ConnectStatus = 0;
            isConnected = false;
            serverStatuses[index] = 1;
            if (statusMsg_ClientTwo.equals("Client Two is connected to the Alpha Server")) {
                System.out.println("Disconnected. Alpha Server is now free.");
                // index = 0;
            } else if (statusMsg_ClientTwo.equals("Client Two is connected to the Beta Server")) {
                System.out.println("Disconnected. Beta Server is now free.");
                // index = 1;
            }
            index = serverStatuses.length + 1;
            // return statusMsg;
        } else {
            System.out.println(ClientTwo.Two_ConnectStatus);
            System.out.println(serverStatuses[index]);
            System.out.println(index);
            System.out.println(isConnected);
            // return null;
        }
    }
}