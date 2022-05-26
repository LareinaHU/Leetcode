package A_interview.data.company;

import java.net.ServerSocket;
import java.net.Socket;

import A_interview.data.company.service.CRUDService;
import A_interview.data.company.service.ServiceHandler;

public class Main {



    public static void main(String[] args) {
        CRUDService crud = new CRUDService();
        int portNumber = Integer.parseInt(args[0]);
        // server accepting connection until program interrupted.
        while (true) {
            try {
                //listening on this portnumber, whenever there is user connection
                ServerSocket serverSocket = new ServerSocket(portNumber);

                // new thread to handle user request which is responsibility of service handler
                Socket clientSocket = serverSocket.accept();
                ServiceHandler handler = new ServiceHandler(clientSocket, crud);
                new Thread(handler).start();
            } catch (Exception e) {

            }
        }
    }

}
