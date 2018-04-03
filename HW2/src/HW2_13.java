import java.util.Scanner;

public class HW2_13 {

	public static void main(String[] args) {
		// 13. month와 day를 입력 받아, 1월 1일부터의 
		// 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) 
		// 1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		
		System.out.println("mondth와 day를 입력하세요.");
		int m, d, total;
		Scanner input = new Scanner(System.in);
		total = 0;
		System.out.println("month: ");
		m = input.nextInt();
		System.out.println("day: ");
		d = input.nextInt();
		
		
		System.out.print("1월 1일부터 "+m+"월 "+d+"일까지 총 day수: ");
		
		switch (m) {
		case 1:
			total = 0;
			break;
		case 2:
			total = 31;
			break;
		case 3:
			total = 31+28;
			break;
		case 4:
			total = 31*2+28;
			break;
		case 5:
			total = 31*2+28+30;
			break;
		case 6:
			total = 31*3+28+30*1;
			break;
		case 7:
			total = 31*3+28+30*2;
			break;
		case 8:
			total = 31*4+28+30*2;
			break;
		case 9:
			total = 31*5+28+30*2;
			break;
		case 10:
			total = 31*5+28+30*3;
			break;
		case 11:
			total = 31*6+28+30*3;
			break;
		case 12:
			total = 31*6+28+30*4;
			break;
		
	}
		total = total+d;
		System.out.println(total);
		
		
		
	}

}
