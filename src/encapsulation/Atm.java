package encapsulation;

class Pwd{
	private int pwd;
	int getPwd() {
		return pwd;
	}
	void setPwd(int pwd) {
		this.pwd=pwd;
	}
}
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pwd p1=new Pwd();
		p1.setPwd(4839);
		System.out.println(p1.getPwd());
	}

}
