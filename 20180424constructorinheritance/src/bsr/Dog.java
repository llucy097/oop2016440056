package bsr;

public class Dog extends Animal {
	public Dog() { // default constructor, implicit way
		System.out.println("Dog Default Constructor");
	} //Dog�� ���� Ư�� property�� �ٷ�
	
//	public Dog() { explicit way
//		super(); //����� superclass�� ������ ȣ��, ��������� �ʾƵ� �Ϲ������� �����.
//		System.out.println("Dog Constructor");
//	}
//	public Dog(int a) { 
//		//�Ϲ��� ����Ŭ�� ������ ȣ�� 
//		//public Animal(int a)�� �ִ��� default�� �ҷ���
//		System.out.println("Dog Int Constructor");
//	}
	
	public Dog(int a) {// explicit way
	super(a); //����� superclass�� ������ ȣ��
	//��������� ���������� int�� �ҷ��� �� ����
	System.out.println("Dog Int Constructor");
}


}
