package Basic.Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// decreasing stars in column
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp=0;//number of spaces
		int nst=n;//number of stars
		int row=1;
		while(row<=n) {
			//spaces work
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//stars work
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp++;
			nst--;
			row++;
		}
	}
}


