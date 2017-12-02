//package codeChef;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class similarDishes {
	public static void main(String args[])  throws IOException{
		int check = 0;

		String arr[] = new String [4] ;
		String brr[] = new String [4] ;

		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		while (tc-- >0){
			for (int i = 0 ;  i< 4 ; i ++){
				arr[i] = sc.next();
			}
			for (int i = 0 ;  i< 4 ; i ++){
				brr[i] = sc.next();
			}
			//Arrays.sort(arr);
			//Arrays.sort(brr);
			// following block perform comparison between two arrays 
			for ( int j = 0 ; j < 4 ; j++){	
				for (int i = 0 ; i < 4 ;i++){
					if (arr[j].equals(brr[i])){
						check ++ ;
					}
				}
			}
			//System.out.println("check : " +check );
			if (check >=2 ){
				System.out.println("similar");
			} else {
				System.out.println("dissimilar");
			}
			check = 0 ;


		}
	}
}
