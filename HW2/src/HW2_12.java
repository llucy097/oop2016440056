import java.util.Scanner;

public class HW2_12 {

	public static void main(String[] args) {
		// 12. for문(while)의 무한 반복과 break 문을 이용하여
		// 0이 입력될 때까지 입력 받은 정수 중 가장 큰 정수를 출력하는 프로그램을 작성하시오.
		
		int a, num, max;
		max = 0;
		System.out.println("정수를 입력하시오.");
		
		Scanner input = new Scanner (System.in);
		while (true) {
			a = input.nextInt();
			
			num = a;
			if (num > max) 
				max = num;
			
			if (a != 0) {
				continue;
			}
			else
				System.out.println("가장 큰 정수: "+max);
				break;
		}
		
	}

}
