package atmatm6.vaestream.endpoint;

import java.net.ServerSocket;
import java.util.concurrent.ThreadFactory;

/**
 * VAEStream Endpoint
 */
public class Endpoint {
    public static ServerSocket so;
    public Endpoint(ServerSocket so){
        this.so = so;
    }
    public static void init(ServerSocket so){
        new Endpoint(so);
        Thread endThread = new Thread(new EndpointThread());
    }
}