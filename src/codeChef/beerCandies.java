package codeChef;
import java.util.Scanner;


class beerCandies {

	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		boolean count = true ;
		int counter = 1 ;
		int step = 0 , A = 0 , B =0;
		while (tc-- > 0){
			if (step == 0){
				count = true ;
				counter = 1 ;
				A = sc.nextInt();
				B = sc.nextInt();
				step = 1 ;
			}
			else{
				while (count){
					if (counter %2 == 0){
						if (A >= counter){
						}else{System.out.println("Limak");
						count = false ;
						break ;}
					} else {
						if (B >= counter){
						}else{ System.out.println("Bob");
						count = false ;
						break ;}

					}
				}
				step = 0 ;
			}
		}

	}
}
