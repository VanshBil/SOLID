package net.media.training.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class NetworkAndDatabaseEncoding implements EncodingModule{

    public URL getURL(){
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public InputStream getInputStream(URL url){
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in;
    }

    public String getInputString(InputStreamReader reader){
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString1.toString();
    }
    public void encodeData() {
        URL url=getURL();
        InputStream in = getInputStream(url);
        InputStreamReader reader = new InputStreamReader(in);
        String inputString=getInputString(reader);
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
