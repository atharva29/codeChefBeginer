//package codeChef;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class tryIt {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt() ;
		while (tc-- > 0){
			int N =sc.nextInt();
			int M =sc.nextInt();
			int arr[] = new int [N] ;

			for (int i = 0 ; i< arr.length ; i++){
				arr [i] = sc.nextInt() ;
			}

			int S = 0;
			for (int i = 0 ; i< M ; i++){
				S = sum(arr);
				arr = addElement(arr, S);
			}
			System.out.println(check(arr[arr.length-1]));
		}
	}

	public static int sum(int arr[]){
		int total = 0 ;
		for(int i = 0 ; i< arr.length ; i++){
			total += arr[i];
		}
		return total ;
	}

	public static int[] addElement(int[] a, int e) {
		a  = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

	public static String check (int K){
		if (K %2 == 0){
			return "even" ;
		}
		else {
			return "odd";
		}
	}
}
