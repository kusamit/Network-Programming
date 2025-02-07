
package chaptertwo;

import java.net.*;

public class InternetAddressByName {
   public static void PrintIPAddress(String host) {
      try {
         InetAddress address = InetAddress.getByName(host);
         // Display the hostname
         System.out.println("Host Name: " + address.getHostName());
         // Display the canonical hostname
         System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
         System.out.println("Host Address: " + address.getHostAddress());
         System.out.print("IP Address in Byte Format: ");
         // Get the raw IP address in byte array
         byte[] ipBytes = address.getAddress();
         for (byte b : ipBytes) {
            System.out.print((b & 0xFF) + ".");
         }
         System.out.println();
      } catch (UnknownHostException e) {
         System.out.println("Error: " + e.getMessage());
      }
   }

   public static void main(String[] args) {
      String reddit = "www.reddit.com";
      String localhost = "localhost";
      String yahoo = "www.Yahoo.com";
      PrintIPAddress(localhost);
      PrintIPAddress(yahoo);
      PrintIPAddress(reddit);

     // PrintHost("163.70.143.35");
   }
}