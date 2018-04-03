import java.util.Scanner;

public class HW2_8 {

	public static void main(String[] args) {
		// 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		
		int a, i;
		i = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1부터 9사이의 숫자 하나를 입력하시오.");
		a = input.nextInt();
		System.out.println(a+"단");
		
		for (i=1; i<10; i++) {
			System.out.println(a + " X " + i + " = " + a*i);
		}

	}

}
