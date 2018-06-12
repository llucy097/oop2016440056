import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
		//strs = new HashSet<>();
		//strs = new TreeSet<>(); //���ĺ������� ���ĵǾ� ����
		strs = new LinkedHashSet<>();
		//�⺻�� �޼ҵ� add(), remove(), sweep...
		strs.add("Ʈ����");
		strs.add("����");
		strs.add("����");
		strs.add("��ǥ");
		
		//ù��° �ȴ� ��� : iterator ���
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { //������ �ȴ´�.
			String str = e.next(); //�ϳ��� ������.
			System.out.println(str);
		}
		
		//�ι�° �ȴ� ��� : for() �ݺ��� ���
		for (String str1: strs) { //for (���Ÿ�� ��������: �ݷ��Ǻ���)
			System.out.println(str1);
		}
		
	}

}
