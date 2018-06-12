import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>(); //Ű�� ���ĺ� ����
		Map<String, String> map = new LinkedHashMap<>(); //������� �������
		//�߰�: .put(key, value)
		//valueã��: value = .get(key)
		
		map.put("����", "û�ʹ�");
		map.put("Ʈ����", "��ǰ�");
		map.put("����", "���");
		
		System.out.println(map.get("����"));
		
		//�ȴ� ���
		System.out.println("");
		System.out.println("keyset�� ����� �� keyset�� iterator ���");
		//��� 1 : keyset�� ����� �� keyset�� iterator ���
//		Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.set(): map�� ����� ��Ʈ��(key, value) �� key�� ���� set
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("�̸� : %s, ��°� : %s", key, map.get(key)));
		}
		
		System.out.println("");
		System.out.println("keyset�� ����� for()�ݺ��� ����ϱ�");
		//���2 : keyset�� ����� for()�ݺ��� ���
		for(String key : map.keySet()) {
			System.out.println(String.format("�̸� : %s, ��°� : %s", key, map.get(key)));
		}
		
		System.out.println("");
		System.out.println("entryset�� ����� ���");
		//���3 : entryset�� ����� ��� (���� �� set, set�� ������ ���Ҹ� elementary, Entry interface���
		for(Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("�̸� : %s, ��°� : %s", elem.getKey(), elem.getValue()));
		}
		
	}

}
