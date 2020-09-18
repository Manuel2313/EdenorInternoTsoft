package helper;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Utils_OS {

    public static String getWorkingDirectory(){
        return System.getProperty("user.dir");
    }

    public static String getIP() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostAddress();
    }
}