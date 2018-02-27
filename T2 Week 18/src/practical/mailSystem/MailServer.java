package practical.mailSystem;

/**
 * @author Will
 * Practical Week 18
 */

import java.util.ArrayList;

public class MailServer {
	private MailClient client;
	private ArrayList<MailItem> items;
	
	public MailServer() {
		items = new ArrayList<MailItem>();
	}
	
	public int amount_MailItems(String user) {
		return items.size();
	}
	
	//TODO fix function
	public MailItem getNextMailItem(String user) {
		return null;
	}
	
	//TODO fix function
	public MailItem post(MailItem post_item) {
		return null;
	}
}