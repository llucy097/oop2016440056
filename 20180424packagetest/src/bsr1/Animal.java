package bsr1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//protect : 패키지 여부와 상관없이 상속됨
	// 동일 패키지 내에서는 public
	// 타 패키지에서는 private이지만 상속은 됨.
	protected String protectedField;
	
	public Animal() {
		
			publicField =  "public";
			privateField = "private";
			packageField = "package";
			protectedField = "protected";
			
	}
	
	
}
