
public class TestString {

	public static void main(String[] args) {
		
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		
		System.out.println(str1==str2);//객체의 내용(주소, reference 값)가 다르기 때문에 false 리터럴로 반환
		System.out.println(str1.equals(str2));//두 객체의 내용이 같은지 검사
		
		str1 = str2; // reference값이 같다는 뜻, 같은 객체를 참조하고 있다는 뜻
		System.out.println(str1 == str2);
		
		
		
		
		
	}

}
