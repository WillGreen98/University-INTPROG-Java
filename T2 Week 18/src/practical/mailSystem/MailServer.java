package practical.mailSystem;

/**
 * @author Will
 * Practical Week 18
 */

import java.util.ArrayList;
import java.util.Iterator;

public class MailServer {
	private ArrayList<MailItem> items;
	
	public MailServer() {
		items = new ArrayList<MailItem>();
	}
	
	public int amount_MailItems(String user) {
		return items.size();
	}
	
	public MailItem getNextMailItem(String user) {
		Iterator<MailItem> mail_Iterator = items.iterator();
		while(mail_Iterator.hasNext()) {
			MailItem item = (MailItem)mail_Iterator.next();
			if(item.getTo().equals(user)) {
				mail_Iterator.remove();
				return item;
			}
		}
		
		return null;
	}
	
	public void post(MailItem post_item) {
		items.add(post_item);
	}
}