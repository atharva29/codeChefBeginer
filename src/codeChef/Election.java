package codeChef;

import java.io.IOException;
import java.util.*;

class Election {
	public static void main(String args[])  throws IOException{
		String votes = "";
		try {
			Scanner sc = new Scanner(System.in);
			int testCase = sc.nextInt();
			String  ans[] = new String [testCase];
			for (int i = 0 ; i <testCase ; i++){

				votes = sc.next();
				ans [i] = result(votes);
			}
			display(ans);
		}catch (Exception e){

		}
	}

	public static void display(String ansArray[]){
		for (int i =0 ; i< ansArray.length ; i++){
			System.out.println(ansArray[i]);
		}
	}

	public static String result (String votes){
		char res[] = votes.toCharArray();
		int mongooseNum = 10 , snakeNum = 10 ;
		for (int i =0 ;i < votes.length(); i++){
			if (res [i]== 'm')	{
				if (i != 1){
				if (res[i+1] =='s'){
					snakeNum -=1;
					res[i+1]= '*';
				}
				else if (res[i-1] =='s'){
					snakeNum -=1;
					res[i-1]= '*';
				}
				}
				mongooseNum +=1;
			}
			else if (res [i]== 's')	{
				snakeNum +=1;
			}
		}
		//int temp2  =snakeNum - 1 ;
//		if (snakeNum == 1 && mongooseNum == 0){
//			return "snakes";
//		}
//
//		if (mongooseNum == snakeNum  && mongooseNum != 0 || mongooseNum > snakeNum && mongooseNum != 0){
//			return "mongooses";
//		}
//		else if (mongooseNum == temp2){
//			return "tie";
//		}
//		else {
//			return "snakes";
//		}
		if (snakeNum > mongooseNum){
			return "snakes";
		} 
		else if (snakeNum < mongooseNum){
			return "mongooses";
		} 
		else {
			return "tie";
		}
	}
}
