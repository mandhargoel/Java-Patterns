package Basic.Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// increasing star in rows pattern
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1; //no of stars
		int row=1; //rows
		while(row<=n) {
			//work
			int cst=1; //counter of stars
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//prep
			System.out.println();
			nst++;
			row++;
		}

	}

}
