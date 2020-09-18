package helper;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.search.SearchTerm;
import java.util.Arrays;

public class SearchHeader extends SearchTerm {

    private final String header;
    private String value;

    public SearchHeader(String header, String value) {
        this.header = header;
        this.value = value;
    }

    @Override
    public boolean match(Message msg) {
        try {
            return Arrays.toString(msg.getHeader(header)).contains(this.value);
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}