package practical.mailSystem;

/**
 * @author Will
 * Practical Week 18
 */

public class MailClient {
    private MailServer server;  // this is the send / receive server
    private String user;
    
    public MailClient(MailServer mailServer, String userName) {
        server = mailServer;  
        user = userName;
    }
    
    public void printNextMailItem() {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        } else {
            item.printMail();
        }
    }
    
    public void sendMailItem(String to, String subject, boolean urgent, String message) {
        MailItem item = new MailItem(to, user, subject, urgent, message);
        server.post(item);
    }
}

