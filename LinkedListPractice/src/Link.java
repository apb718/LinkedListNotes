
public class Link {

	double dData;
	int iData;
	Link next;
	
	public Link() {
		iData = 0;
		dData = 0.0;
	}
	
	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink() {
		System.out.println("{"+iData+", " + dData+"} ");
	}
	
}
