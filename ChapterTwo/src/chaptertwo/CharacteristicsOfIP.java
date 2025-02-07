
package chaptertwo;

import java.net.*;
import java.net.UnknownHostException;

public class CharacteristicsOfIP {
    public static void main(String[] args) {
         
        try{
            InetAddress address = InetAddress.getByName("localhost");
            if(address.isAnyLocalAddress()){
                System.out.println(address+" This is a wildcard IP address.");
            }
            if(address.isLoopbackAddress()){
                System.out.println(address+"This is a loopback IP address.");
            }
            if(address.isLinkLocalAddress()){
                System.out.println(address+"This is a link-local IP address.");
            }
            else if(address.isSiteLocalAddress()){
                System.out.println(address+"This is a site-local IP address.");
            }else{
                System.out.println(address+"This is a global IP address.");
            }
            if(address.isMulticastAddress()){
                if(address.isMCGlobal()){
                    System.out.println(address+" This is a global multicast IP address.");
                }else if(address.isMCOrgLocal()){
                    System.out.println(address+"This is an organization wide multicast IP address.");
                }else if(address.isMCSiteLocal()){
                    System.out.println(address+"This is a site wide multicast IP address.");
                }else if(address.isMCLinkLocal()){
                    System.out.println(address+"This is a subnet wide multicast IP address.");
                }else if(address.isMCNodeLocal()){
                    System.out.println(address+"This is an interface-local multicast IP address.");
                }else{
                    System.out.println(address+" This is an unknown multicast IP address.");
                }
            }else{
                System.out.println(address+"This is a unicast IP address.");
            }
        }catch(UnknownHostException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}