package checkipversion;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckIp {

    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) return 4;
        else if (address.length == 16) return 6;
        else return -1;
    }

    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println("Local IP: " + ia);
            System.out.println("IP Version: " + getVersion(ia));
        } catch (UnknownHostException e) {
            System.out.println("Error retrieving local IP address: " + e.getMessage());
        }

        try {
            String ip = "1000:0ac3:22a2:0000:0000:4b3c:0504:1234"; // IPv6 address
            InetAddress ia2 = InetAddress.getByName(ip);
            System.out.println("Given IP: " + ia2);
            System.out.println("IP Version: " + getVersion(ia2));
        } catch (UnknownHostException e) { // Fix: Changed UnknownError to UnknownHostException
            System.out.println("Error resolving given IP address: " + e.getMessage());
        }
    }
}