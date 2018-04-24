package bsr1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.name = "Tina";
		// tina.IDN = "32459098"; Error : IDN is a private field
		
		tina.nickName = "tt";
		
		tina.publicField = "U2"; // 상속 가능
		//tina.privateField = "Sting"; // 상속 불가
		tina.packageField = "Ed"; // 패키지 안에서만 상속 가능
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
		
		
		
		
	}

}
