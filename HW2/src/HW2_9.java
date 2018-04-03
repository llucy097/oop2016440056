import java.util.Scanner;

public class HW2_9 {

	public static void main(String[] args) {
		// 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
		// 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 
		// 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		
		
		int a, i;
		i = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1부터 9사이의 숫자 하나를 입력하시오.");
		
		
		
		while (true) {
			a = input.nextInt();
			if (a < 10 && a> 0) {
				System.out.println(a+"단");
				for (i=1; i<10; i++) {
					System.out.println(a + " X " + i + " = " + a*i);
				}
				break;
			}
			else {
				System.out.println("에러입니다. 1부터 9사이의 숫자를 다시 입력해 주세요.");
				continue;
			}
				
			
		}
		
		
	}

}
