package go.g2academy.SocketDay13;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyOtherClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF("Hello Server, it's me My Other Client");
//            out.writeUTF("shutdown");
            out.flush();
            out.close();

            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
