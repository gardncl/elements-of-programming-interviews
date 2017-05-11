import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ImplementThreadPool {

    /*
    20.4
    */

    public static class WebServer {
        public static final int PORT = 8080;
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(PORT);
            for (;;) {
                Socket socket = serverSocket.accept();
                processReq(socket);
            }
        }

        private static void processReq(Socket socket) throws IOException{
            socket.close();
        }
    }


}
