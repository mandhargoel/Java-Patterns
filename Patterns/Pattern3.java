package Basic.Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// Decreasing star in rows pattern
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=n; //no of stars
		int row=1; //rows
		while(row<=n) {
			//work
			int cst=1; //counter of stars
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst--;
			row++;
		}

	}

}
