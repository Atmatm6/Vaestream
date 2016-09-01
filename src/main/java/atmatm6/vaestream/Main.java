package atmatm6.vaestream;

import atmatm6.vaestream.endpoint.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Main Worker Class
 */
public class Main {
    Logger log = LoggerFactory.getLogger("VAEStream Server");
    public static void main(String[] args) {
        try (ServerSocket so = new ServerSocket(9999)) {
            System.out.println("Begin Endpoint Initialization");
            Endpoint.init(so);

        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
