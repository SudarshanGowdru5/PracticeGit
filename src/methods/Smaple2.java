package methods;

public class Smaple2 {
	
	String acBrand;
	char acGrade;
	int acPrice;
	
	Smaple2(String acBrand,char acGrade,	int acPrice){
		this.acBrand=acBrand;
		this.acGrade=acGrade;
		this.acPrice=acPrice;
	}
	public static void main(String[] args) {
		Smaple2 s1=new Smaple2("Blue", 'A', 20000);
		System.out.println(s1.acBrand);
		System.out.println(s1.acGrade);
		System.out.println(s1.acPrice);
	}
}
