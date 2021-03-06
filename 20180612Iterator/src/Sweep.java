import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
		//strs = new HashSet<>();
		//strs = new TreeSet<>(); //알파벳순으로 정렬되어 저장
		strs = new LinkedHashSet<>();
		//기본적 메소드 add(), remove(), sweep...
		strs.add("트럼프");
		strs.add("정은");
		strs.add("재인");
		strs.add("준표");
		
		//첫번째 훑는 방법 : iterator 사용
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { //끝까지 훑는다.
			String str = e.next(); //하나씩 빼낸다.
			System.out.println(str);
		}
		
		//두번째 훑는 방법 : for() 반복문 사용
		for (String str1: strs) { //for (요소타입 참조변수: 콜렉션변수)
			System.out.println(str1);
		}
		
	}

}
