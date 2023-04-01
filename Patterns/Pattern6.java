package Basic.Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// Triangle from max to min by column
				Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int nr=2 *n-1; //number of rows
				int nst=1; //number of stars
				int row=1;
				while(row<=nr) {
					//work
					int cst=1;
					while(cst<=nst) {
						System.out.print("*");
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
