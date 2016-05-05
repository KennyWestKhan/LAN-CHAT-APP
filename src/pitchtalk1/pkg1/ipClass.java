package pitchtalk1.pkg1;

import appPackages.Home;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class ipClass {
    public static String ipAddress;
    public ipClass(){ 
    try {
           
              InetAddress ip = InetAddress.getLocalHost();              
           System.out.println(ip.getHostAddress());
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            ipAddress = ip.getHostAddress();
            while(e.hasMoreElements()){
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
                while(ee.hasMoreElements()){
                    InetAddress i = (InetAddress) ee.nextElement();
                    System.out.println(i.getHostAddress());
                }
                
            }
    
} catch (Exception ex) {
            System.err.println(ex);
        }
}
}
