import java.util.*;

public class AnimalSing {
	List<Animal> list; 
	//상속 <Animal> -> Cat, Dog의 object를 다 넣을 수 있음
	//Animal의 자식클라스를 가질 수 있다.
	AnimalSing(){
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
//		Iterator : 반복자
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
//			(e.next()).sing();
			ele = e.next();
			ele.sing(); //Polymorphism
			//ele가 Animal인지 Dog인지 Cat인지 상관 no no : 모두 참조 가능
			//upcasting의 능력
			//Dynamic Binding : 실제 프로그램이 돌아갈 때 무엇인지 판단하여 결과 출력
			
		}
	}
}
