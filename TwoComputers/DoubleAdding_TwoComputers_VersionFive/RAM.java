public class RAM {
    Client client = new Client ();
    Server server = new Server ();

    public static void Connection () {
        if (Client.clientConnect == 0 && Server.serverStatus == 1) {
            Client.clientConnect = 1;
            Server.serverStatus = 0;
        }
        else {
            // Debugging
            // System.out.println(Client.clientConnect);
            // System.out.println(Server.serverStatus);

            // Recursive definition to keep checking if other servers are available
            // More powerful/useful for multiple clients/servers
            // Will throw a Stack Overflow Error
            // Connection(clientConnect, next serverStatus);

            // Error Message
            System.out.println("The server is not available right now. Please try again later.");
        }
    }

    public static void Disconnection () {
        if (Client.clientConnect == 1 && Server.serverStatus == 0) {
            Client.clientConnect = 0;
            Server.serverStatus = 1;
        }
        else {
            // Debugging
            System.out.println(Client.clientConnect);
            System.out.println(Server.serverStatus);
        }
    }
}