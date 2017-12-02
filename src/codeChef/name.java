//package codeChef;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class name {
	public static void main(String args[]) throws IOException {
	
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt() ;
		while (tc-- > 0){
		int limLim = sc.nextInt() ;
		int bobLim = sc.nextInt() ;
		op(limLim , bobLim);
		}
	}

	public static void op (int l , int b){
		int lCandy = 0 , bCandy = 0 ,candy = 0 ;
//		int kj = 0 ;
//		if (l > b){
//			kj = l ;
//		}else {
//			kj = b ;
//		}
		for (candy = 1; candy <1500 ; candy ++){
			if (candy %2 == 1){
				if (l >= (lCandy + candy)){
					lCandy +=candy;
				}else {System.out.println("Bob");
				lCandy = 0;
				break ;
				}
			} else if (candy %2 == 0){
				if (b >= (bCandy + candy)){
					bCandy +=candy;
				}else {System.out.println("Limak");
				bCandy = 0;
				break ;
				}

			} 
		}
	}
}