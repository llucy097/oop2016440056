import java.util.Scanner;
import java.util.Random;

public class HW2_15 {

	public static void main(String[] args) {
		// 15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 
		// 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		// (10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로
		// Game Over 처리를 신랄하게 해 주기 바람)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("10번 이내로 1-100사이 랜덤한 숫자를 맞추시오.");
		int i, a;
		int rand = randomRange(1, 100);
		
		
		for (i = 1; i <= 10; i++ ) {
			System.out.println(i + "번째 입력: " );
			a = input.nextInt();
			if (rand == a) {
				System.out.println("정답입니다");
				break;
			}
			else if (rand > a) {
				System.out.println("입력하신 숫자보다 큽니다.");
				continue;
			}
			else 
				System.out.println("입력하신 숫자보다 작습니다.");
				continue;
		}
		if (i > 10)
			System.out.println("GAVE OVER");
		
	

	}
	
	
	int b = 1;
	int c = 100;
	private static int randomRange(int b, int c) {
		
		return (int) (Math.random()*(c-b+1)+b);
	}

}
