package A_interview.data.company.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServiceHandler implements Runnable {
    private Socket s;  //client connection
    private CRUDService crud;
    public ServiceHandler(Socket s, CRUDService crud) {
        this.s = s;
        this.crud = crud;
    } 
    
    public void run() {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {
            String input;
            while ((input = in.readLine()) != null) {
                // translate s to CRUD, will need to set up protocol
                // between client and server
                if (input.startsWith("getBuild")) {

                } else if (input.startsWith("storeBuild")) {

                } else if (input.startsWith("updateDependency")) {
                
                } else if (input.startsWith("findBuildOrder")) {

                }
            } 
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
