package bsr1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.name = "Tina";
		// tina.IDN = "32459098"; Error : IDN is a private field
		
		tina.nickName = "tt";
		
		tina.publicField = "U2"; // ��� ����
		//tina.privateField = "Sting"; // ��� �Ұ�
		tina.packageField = "Ed"; // ��Ű�� �ȿ����� ��� ����
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
		
		
		
		
	}

}
