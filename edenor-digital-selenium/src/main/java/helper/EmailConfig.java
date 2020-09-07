package helper;

import java.util.Properties;

public class EmailConfig {
    private static String username;
    private static String password;

    private static Properties properties = new Properties();

    static {
        withUsername("automationed@firemail.cc");
        withPassword("Spambot2231");
        withServer("mail.cock.li");
        withPort("993");
        withProperty("mail.imap.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        withProperty("mail.imap.socketFactory.fallback", "false");
        withProperty("mail.imap.socketFactory.port", "993");
    }
    public static String getUsername() {
        return username;
    }

    public static void withUsername(String username) {
        EmailConfig.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void withPassword(String password) {
        EmailConfig.password = password;
    }

    public static Properties getProperties() {
        return properties;
    }

    public static void withPort(String port) {
        properties.put("mail.imap.port", port);
    }

    public static void withServer(String server) {
        properties.put("mail.imap.host", server);
    }

    private static void withProperty(String key, String value) {
        properties.setProperty(key, value);
    }
}
