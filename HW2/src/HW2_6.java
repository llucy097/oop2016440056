import java.util.Scanner;

public class HW2_6 {

	public static void main(String[] args) {
		// 어떤 양의 정수(n)를 입력 받아(만약 0이나 음의 정수를 입력하면, 
		// 에러 메시지를 띄운 뒤, 다시 입력하도록 처리), 
		// 그 수의 2n을 구하는 프로그램을 작성하시오.
		
		int a;
		Scanner input = new Scanner (System.in);
		
		System.out.println("n을 입력하시오: ");
		a = input.nextInt();
		
		while (a==0 || a<0) {
			System.out.println("에러입니다. 양의 정수를 입력하시오.");
			a = input.nextInt();
		}
		
		a = 2*a;
		System.out.println("2n은 : " + a);
		
		

	}

}
