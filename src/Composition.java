class Attachment{
	String name;
	String type;
	double size;
	
	public Attachment (String name,	String type,double size){
		this.name= name;
		this.type= type;
		this.size= size;
	}
	public void showAttachment(){
		System.out.println("Attachment Name:"+name);
		System.out.println("Attachment Type:"+type);
		System.out.println("Attachment Size:"+size+"kb");
	}
}
class Email {
	String sender;
	String subject;
	String msg;
	Attachment atch;
	
	public Email (String sender,String subject,	String msg){
		this.sender= sender;
		this.subject= subject;
		this.msg= msg;
		atch = new Attachment("Keval-Resume.pdf","pdf",124);
	}
	
	public void open(){
		System.out.println("Sender : "+sender);
		System.out.println("Subject: "+subject);
		System.out.println("Message: "+msg);
		System.out.println("Attachment details ");
		atch.showAttachment();
	}
	
}
public class Composition {

	public static void main(String[] args) {
		Email e1 = new Email("keval@gmail.com", "Application for job", "Hire Me!!");
		e1.open();
	}

}
