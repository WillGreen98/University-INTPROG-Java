package practical.mailSystem;

/**
 * @author Will
 * Practical Week 18
 */

public class MailItem {
	String to;
	String from;
	String subject;
	boolean urgent;
	String message;
	
	public MailItem(String to, String from, String subject, boolean urgent, String message) {
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.urgent = urgent;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMail() {
		System.out.println("To: " + to);
		System.out.println("From: " + from);
		System.out.println("Subject: " + subject);
		System.out.println("Urgent: " + urgent);
		System.out.println("Message: " + message);
	} 
}