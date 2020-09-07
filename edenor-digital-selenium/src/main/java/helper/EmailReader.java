package helper;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailReader {
    public static final String FOLDER = "INBOX";
    private Folder folder;
    private Store imapSession;


    public EmailReader(Properties properties) {
        this.imapSession = getSession(properties, "imap");
    }

    private Store getSession(Properties properties, String protocol) {
        try {
            return Session.getDefaultInstance(properties).getStore(protocol);
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
            return null;
        }
    }


    public EmailReader connect(String user, String password) throws MessagingException {
        imapSession.connect(user, password);
        return this;
    }

    private Folder openFolder(Store imapSession, String folderName) throws MessagingException {
        Folder folder = imapSession.getFolder(folderName);
        folder.open(Folder.READ_ONLY);
        return folder;
    }


    private Message[] getMessagesWithHeader(SearchHeader searchTerm) throws MessagingException {
        this.folder = openFolder(imapSession, FOLDER);
        Message[] messages = folder.search(searchTerm);
        return messages;
    }

    public List<Message> getAllMessagesForUser(String userMail) {
        List<Message> messages = new ArrayList<>();
        try {
            messages = Arrays.asList(getMessagesWithHeader(new SearchHeader("To", userMail)));
        } catch (MessagingException e) {
        }
        return messages;
    }
    public Message getLastMail() throws MessagingException {
        this.folder = openFolder(imapSession, FOLDER);
        Message message = folder.getMessage(folder.getMessageCount());
        return message;
    }

    //public String getVerificationCode(Message message) throws IOException, MessagingException {
        //String codigo = null;
        //		Pattern pattern = Pattern.compile("[email:\\s+[0-9]{4}]");
        //String messageContent = null;
        //Multipart multi;
        //MimeBodyPart part;
        //try {
            //multi = ((Multipart)message.getContent());

            //part = (MimeBodyPart)multi.getBodyPart(0);
            //messageContent = part.getContent().toString();
        //} catch (IOException e) {
           // e.printStackTrace();
        //} catch (MessagingException e) {
          //  e.printStackTrace();
        //}
        //		Matcher matcher = pattern.matcher(messageContent);
            //int k = part.getContent().lastIndexOf("email: ");

            //return part.getContent().substring(k+7, k+11);
        //		if (matcher.find()) {
        //			codigo = matcher.group(0);
        //			println codigo
        //		}
        //		//return codigo;
    //}

    public EmailReader close() {
        try {
            folder.close(false);
            imapSession.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return this;
    }
}
