//package codeChef;

import java.io.IOException;
import java.util.Scanner;

class bearSegment {
	public static void main(String args []) throws  IOException{
		Scanner sc = new Scanner (System.in);
		// take input testCases 
		boolean check = false ;
		int testCases = sc.nextInt() ;
		int t = testCases ;
		while (t-- > 0){
			//			String test = sc.next();
			//			char  arr[] = test.toCharArray() ;
			//			int firstIndex = test.indexOf('1');
			//			int lastIndex = test.lastIndexOf('1');
			//			//System.out.println("First  " + firstIndex + "Lase " + lastIndex);
			//			for ( int i = firstIndex ; i < lastIndex ; i++){
			//				if (arr[i]=='0'){
			//					check = false ;
			//				}else {
			//					check = true ;
			//				}
			//			}
			//			if (check == false){
			//				System.out.println("NO");
			//			}else {
			//				System.out.println("YES");
			//			}
			System.out.println(check(sc));
		}
	}

	public static String check(Scanner sc){
		boolean check = false ;
		String test = sc.next();
		char  arr[] = test.toCharArray() ;
		int firstIndex = test.indexOf('1');
		int lastIndex = test.lastIndexOf('1');

		//System.out.println("First  " + firstIndex + "Lase " + lastIndex);
		if (firstIndex == -1){
			return "NO" ;
		}
		if (firstIndex == lastIndex && firstIndex != -1){
			check = true ;
			return "YES";
		}else {
			for ( int i = firstIndex  ; i < lastIndex ; i++){
				if (arr[i]=='0'){
					return  "NO" ;
				}
			}
			return "YES" ;
		}
		//}
//		return check; 
	}
}
