class Student {
	
	String name ;
	int eid;
	double marks;
	boolean cardStatus = false;
	
	public Student(String name, int eid, double marks) {
		this.name=name;
		this.eid=eid;
		this.marks=marks;
	}
	public void showdetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.eid);
		System.out.println("Marks: "+this.marks);
		System.out.println("Card Status: "+this.cardStatus);
	}
}
class Library {
	static Student s1 = new Student("Keval", 1, 452.1);
	public static void issueCard() {
		System.out.println("Card Issued");
		s1.cardStatus = true;
		
	}
}
public class Aggregation {
	
	public static void main(String[] args) {
		Library.s1.showdetails();
		Library.issueCard();
		Library.s1.showdetails();
		
	}
}
