package Core;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class PageLoader {

    public static String getDirectingURL(String request) throws IOException{
        return getPageURL("src/test/resources/pages.properties", request);
    }

    public static String getCheckingURL(String request) throws IOException{
        return getPageURL("src/test/resources/url_check.properties", request);
    }

    private static String getPageURL(String path, String request) throws IOException {

        Properties prop = new Properties();
        InputStream input = null;
        String page;

        try {
            // Get the file
            File file = new File(path);
            input = new FileInputStream(file);

            // Load a properties file
            prop.load(input);

            // Get the property value
            page = prop.getProperty(request.toLowerCase());

        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return page;
    }
}
