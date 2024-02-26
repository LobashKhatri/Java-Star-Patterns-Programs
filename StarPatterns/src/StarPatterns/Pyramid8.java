package StarPatterns;

//	   *
//	  ***
//	 *****
//	*******


public class Pyramid8 {

	public static void main(String[] args) {		
		//Method 2:
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i;j--) {
				System.out.print(" ");
			}
			for(int k= 1; k<=i;k++) {
				System.out.print("*");
			}
			for(int l= 2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
