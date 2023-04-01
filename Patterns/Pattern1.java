package Basic.Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		//rows and column star pattern
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
	    while(row<=n){
			int col=1;
			while(col<=n) {
				System.out.print("*");
			    col++;     
			}
			System.out.println();
			row++;
			}
		scn.close();
		}

	}


