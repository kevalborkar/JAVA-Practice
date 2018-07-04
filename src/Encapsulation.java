class WowClass{
	private String SecretMsg;
	private int pincode ;
	
	public String getSecretMsg(int pin) {
		if(pin ==pincode) {
			return SecretMsg;
		}
		else {
			return "Invalid Pin Entered";
		}
	}
	public void setSecretMsg(String secretMsg ,int pin) {
		if(pin==pincode) {
			this.SecretMsg = secretMsg;
		}
		
	}
	public int getPincode() {
		
		return pincode;	
	}
	
	public void setPincode(int pin) {
		this.pincode = pin;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		WowClass Wowobj = new WowClass();
		Wowobj.setPincode(1234);
		int pin = Wowobj.getPincode();
		Wowobj.setSecretMsg("I Love SomeOne", pin);
		
		String TEXT = Wowobj.getSecretMsg(1234);
		
		System.out.println("Secret Message: " + TEXT);
		
	}

}
