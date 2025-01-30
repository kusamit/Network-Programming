
package Two;
import java.net.*;
//Using Direct Method
//public class JavaInternetAddressByName {
//    public static void main(String[] args) {
//        try
//        {

//            InetAddress address = InetAddress.getByName("www.sajatbajracharya.com.np");
//            System.out.println(address);
//        }
//        catch(UnknownHostException ex)
//        {
//            System.out.println("Couldnot find www.javatpoint.com");
//        }
//    }
//}
public class JavaInternetAddressByName{
    //using the static method
public static void printIpAddress(String host) {
    
        try
        {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address);
        }
        catch(UnknownHostException ex)
        {
            System.out.println("Unknown host exception" + ex.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception" +e.getMessage());
        }
        }
    public static void main(String[] args) {
       String facebook = "www.google.com";
       printIpAddress(facebook);
       String MyLocalIp = "192.168.30.1";
       printIpAddress(MyLocalIp);
    }
}
