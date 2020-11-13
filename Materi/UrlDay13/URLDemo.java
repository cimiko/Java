package go.g2academy.UrlDay13;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com/categories/29-tv-show");
//            URL url = new URL("http://localhost:8000/javabootcamp-web-app/hello");
//            URL url = new URL("http://localhost:8000/javabootcamp-web-app/hello?message=hello");


            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
            System.out.println("File: " + url.getPath());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
