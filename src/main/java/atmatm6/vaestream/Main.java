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
    public static Logger log = LoggerFactory.getLogger("VAEStream Server");
    public static void main(String[] args) throws IOException {
        ServerSocket so = new ServerSocket(9999);
        log.info("Begin Endpoint Initialization");
        Endpoint.init(so);
    }
}
