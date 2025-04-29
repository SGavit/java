package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();

        System.out.println("InetAddress of the local Host : "+address);

        String hostName = address.getHostName();

        System.out.println("\n Host nae of the Local Host :"+hostName);
    }
}
