class SendFile{
	public void sendingFile() {
		System.out.println("File is Sent");
	}
}
class ReceiveFile{
	public void receivingFile() {
		System.out.println("File is Received");
	}
}
class Hostspot {
	public static void connect(Object obj) {
		if(obj instanceof SendFile) {
			SendFile SDF = (SendFile) obj ;
			SDF.sendingFile();
		}
		else {
			ReceiveFile RDF = (ReceiveFile) obj ;
			RDF.receivingFile();
		}
	}
}
public class DerivedExample {

	public static void main(String[] args) {
		
		System.out.println("Sender Side");
		
		SendFile s1 = new SendFile();
		
		Hostspot.connect(s1);
		
		System.out.println("Receiver Side");
		
		ReceiveFile r1 = new ReceiveFile();
		
		Hostspot.connect(r1);
	}

}
