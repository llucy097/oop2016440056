
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		
	}
	@Override // annotation : method overriding �Ѵٴ� ���� ����!
	public void sing() {
		System.out.println(name + " " + "�߿�");
	}

}
