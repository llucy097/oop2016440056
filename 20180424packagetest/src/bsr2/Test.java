package bsr2;
import bsr1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error : age is a private field
		
		//Dog aDog = new Dog(); Error : package가 다름
		
		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
//		bsr1.Dog aDog = new bsr1.Dog(); 
		
		//2. import 사용 (타 패키지의 클라스를 많이 사용할 때)하여 다른 패키지 삽입
		//package bsr1;
		//import bsr1.*;
		//~~~~
		Dog aDog = new Dog(); //import 명령어를 사용했기 때문에 문제 없이 사용 가능
		aDog.name = "happy";
		// aDog.IDN = "234345"; Error(private)
		
		// aDog.nickName = "kk"; Error : nickName은 패키지 접근지정
		
		Animal aa = new Animal();
//		aa.protectedField = "ddd";
		
		
		Rosemary rr = new Rosemary();
		//rr.protedtedField = "test";  외부에서 access 불가
		
		
		
	
	}

}
