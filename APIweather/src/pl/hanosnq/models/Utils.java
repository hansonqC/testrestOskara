package pl.hanosnq.models;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lukasz on 2017-09-23.
 */
public class Utils {
    public static String makeHttpRequest(String url){

        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            StringBuilder builder = new StringBuilder();
            int read = 0;
            while ((read = urlConnection.getInputStream().read()) != -1)){
                builder.append((char) read);
            }
            System.out.println(builder.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return null;
    }
}
