
public class HW2_23 {

	public static void main(String[] args) {
		// 23.
		//***** *
		//*** ***
		//* *****

		//를 출력하시오(반복문 써서!)

		
		int i;
		int j;
		int num = 6;
		
		for (i = 0; i<3; i++) {
			for (j = 0; j < 7; j++) {
				
				if (j==num) {
					System.out.print(" ");
					num -= 2;
				}
			
				
				System.out.print("*");
				continue;
			}
			System.out.println("");
			continue;
			
		}
		
		
		

	}

}
