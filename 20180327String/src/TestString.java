
public class TestString {

	public static void main(String[] args) {
		// 객체지향이란? 실제 세계를 모델링하여 소프트웨어를 개발하는 방법
		// procedure programming : 문제를 해결하는 절차 중요
		// object oriented programming
		
		// 모든 객체는 상태(state : 객체의 특징값/속성) 와 동작(behavior : 객체가 취할 수 있는 동작)을 가지고 있다.
		
		// String 클래스의 메소드
		
		int a = 10; // int형의 변수 a 생성 + 값 10을 a에 저장
		// string 객체 생성 방법 (String : 클라스의 이름)
		String str; // 클라스 스트링의 객체를 참조할 수 있는 참조 변수(레퍼런스 변수) 생성
		str = new String("Hello darkness my old friend.");// 객체 생성
		// a, str : 변수 
		// java 변수 크게 2가지 (1. 원시변수(primitive variable) : c로부터 / 2. 참조변수(reference variable) : 객체지향
		
		
		//String 객체의 길이
		//메소드 호출 방법: 참조변수.메소드()
		//System.out.println("string length is "+str.length());
		int len = str.length();
		
		System.out.println(str);
		
		System.out.println("string length is "+len);
		
		String str1;
		str1 = str.toLowerCase();
		System.out.println(str1);
		
		System.out.println(str.toUpperCase());
		
		
		
	}

}
