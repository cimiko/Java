package go.g2academy.UrlDay13;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            for (int i = 1; i <= 8; i++) {
                System.out.println(connection.getHeaderFieldKey(i) + " = " + connection.getHeaderField(i));

            }

            connection.disconnect();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
