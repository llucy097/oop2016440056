import java.util.Scanner;

public class HW2_19 {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 
		// 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("소수 판별하기");
		
		int a; 
		System.out.print("숫자를 입력: ");
		a = input.nextInt();
		int i = 2;
		
		
		while (i <= a) {
			if (a==2) {
				System.out.println(a+"는 소수입니다.");
				break;
			}
			else {
				if (a%i != 0) {
					if (i == a-1) {
						System.out.println(a+"는 소수입니다.");
						break;
					
					}
					else {
						i++;
						continue;
					}
				}
			
			else
				System.out.println(a+"는 소수가 아닙니다.");
				break;
			}
		

	}

}
}
