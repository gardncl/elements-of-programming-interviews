import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ImplementThreadPool {

    /*
    20.4

    Suppose you find that the program has poor performance because
    it frequently blocks on I/O. What steps could you take to
    improve the program's performance? Feel free to use any utilities
    from the standard library, including concurrency classes.
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
