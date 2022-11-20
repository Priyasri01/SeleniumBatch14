package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

    public static Properties read(String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();

        properties.load(fileInputStream);

        fileInputStream.close();

        return properties;
    }


}
