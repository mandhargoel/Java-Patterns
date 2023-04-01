package Basic.Patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// Triangle from max to min by column with numbers and stars both
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr=2 *n-1; //number of rows
		int nst=1; //number of stars
		int row=1;
		int val;
		while(row<=nr) {
			
			val=row;
			
			//work
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0) {
				System.out.print("*");
				}else {
					System.out.print(val);
				}
				cst++;
			}
			//prep
			System.out.println();
			if(row<=nr/2) {
				nst++;
			}else {
				nst--;
			}
			row++;
	}

   }
}
