package StarPatterns;

//	   *******
//		*****
//		 ***
//		  *
   
public class Pyramid9 {

	public static void main(String[] args) {
		//method 1:
		for(int i=5; i>0;i--) {
			for(int j=5; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//Method 2:
//		for(int i= 1; i<=5; i++) {
//
//			for(int k=0;k<i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=4; j>=i;j--) {
//				System.out.print("*");
//			}
//			for(int l=3; l>=i;l--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
