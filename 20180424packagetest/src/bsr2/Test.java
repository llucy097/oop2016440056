package bsr2;
import bsr1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error : age is a private field
		
		//Dog aDog = new Dog(); Error : package�� �ٸ�
		
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
//		bsr1.Dog aDog = new bsr1.Dog(); 
		
		//2. import ��� (Ÿ ��Ű���� Ŭ�󽺸� ���� ����� ��)�Ͽ� �ٸ� ��Ű�� ����
		//package bsr1;
		//import bsr1.*;
		//~~~~
		Dog aDog = new Dog(); //import ��ɾ ����߱� ������ ���� ���� ��� ����
		aDog.name = "happy";
		// aDog.IDN = "234345"; Error(private)
		
		// aDog.nickName = "kk"; Error : nickName�� ��Ű�� ��������
		
		Animal aa = new Animal();
//		aa.protectedField = "ddd";
		
		
		Rosemary rr = new Rosemary();
		//rr.protedtedField = "test";  �ܺο��� access �Ұ�
		
		
		
	
	}

}
