package Basic.Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// Number pattern pyramid with increasing counting numbers in each line 
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
					int val=1;
					for(int cst=1;cst<=nst;cst++) {
						System.out.print(val); 
						val=val+1;
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
