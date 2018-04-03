
public class HW2_4 {

	public static void main(String[] args) {
		// 3. 1부터 100사이의 숫자(정수) 중에서 3의 공배수들의 총합을 출력하는 프로그램을 작성하시오.
		// 단, for문을 사용하여
		
		int i, sum;
		sum = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				sum = sum + i;
			}
			else
				sum = sum;
				
		}
		System.out.println("3의 공배수의 총합: " + sum);
		
	}

}
