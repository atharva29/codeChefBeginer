package codeChef;

import java.io.*;
import java.util.*;

class bitwiseOr {
	public static void main(String args[]) throws IOException{
		try {
			int total = 0;
			Scanner sc = new Scanner(System.in);
			int testCase = sc.nextInt();
			int ansArray [] = new int [testCase];


			for (int j =0 ; j< testCase ; j++){
				int elements = sc.nextInt();
				int arr [] = new int [elements];
				// this part is to give input to an array
				for (int i =0 ; i< elements ;i ++){
					arr[i] = sc.nextInt();
					total += arr[i] ; // this will add the array element 
				}
				System.out.println(total);
				ansArray [j] = total ; 	// this will store the additon in an answer array
				total = 0;				// to make total null such that previous total won't get added to current 1 
				//display(ansArray);
			}


		} catch (Exception e){

		}
	}


	public static void display(int ansArray[]){
		for (int i =0 ; i< ansArray.length ; i++){
			System.out.println(ansArray[i]);
		}
	}
}
