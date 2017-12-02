//package codeChef;
import java.io.IOException;
import java.util.Scanner;

class balloon {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		while(tc-- >0){
			char arr[] = sc.next().toCharArray();
			System.out.println(Search(arr));
		}
	}

	public static int Search (char arr[]){
		int countA = 0;
		for(int i = 0;i<arr.length ; i++){
			if (arr[i]=='a'){
				countA ++ ;}
		}
		if ((arr.length -countA) > countA){
			return countA ;
		} else {return (arr.length -countA);
		}
	}
}
