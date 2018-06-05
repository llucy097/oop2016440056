
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String ("Hello");
		
		box.set(str);
		System.out.println("The box has " + box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		ibox.set(i);
		// ibox.set(new String("Chois")); error : Integer를 저장해야 하는 box에 String 저장시 오류발생
		System.out.println("The box has " + ibox.get());
		System.out.println(100 + ibox.get());
		
		
		Box<Double> dbox = new Box<>();
		Double d = new Double(3.14);
		dbox.set(d);
		System.out.println(dbox.get());
		
		
		
	}

}
