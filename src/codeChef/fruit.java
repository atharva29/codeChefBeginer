//package codeChef;
import java.io.IOException;
import java.util.Scanner;

class fruit {
	public static void main (String args []) throws IOException{
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		while (tc-- > 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			if (k >= Math.abs(n -m)){
				System.out.println(0);
			}else {
				System.out.println(Math.abs(n -m)-k);
			}
		}
	}
}