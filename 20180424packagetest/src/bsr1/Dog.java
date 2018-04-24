package bsr1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	
	String nickName; //package 접근지정: package 내에서만 public처럼 사용됨
	
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	
	
	
	}
	

}
