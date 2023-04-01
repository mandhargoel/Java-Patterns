package Basic.Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// Number pattern pyramid with increasing number in column 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int val;
		//rows
		int row=1;
		while(row<=n) {
			
			val=1;
			
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("\t"); //tab
			}
			//stars work
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val + "\t"); 
				if(cst<=nst/2) {
					val++;
				}else {
					val--;
				}
			}
			System.out.println();
			nst= nst+2;
			nsp=nsp-1;
			row++;

		}

	}

}
