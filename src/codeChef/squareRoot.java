package codeChef;
import java.io.*;
import java.util.Scanner;
class squareRoot {

	public static void main(String args[]) throws IOException {
		try {
		Scanner sc = new Scanner(System.in);
		display(input(sc));
		} catch (Exception e){
			return;
		}
	}


	public static double[] input(Scanner sc) throws NullPointerException{
		
		double testCase = sc.nextDouble();
		double A[] = new double [(int) testCase];
		double B[] = new double [(int) testCase];
		for (int i = 0 ;i < testCase ; i++){
			A[i] = sc.nextInt();
			B[i] = Math.sqrt(A[i]);
		}
		return B ;
	}

	public static void display(double[] num){
		int numLen = num.length;
		for (int i = 0 ; i < numLen ; i++){
			int op = (int) (num[i]);
			System.out.println(op);
		}
	}
}
