package Basic.Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		//internal stars diamond design
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n/2;
		int row=1;
		while(row<=n) {
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			//star work
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			//prep
			System.out.println();
			if(row<=n/2) {
				nsp=nsp-1;
				nst=nst+2;
			}else {
				nsp=nsp+1;
				nst=nst-2;
			}
			row++;
		}

	}
	
}