
public class LinkedList {
	private Link first;
	
	public LinkedList(Link first) {
		this.first = first;
	}
	public LinkedList() {
		first = null;
	}
	
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		
		newLink.next = first;
		
		first = newLink;
	}
	
	public void deleteFirst() {
		first = first.next;
	}
	
	public boolean isEmpty() {
		if(first.next == null) {
			return true;
		}
		return false;
	}
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
}
