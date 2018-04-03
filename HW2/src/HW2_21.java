import java.util.Scanner;

public class HW2_21 {

	public static void main(String[] args) {
		// 21. 사용자로부터 한 숫자를 입력받아, 
		// 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		
		System.out.println("숫자를 입력하시오.");
		
		
		int a, num, sum, count, i;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		num = 2;
		sum = 0;
		
		while ( num <= a) {
			count = 0;
			
			
			for (i = 2; i < num; i++) {
				if(num%i == 0) {
					count++;
				}
				if(count==0) {
					sum = sum + num;
					break;
				}
			}
			num++;	
			
			}
		System.out.println(a+"이하의 소수들의 합: " +sum );
		
		
		
	}

}
