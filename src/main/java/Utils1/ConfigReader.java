package Utils1;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            InputStream is = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (is == null) {
                throw new RuntimeException("config.properties file not found in src/test/resources");
            }

            prop.load(is);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}