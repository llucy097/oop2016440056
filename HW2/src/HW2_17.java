
public class HW2_17 {
	
	public static void main(String[] args) {
		// 17. 1부터 100까지의 합을 for loop을 써서 구하는 프로그램을 작성하시오.
		
		int i, sum;
		sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합: "+sum);

	}
	
}
