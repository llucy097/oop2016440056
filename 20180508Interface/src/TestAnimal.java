import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
//		//error aaa.eat();
		//우변의 클라스가 좌변 클라스의 subclass이면 전혀 문제 없다. 좌변<--우변 => Upcasting
		Animal aaa = new Dog();
		//Animal aaa = (Animal) new Dog(); 13번 줄과 같은 표현
		// Overriding한 메소드를 호출하면 subclass의 메소드를 수행한다.
		aaa.sing();
		
		aaa = new Cat();
		aaa.sing();
		//polymorphism(다형성)
		//1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		//2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		//3. SuperClass SuperRefVar = new SubClass();
		//4. superRefVar.overrideMethod(); ->  객체의 클라스가 구현한 메소드를 실행한다./ upcasting 가능해야 함
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) 	aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); //동적 바인딩(Dynamic Binding): 프로그램 수행 시 호출할 메소드를 결정한다.
		//error 추상 클라스의 객체를 만들 수 없다. aaa = new Animal();
		
		int a;
		a = (int) 3.1; //형변환(= type casting)
		System.out.println(a);
		

	}

}
