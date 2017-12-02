package codeChef;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class validTriangle {

	public static void main(String args[]) throws IOException ,java.lang.Exception {
		Scanner sc = new Scanner (System.in);
		// take number of test cases 
		int testCase = sc.nextInt();
		int X[] = new int [testCase];
		int Y[] = new int [testCase];
		int Z[] = new int [testCase];
		input1(X ,Y ,Z , testCase , sc);
	}

	public static void  input1 (int X[], int Y[] , int Z[] ,int testCase , Scanner sc){
		for (int i =0 ; i < testCase ; i++){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			Z[i] = sc.nextInt();
		}
		for (int j =0 ;j< testCase ; j++){
			if ((X[j] + Y[ j] + Z [j] ) == 180){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
