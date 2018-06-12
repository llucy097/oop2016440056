import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>(); //키의 알파벳 순서
		Map<String, String> map = new LinkedHashMap<>(); //집어넣은 순서대로
		//추가: .put(key, value)
		//value찾기: value = .get(key)
		
		map.put("재인", "청와대");
		map.put("트럼프", "백악관");
		map.put("정은", "평양");
		
		System.out.println(map.get("재인"));
		
		//훑는 방법
		System.out.println("");
		System.out.println("keyset을 만들어 이 keyset의 iterator 사용");
		//방법 1 : keyset을 만들어 이 keyset의 iterator 사용
//		Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.set(): map에 저장된 엔트리(key, value) 중 key만 모은 set
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("이름 : %s, 사는곳 : %s", key, map.get(key)));
		}
		
		System.out.println("");
		System.out.println("keyset를 만들어 for()반복문 사용하기");
		//방법2 : keyset을 만들어 for()반복문 사용
		for(String key : map.keySet()) {
			System.out.println(String.format("이름 : %s, 사는곳 : %s", key, map.get(key)));
		}
		
		System.out.println("");
		System.out.println("entryset을 만드는 방법");
		//방법3 : entryset을 만드는 방법 (페어로 된 set, set의 각각의 원소를 elementary, Entry interface사용
		for(Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("이름 : %s, 사는곳 : %s", elem.getKey(), elem.getValue()));
		}
		
	}

}
