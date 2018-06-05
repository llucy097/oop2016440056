import java.util.*;

public class AnimalSing {
	List<Animal> list; 
	//��� <Animal> -> Cat, Dog�� object�� �� ���� �� ����
	//Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�.
	AnimalSing(){
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
//		Iterator : �ݺ���
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
//			(e.next()).sing();
			ele = e.next();
			ele.sing(); //Polymorphism
			//ele�� Animal���� Dog���� Cat���� ��� no no : ��� ���� ����
			//upcasting�� �ɷ�
			//Dynamic Binding : ���� ���α׷��� ���ư� �� �������� �Ǵ��Ͽ� ��� ���
			
		}
	}
}
