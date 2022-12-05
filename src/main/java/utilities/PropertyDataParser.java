package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDataParser {
    public static Properties props(String file_name) {
     Properties properties = new Properties();
        File file_dir = new File("src/main/resources",file_name);
        FileInputStream fis;
        try{
            fis = new FileInputStream(file_dir.getAbsolutePath());
        }
        catch (FileNotFoundException e){
            throw  new RuntimeException(e);
        }
        try{
            properties.load(fis);
        }
        catch (IOException e){
            throw  new RuntimeException(e);
        }
      return properties;
    }
}
