package go.g2academy.UrlDay13;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com/");
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();

            int i;
            while ((i = in.read()) != -1){
                System.out.print((char) i);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
