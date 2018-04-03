
public class HW2_25 {

	public static void main(String[] args) {
		//25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		// (1) *********** 
		// (2)54321012345
		// ********* 432101234
		// ******* 3210123
		// ***** 21012
		// *** 101
		// * 0
		// *** 101 
		// ***** 21012 
		// ******* 3210123 
		// ********* 432101234 
		// *********** 54321012345
		
		int i, j, num;
		
		
		
		for(i=5; i>=0; i--) {
            for(j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (num = i; num >= 0; num--) {
                System.out.print(num);
            }
            for (num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
		
		for(i=1; i<=5; i++) {
            for(j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (num = i; num >= 0; num--) {
                System.out.print(num);
            }
            for (num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }




		

	}

}
