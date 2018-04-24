package bsr;

public class Dog extends Animal {
	public Dog() { // default constructor, implicit way
		System.out.println("Dog Default Constructor");
	} //Dog에 대한 특수 property만 다룸
	
//	public Dog() { explicit way
//		super(); //명시적 superclass의 생성자 호출, 명시적이지 않아도 암묵적으로 실행됨.
//		System.out.println("Dog Constructor");
//	}
//	public Dog(int a) { 
//		//암묵적 수퍼클라스 생성자 호출 
//		//public Animal(int a)가 있더라도 default를 불러옴
//		System.out.println("Dog Int Constructor");
//	}
	
	public Dog(int a) {// explicit way
	super(a); //명시적 superclass의 생성자 호출
	//명시적으로 밝혀야지만 int로 불러올 수 있음
	System.out.println("Dog Int Constructor");
}


}
