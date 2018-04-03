
public class HW2_5 {

	public static void main(String[] args) {
		// 3. 1부터 100사이의 숫자(정수) 중에서 3의 공배수들의 총합을 출력하는 프로그램을 작성하시오.
				// 단, while문을 사용하여
				
				int i, sum;
				i = 1;
				sum = 0;
				
				do {
					if (i%3 == 0) {
						sum = sum + i;
						i++;
					}
					else
						i++;			
				} while (i <=100);
				System.out.println("3의 공배수의 총합: " + sum);

	}

}
