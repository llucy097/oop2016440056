import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//upcasting
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		
		list.add(1, "��");
//		list.remove(1);
//		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		List<String> Llist = new LinkedList<String>(); //���� ����� ����
		//LinkedList<String> Llist = new LinkedList<String>();
		Llist.add(0, "zero");
		Llist.add("one");
		Llist.add("two");
		
		Llist.add(1, "��");
		
		System.out.println(Llist);
		

	}

}
