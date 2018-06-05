
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("the box contain " + box.get());
		String str1 = "Mr."+box.get();
		System.out.println("the box gontain" + str1);
		
		
		box.set(str);
		//integer i; /primitive type Integer : referece type
		Integer i;
		//i = 3;
		System.out.println(1);
		//i = 1 + box.get();
		System.out.println("the box contain "+ box.get());
		
				
		i = new Integer(3);
		System.out.println(i);
		System.out.println("THE BOX CONTAIN : " + box.get());
		
		int a = 10;
		box.set(a); //autoboxing
		System.out.println("10"+box.get());
		
		//System.out.println(10+box.get()); error : box.get()의 반환형이 object, 10의 반환형이 int -> 계산 불가
		System.out.println(10+(Integer)box.get()); //형변환을 하면 가능!
		
		
		

	}

}
