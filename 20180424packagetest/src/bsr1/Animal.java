package bsr1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//protect : ��Ű�� ���ο� ������� ��ӵ�
	// ���� ��Ű�� �������� public
	// Ÿ ��Ű�������� private������ ����� ��.
	protected String protectedField;
	
	public Animal() {
		
			publicField =  "public";
			privateField = "private";
			packageField = "package";
			protectedField = "protected";
			
	}
	
	
}
