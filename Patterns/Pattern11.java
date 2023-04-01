package Basic.Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// Number pattern pyramid
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n-1;
		
		//rows
		int row=1;
		while(row<=n) {
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			//stars work
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("1"); //can make a variable val=1 also
			}
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			System.out.println();
			nst= nst+2;
			nsp=nsp-1;
			row++;

	 }

  }
	
}