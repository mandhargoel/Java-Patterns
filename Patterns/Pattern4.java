package Basic.Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// increasing stars in column
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp=n-1;//number of spaces
		int nst=1;//number of stars
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
			nsp--;
			nst++;
			row++;
		}
	}
}
