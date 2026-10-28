package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    // static block: chạy 1 lần duy nhất khi class được go lần đầu

    static  {
        // lấy file trong folder resources
        // =>> gtResourcesAsStream()
        try (InputStream in = ConfigReader.class.getResourceAsStream("/config.properties")){
            properties.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Khong doc duoc file config.properties", e);
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }





}
