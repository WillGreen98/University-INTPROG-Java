package practical.mailSystem;

/**
 * @author Will
 * Practical Week 18
 */

import java.util.ArrayList;

public class MailServer {
	private ArrayList<MailItem> items;
	
	public MailServer() {
		items = new ArrayList<MailItem>();
	}
	
	public int amount_MailItems(String user) {
		return items.size();
	}
	
	public MailItem getNextMailItem(String user) {
		return null;
	}
	
	public MailItem post() {
		return null;
	}
}