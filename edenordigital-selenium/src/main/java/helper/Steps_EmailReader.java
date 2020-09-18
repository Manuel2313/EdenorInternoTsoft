package helper;

import modelBase.Steps_Base;
import org.openqa.selenium.WebDriver;

public class Steps_EmailReader extends Steps_Base {
    public Steps_EmailReader(WebDriver driver) {
        super(driver);
    }
    public enum EmailAccount {
        GMAIL("pruebadeqa03@gmail.com","Edenor2018","imap.gmail.com"),//gmail para generar multiples
        GMAIL_YA_REGISTRADO("pruebadeqa01@gmail.com","Edenor2018","imap.gmail.com"),
        COCKLI("automationed@firemail.cc","Spambot2231","mail.cock.li");
        //COCKLI es una cuenta de mail con muchos sub users dentro.

        private String user;
        private String password;

        private String IMAPserver;

        private EmailAccount(String user,String password,String IMAPserver) {
            this.user = user;
            this.password =  password;

            this.IMAPserver = IMAPserver;
        }

        public String getIMAPserver() {
            return IMAPserver;
        }

        public EmailAccount setUser(String user) {
            this.user = user;
            return this;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }

        public EmailAccount setPassword(String password) {
            this.password = password;
            return this;
        }

    }

}
