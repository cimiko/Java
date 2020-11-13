package go.g2academy.PropertiesDay13;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class AppConfigStore {

    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("server", "localhost");
        prop.setProperty("port", "666");

        try {
            OutputStream output = new FileOutputStream("config.properties");
            prop.store(output, null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
