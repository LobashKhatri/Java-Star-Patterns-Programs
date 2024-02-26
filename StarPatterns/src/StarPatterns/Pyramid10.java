package StarPatterns;


//	*
//	 *
//	  *
//	   *
//	    *


public class Pyramid10 {

	public static void main(String[] args) {
		//Method 1:
//		for(int i=1; i<6; i++) {
//			for(int j=2;j<=i;j++) {
//				System.out.print("0");
//			}
//			System.out.println("*");
//		}
		
		//Method 2:
		for(int i=1; i<5;i++) {
			for(int j=1; j<=i;j++) {
				if (i>1 && j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
