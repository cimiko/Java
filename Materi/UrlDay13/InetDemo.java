package go.g2academy.UrlDay13;

import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("https://www.vidio.com/");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
