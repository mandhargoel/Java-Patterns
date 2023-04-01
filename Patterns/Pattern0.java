package Basic.Patterns;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// single star pattern in rows 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int row=1;row<=n;row++) {
			//work
			System.out.print("*");
			//preparation
			System.out.println("\n");
		}
	}

}
