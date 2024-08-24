package eceptionHandling;

class Marriage{
	static void marry() throws MarriageException {
		int age=15;
		if(age>18) {
			System.out.println("Perfect age to get marry");
		}else {
			throw new MarriageException("Invalid age");
		}
	}
}

class MarriageException extends Exception{
	String msg;
	MarriageException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Marriage.marry();
}catch(MarriageException e) {
	System.out.println(e.getMessage());
}
	}

}
