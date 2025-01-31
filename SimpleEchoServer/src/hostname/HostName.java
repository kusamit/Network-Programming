//Given the address, find the hostname, ip Address of Host and manual Host ip by  getByName()
package hostname;
import java.net.*;

//Reverse Test
public class HostName {
    
    public static void main(String[] args) throws UnknownHostException {
    
        //getHostName provides only the string valueof nameof the host
        InetAddress iau = InetAddress.getLocalHost();
        System.out.println(iau.getHostName());
        
        //getHostName provides only the dotted valueof name of the host (Ip Address)
        InetAddress iiu = InetAddress.getLocalHost();
        System.out.println(iiu.getCanonicalHostName());
      
        //provide to result the name which is written in dot like 
        //ip address by its Host Address in string
        InetAddress ia = InetAddress.getByName("192.5");
        System.out.println(ia.getCanonicalHostName());
    }
}