package networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLclassEample {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://write.geeksforgeeks.org/post/3038131");

        String s = url.toString();

        System.out.println("URL :" + s);

        System.out.println("Protocals : "+ url.getProtocol());

        System.out.println("HostName :" + url.getHost());

        System.out.println("File Name :"+url.getFile());

        System.out.println("Default Port : "+url.getDefaultPort());

        System.out.println("Path :" + url.getPath());
    }
}
