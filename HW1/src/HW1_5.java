import java.util.Scanner;

public class HW1_5 {

	public static void main(String[] args) {
		// 5. 메뉴를 출력하고, 사용자로부터 입력을 받아 
		//선택된 메뉴를 출력하는 프로그램을 작성하시오.
		
		System.out.println("Choose one of the following.");
		String menu1 = "apple";
		String menu2 = "orange";
		String menu3 = "banana";
		String menu4 = "peach";
		
		System.out.println(menu1);
		System.out.println(menu2);
		System.out.println(menu3);
		System.out.println(menu4);
		System.out.print("enter your choice here: ");
		
		
		Scanner input = new Scanner(System.in);
		String choose;
		choose = input.next();
		
		if (choose.equals(menu1))
			System.out.println("Your choice is " + choose);
		else if (choose.equals(menu2))
			System.out.println("Your choice is " + choose);
		else if (choose.equals(menu3))
			System.out.println("Your choice is " + choose);
		else if (choose.equals(menu4))
			System.out.println("Your choice is " + choose);
		
		

	}

}
