package Basic.Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		//external stars diamond design bottom only with last line change
				Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int nst=1;
				int nsp=2*n-3;
				
				//rows
				int row=1;
				while(row<=n) {
					//stars work
					for(int cst=1;cst<=nst;cst++) {
						System.out.print("*");
					}
					//spaces work
					for(int csp=1;csp<=nsp;csp++) {
						System.out.print(" ");
					}
					//stars work
					int cst=1;
					if(row==n) {
						cst=2; 	
					}
					for(;cst<=nst;cst++) {
						System.out.print("*");
					}
					System.out.println();
					nsp = nsp -2;
					nst= nst +1;
					row++;
				}

	}

}
